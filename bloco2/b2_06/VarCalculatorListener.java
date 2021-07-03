// Generated from VarCalculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VarCalculatorParser}.
 */
public interface VarCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VarCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VarCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VarCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VarCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VarCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(VarCalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VarCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(VarCalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link VarCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssign(VarCalculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link VarCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssign(VarCalculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(VarCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(VarCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDouble(VarCalculatorParser.ExprDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDouble(VarCalculatorParser.ExprDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(VarCalculatorParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(VarCalculatorParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(VarCalculatorParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(VarCalculatorParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(VarCalculatorParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link VarCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(VarCalculatorParser.ExprIDContext ctx);
}