import java.util.HashMap;

public class Interpreter extends VarCalculatorBaseVisitor<Double> {

   HashMap<String,Double> variables = new HashMap<String,Double>(); 

   @Override public Double visitProgram(VarCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(VarCalculatorParser.StatContext ctx) {
      Double result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
         if (result != null) {
            System.out.println("Result: " + result);
         }
      }

      if (ctx.assignment() != null) {
         //visit(ctx.assignment());
         result = visit(ctx.assignment());
         if (result != null) {
            System.out.println("Result: " + result);
         }

      }
      return result;
   }

   @Override public Double visitAssign(VarCalculatorParser.AssignContext ctx) {

      String identification = ctx.ID().getText();
      Double value = visit(ctx.expr());     
      variables.put(identification,value);

      return value;
   }

   @Override public Double visitExprDouble(VarCalculatorParser.ExprDoubleContext ctx) {
      return Double.parseDouble(ctx.getText());
   }

   @Override public Double visitExprParent(VarCalculatorParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitExprID(VarCalculatorParser.ExprIDContext ctx) {
      String id = ctx.ID().getText();
      if ( variables.containsKey(id) ) return variables.get(id);
      System.out.println(id + " doesn't exist.");
      return 0.0;
   }

   @Override public Double visitExprMulDiv(VarCalculatorParser.ExprMulDivContext ctx) {

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
      }
      return result;
   }

   @Override public Double visitExprAddSub(VarCalculatorParser.ExprAddSubContext ctx) {

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
}
