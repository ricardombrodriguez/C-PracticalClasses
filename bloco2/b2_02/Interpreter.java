public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = null;
      res = visit(ctx.expr());
      if (res!=null) System.out.println("Result: "+res);
      return res;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double result = null;
      Double e1 = visit(ctx.expr(0));
      Double e2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch (op){
         case "*":
            result = e1 * e2;
            break;   
         case "/":
            if (e2 == 0) System.out.println("Erro: Não se pode dividir por zero");
            else result = e1 / e2;
            break;
         case "+":
            result = e1 + e2;
            break;
         case "-":
            result = e1 - e2;
            break;
      }
      return result;
   }
}
