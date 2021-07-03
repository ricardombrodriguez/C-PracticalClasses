// Generated from PrefixCalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrefixCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrefixCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrefixCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PrefixCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PrefixCalcParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrefix}
	 * labeled alternative in {@link PrefixCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrefix(PrefixCalcParser.ExprPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link PrefixCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(PrefixCalcParser.ExprNumberContext ctx);
}