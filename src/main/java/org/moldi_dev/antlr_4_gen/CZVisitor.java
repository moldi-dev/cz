// Generated from /home/moldi/Desktop/Facultate/FLT/C-Z/src/main/java/org/moldi_dev/CZ.g4 by ANTLR 4.13.2
package org.moldi_dev.antlr_4_gen;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CZParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CZVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CZParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CZParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#headers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaders(CZParser.HeadersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#define_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_directive(CZParser.Define_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(CZParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CZParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(CZParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(CZParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CZParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CZParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CZParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(CZParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(CZParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#default_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_block(CZParser.Default_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(CZParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(CZParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CZParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CZParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_function(CZParser.Standard_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CZParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CZParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CZParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(CZParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(CZParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CZParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(CZParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(CZParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(CZParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(CZParser.For_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CZParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CZParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CZParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CZParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(CZParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(CZParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CZParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(CZParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(CZParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(CZParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CZParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(CZParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpression(CZParser.BitwiseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CZParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(CZParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(CZParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CZParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(CZParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(CZParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CZParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(CZParser.Type_Context ctx);
}