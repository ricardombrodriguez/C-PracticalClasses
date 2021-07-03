public class Interpreter extends CalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      Double result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
         if (result != null) {
            System.out.println("Result: " + result);
         }
      }
      return result;
   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {

      String op = ctx.op.getText();
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      Double result = null;
      switch (op) {
         case "+":
            result = num1 + num2;
            break;
         case "-":
            result = num1 - num2;
            break;
      }

      return result;
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Double.parseDouble(ctx.getText());
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {

      String op = ctx.op.getText();
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      Double result = null;
      switch (op) {
         case "*":
            result = num1 * num2;
            break;
         case "/":
            result = num1 / num2;
            break;
         case "%":
            result = num1 % num2;
            break;
      }

      return result;

   }
}
