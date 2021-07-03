public class Interpreter extends PrefixCalcBaseVisitor<Double> {

   @Override public Double visitProgram(PrefixCalcParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(PrefixCalcParser.StatContext ctx) {
      Double result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
         if (result != null) {
            System.out.println("Result: " + result);
         }
      }
      return result;
   }

   @Override public Double visitExprPrefix(PrefixCalcParser.ExprPrefixContext ctx) {

      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Double result = null;

      switch(op){
         case "+":
            result = num1 + num2;
            break;
         case "-":
            result = num1 - num2;
            break;
         case "*":
            result = num1 * num2;
            break;
         case "/":
            result = num1 / num2;
            break;
      }

      return result;
   }

   @Override public Double visitExprNumber(PrefixCalcParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.getText());
   }
}
