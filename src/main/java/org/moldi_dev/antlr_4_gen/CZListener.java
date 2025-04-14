// Generated from /home/moldi/Desktop/Facultate/FLT/C-Z/src/main/java/org/moldi_dev/CZ.g4 by ANTLR 4.13.2
package org.moldi_dev.antlr_4_gen;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CZParser}.
 */
public interface CZListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CZParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CZParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CZParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#define_directive}.
	 * @param ctx the parse tree
	 */
	void enterDefine_directive(CZParser.Define_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#define_directive}.
	 * @param ctx the parse tree
	 */
	void exitDefine_directive(CZParser.Define_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(CZParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(CZParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CZParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CZParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(CZParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(CZParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(CZParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(CZParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CZParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CZParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CZParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CZParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CZParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CZParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(CZParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(CZParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(CZParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(CZParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#default_block}.
	 * @param ctx the parse tree
	 */
	void enterDefault_block(CZParser.Default_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#default_block}.
	 * @param ctx the parse tree
	 */
	void exitDefault_block(CZParser.Default_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(CZParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(CZParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(CZParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(CZParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CZParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CZParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CZParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CZParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(CZParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(CZParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CZParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CZParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CZParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CZParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CZParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CZParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(CZParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(CZParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(CZParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(CZParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CZParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CZParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(CZParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(CZParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(CZParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(CZParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(CZParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(CZParser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CZParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CZParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CZParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CZParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CZParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CZParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CZParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CZParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(CZParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(CZParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(CZParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(CZParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CZParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CZParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(CZParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(CZParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(CZParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(CZParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(CZParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(CZParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CZParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CZParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(CZParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(CZParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpression(CZParser.BitwiseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpression(CZParser.BitwiseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CZParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CZParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(CZParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(CZParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(CZParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link CZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(CZParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CZParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CZParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(CZParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(CZParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(CZParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(CZParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CZParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(CZParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CZParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(CZParser.Type_Context ctx);
}