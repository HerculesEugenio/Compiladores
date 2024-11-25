// Generated from DSLive.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLiveParser}.
 */
public interface DSLiveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#pilha}.
	 * @param ctx the parse tree
	 */
	void enterPilha(DSLiveParser.PilhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#pilha}.
	 * @param ctx the parse tree
	 */
	void exitPilha(DSLiveParser.PilhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(DSLiveParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(DSLiveParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#apagarPilha}.
	 * @param ctx the parse tree
	 */
	void enterApagarPilha(DSLiveParser.ApagarPilhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#apagarPilha}.
	 * @param ctx the parse tree
	 */
	void exitApagarPilha(DSLiveParser.ApagarPilhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#nome_pilha}.
	 * @param ctx the parse tree
	 */
	void enterNome_pilha(DSLiveParser.Nome_pilhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#nome_pilha}.
	 * @param ctx the parse tree
	 */
	void exitNome_pilha(DSLiveParser.Nome_pilhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(DSLiveParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(DSLiveParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(DSLiveParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(DSLiveParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#get_Top}.
	 * @param ctx the parse tree
	 */
	void enterGet_Top(DSLiveParser.Get_TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#get_Top}.
	 * @param ctx the parse tree
	 */
	void exitGet_Top(DSLiveParser.Get_TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLiveParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(DSLiveParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLiveParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(DSLiveParser.TokenContext ctx);
}