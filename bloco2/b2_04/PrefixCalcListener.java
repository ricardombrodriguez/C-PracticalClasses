// Generated from PrefixCalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrefixCalcParser}.
 */
public interface PrefixCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrefixCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PrefixCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PrefixCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PrefixCalcParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PrefixCalcParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrefix}
	 * labeled alternative in {@link PrefixCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrefix(PrefixCalcParser.ExprPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrefix}
	 * labeled alternative in {@link PrefixCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrefix(PrefixCalcParser.ExprPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link PrefixCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(PrefixCalcParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link PrefixCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(PrefixCalcParser.ExprNumberContext ctx);
}