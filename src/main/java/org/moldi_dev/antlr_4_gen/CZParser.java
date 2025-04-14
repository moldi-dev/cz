// Generated from /home/moldi/Desktop/Facultate/FLT/C-Z/src/main/java/org/moldi_dev/CZ.g4 by ANTLR 4.13.2
package org.moldi_dev.antlr_4_gen;

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CZParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, CHAR=3, STRING=4, ARRAY_INT=5, ARRAY_DOUBLE=6, ARRAY_STRING=7, 
		PRINT=8, READ=9, IF=10, ELSE=11, WHILE=12, FOR=13, BREAK=14, CONTINUE=15, 
		TRUE=16, FALSE=17, RETURN=18, MAIN=19, SWITCH=20, CASE=21, DEFAULT=22, 
		QUESTION=23, COLON=24, SEMICOLON=25, COMMA=26, LEFT_PARANTHESIS=27, RIGHT_PARANTHESIS=28, 
		LEFT_BRACE=29, RIGHT_BRACE=30, LEFT_BRACKET=31, RIGHT_BRACKET=32, ASSIGNMENT=33, 
		MODULUS=34, EQUALS=35, NOT=36, NOT_EQUALS=37, LESS_THAN=38, GREATER_THAN=39, 
		LESS_THAN_OR_EQUAL=40, GREATER_THAN_OR_EQUAL=41, ADDITION=42, SUBTRACTION=43, 
		MULTIPLICATION=44, POWER=45, DIVISION=46, LOGICAL_AND=47, LOGICAL_OR=48, 
		BITWISE_AND=49, BITWISE_OR=50, BITWISE_XOR=51, BITWISE_NOT=52, SHIFT_LEFT=53, 
		SHIFT_RIGHT=54, SINE=55, COSINE=56, TANGENT=57, COTANGENT=58, ARCSINE=59, 
		ARCCOSINE=60, ARCTANGENT=61, ARCCOTANGENT=62, ARRAY_LENGTH=63, ARRAY_AT=64, 
		ARRAY_CONTAINS=65, ARRAY_INDEX_OF=66, ARRAY_COUNT=67, ARRAY_SORT=68, ARRAY_REVERSE=69, 
		ARRAY_INSERT_FIRST=70, ARRAY_INSERT_AT=71, ARRAY_INSERT_LAST=72, ARRAY_DELETE_FIRST=73, 
		ARRAY_DELETE_AT=74, ARRAY_DELETE_LAST=75, STRING_LITERAL=76, CHARACTER=77, 
		INTEGER_NUMBER=78, DOUBLE_NUMBER=79, IDENTIFIER=80, COMMENT=81, WS=82, 
		UNEXPECTED_CHAR=83;
	public static final int
		RULE_program = 0, RULE_main_function = 1, RULE_function = 2, RULE_function_block = 3, 
		RULE_function_declaration = 4, RULE_parameters = 5, RULE_parameter = 6, 
		RULE_statement = 7, RULE_switch_statement = 8, RULE_switch_block = 9, 
		RULE_default_block = 10, RULE_break_statement = 11, RULE_continue_statement = 12, 
		RULE_return_statement = 13, RULE_function_call = 14, RULE_standard_function = 15, 
		RULE_arguments = 16, RULE_declaration = 17, RULE_assignment = 18, RULE_print_statement = 19, 
		RULE_read_statement = 20, RULE_if_statement = 21, RULE_while_statement = 22, 
		RULE_for_statement = 23, RULE_for_init = 24, RULE_block = 25, RULE_expression = 26, 
		RULE_literal = 27, RULE_array_literal = 28, RULE_boolean_literal = 29, 
		RULE_type_ = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_function", "function", "function_block", "function_declaration", 
			"parameters", "parameter", "statement", "switch_statement", "switch_block", 
			"default_block", "break_statement", "continue_statement", "return_statement", 
			"function_call", "standard_function", "arguments", "declaration", "assignment", 
			"print_statement", "read_statement", "if_statement", "while_statement", 
			"for_statement", "for_init", "block", "expression", "literal", "array_literal", 
			"boolean_literal", "type_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "CHAR", "STRING", "ARRAY_INT", "ARRAY_DOUBLE", 
			"ARRAY_STRING", "PRINT", "READ", "IF", "ELSE", "WHILE", "FOR", "BREAK", 
			"CONTINUE", "TRUE", "FALSE", "RETURN", "MAIN", "SWITCH", "CASE", "DEFAULT", 
			"QUESTION", "COLON", "SEMICOLON", "COMMA", "LEFT_PARANTHESIS", "RIGHT_PARANTHESIS", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "ASSIGNMENT", 
			"MODULUS", "EQUALS", "NOT", "NOT_EQUALS", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "ADDITION", "SUBTRACTION", 
			"MULTIPLICATION", "POWER", "DIVISION", "LOGICAL_AND", "LOGICAL_OR", "BITWISE_AND", 
			"BITWISE_OR", "BITWISE_XOR", "BITWISE_NOT", "SHIFT_LEFT", "SHIFT_RIGHT", 
			"SINE", "COSINE", "TANGENT", "COTANGENT", "ARCSINE", "ARCCOSINE", "ARCTANGENT", 
			"ARCCOTANGENT", "ARRAY_LENGTH", "ARRAY_AT", "ARRAY_CONTAINS", "ARRAY_INDEX_OF", 
			"ARRAY_COUNT", "ARRAY_SORT", "ARRAY_REVERSE", "ARRAY_INSERT_FIRST", "ARRAY_INSERT_AT", 
			"ARRAY_INSERT_LAST", "ARRAY_DELETE_FIRST", "ARRAY_DELETE_AT", "ARRAY_DELETE_LAST", 
			"STRING_LITERAL", "CHARACTER", "INTEGER_NUMBER", "DOUBLE_NUMBER", "IDENTIFIER", 
			"COMMENT", "WS", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CZ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CZParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CZParser.EOF, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					function_declaration();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					function();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74);
			main_function();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) {
				{
				{
				setState(75);
				function();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CZParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(CZParser.MAIN, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(INT);
			setState(84);
			match(MAIN);
			setState(85);
			match(LEFT_PARANTHESIS);
			setState(86);
			match(RIGHT_PARANTHESIS);
			setState(87);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type_();
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(LEFT_PARANTHESIS);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) {
				{
				setState(92);
				parameters();
				}
			}

			setState(95);
			match(RIGHT_PARANTHESIS);
			setState(96);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(CZParser.LEFT_BRACE, 0); }
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CZParser.SEMICOLON, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CZParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LEFT_BRACE);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					statement();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(105);
			return_statement();
			setState(106);
			match(SEMICOLON);
			setState(107);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CZParser.SEMICOLON, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type_();
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(LEFT_PARANTHESIS);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) {
				{
				setState(112);
				parameters();
				}
			}

			setState(115);
			match(RIGHT_PARANTHESIS);
			setState(116);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CZParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CZParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			parameter();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				parameter();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type_();
			setState(127);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CZParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				declaration();
				setState(130);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				assignment();
				setState(133);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				print_statement();
				setState(136);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				read_statement();
				setState(139);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				break_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
				continue_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(147);
				expression(0);
				setState(148);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(150);
				return_statement();
				setState(151);
				match(SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(153);
				switch_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CZParser.SWITCH, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(CZParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CZParser.RIGHT_BRACE, 0); }
		public List<Switch_blockContext> switch_block() {
			return getRuleContexts(Switch_blockContext.class);
		}
		public Switch_blockContext switch_block(int i) {
			return getRuleContext(Switch_blockContext.class,i);
		}
		public Default_blockContext default_block() {
			return getRuleContext(Default_blockContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SWITCH);
			setState(157);
			match(LEFT_PARANTHESIS);
			setState(158);
			expression(0);
			setState(159);
			match(RIGHT_PARANTHESIS);
			setState(160);
			match(LEFT_BRACE);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(161);
				switch_block();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(167);
				default_block();
				}
			}

			setState(170);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CZParser.CASE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CZParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitSwitch_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switch_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(CASE);
			setState(173);
			literal();
			setState(174);
			match(COLON);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -31525125851973634L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_blockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(CZParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(CZParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Default_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterDefault_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitDefault_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitDefault_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_blockContext default_block() throws RecognitionException {
		Default_blockContext _localctx = new Default_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DEFAULT);
			setState(182);
			match(COLON);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -31525125851973634L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CZParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(CZParser.SEMICOLON, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(BREAK);
			setState(190);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CZParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CZParser.SEMICOLON, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CONTINUE);
			setState(193);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CZParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETURN);
			setState(196);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public Standard_functionContext standard_function() {
			return getRuleContext(Standard_functionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(198);
				match(IDENTIFIER);
				}
				break;
			case SINE:
			case COSINE:
			case TANGENT:
			case COTANGENT:
			case ARCSINE:
			case ARCCOSINE:
			case ARCTANGENT:
			case ARCCOTANGENT:
			case ARRAY_LENGTH:
			case ARRAY_AT:
			case ARRAY_CONTAINS:
			case ARRAY_INDEX_OF:
			case ARRAY_COUNT:
			case ARRAY_SORT:
			case ARRAY_REVERSE:
			case ARRAY_INSERT_FIRST:
			case ARRAY_INSERT_AT:
			case ARRAY_INSERT_LAST:
			case ARRAY_DELETE_FIRST:
			case ARRAY_DELETE_AT:
			case ARRAY_DELETE_LAST:
				{
				setState(199);
				standard_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			match(LEFT_PARANTHESIS);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -31525126390218752L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) {
				{
				setState(203);
				arguments();
				}
			}

			setState(206);
			match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Standard_functionContext extends ParserRuleContext {
		public TerminalNode ARRAY_LENGTH() { return getToken(CZParser.ARRAY_LENGTH, 0); }
		public TerminalNode ARRAY_AT() { return getToken(CZParser.ARRAY_AT, 0); }
		public TerminalNode ARRAY_CONTAINS() { return getToken(CZParser.ARRAY_CONTAINS, 0); }
		public TerminalNode ARRAY_INDEX_OF() { return getToken(CZParser.ARRAY_INDEX_OF, 0); }
		public TerminalNode ARRAY_COUNT() { return getToken(CZParser.ARRAY_COUNT, 0); }
		public TerminalNode ARRAY_SORT() { return getToken(CZParser.ARRAY_SORT, 0); }
		public TerminalNode ARRAY_REVERSE() { return getToken(CZParser.ARRAY_REVERSE, 0); }
		public TerminalNode ARRAY_INSERT_FIRST() { return getToken(CZParser.ARRAY_INSERT_FIRST, 0); }
		public TerminalNode ARRAY_INSERT_AT() { return getToken(CZParser.ARRAY_INSERT_AT, 0); }
		public TerminalNode ARRAY_INSERT_LAST() { return getToken(CZParser.ARRAY_INSERT_LAST, 0); }
		public TerminalNode ARRAY_DELETE_FIRST() { return getToken(CZParser.ARRAY_DELETE_FIRST, 0); }
		public TerminalNode ARRAY_DELETE_AT() { return getToken(CZParser.ARRAY_DELETE_AT, 0); }
		public TerminalNode ARRAY_DELETE_LAST() { return getToken(CZParser.ARRAY_DELETE_LAST, 0); }
		public TerminalNode SINE() { return getToken(CZParser.SINE, 0); }
		public TerminalNode COSINE() { return getToken(CZParser.COSINE, 0); }
		public TerminalNode TANGENT() { return getToken(CZParser.TANGENT, 0); }
		public TerminalNode COTANGENT() { return getToken(CZParser.COTANGENT, 0); }
		public TerminalNode ARCSINE() { return getToken(CZParser.ARCSINE, 0); }
		public TerminalNode ARCCOSINE() { return getToken(CZParser.ARCCOSINE, 0); }
		public TerminalNode ARCTANGENT() { return getToken(CZParser.ARCTANGENT, 0); }
		public TerminalNode ARCCOTANGENT() { return getToken(CZParser.ARCCOTANGENT, 0); }
		public Standard_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterStandard_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitStandard_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitStandard_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_functionContext standard_function() throws RecognitionException {
		Standard_functionContext _localctx = new Standard_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_standard_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 2097151L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CZParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CZParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expression(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				expression(0);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Type_Context type;
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CZParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			((DeclarationContext)_localctx).type = type_();
			setState(219);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(220);
				match(ASSIGNMENT);
				setState(221);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CZParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IDENTIFIER);
			setState(225);
			match(ASSIGNMENT);
			setState(226);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CZParser.PRINT, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PRINT);
			setState(229);
			match(LEFT_PARANTHESIS);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -31525126390218752L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) {
				{
				setState(230);
				arguments();
				}
			}

			setState(233);
			match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CZParser.READ, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitRead_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitRead_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(READ);
			setState(236);
			match(LEFT_PARANTHESIS);
			setState(237);
			match(IDENTIFIER);
			setState(238);
			match(RIGHT_PARANTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(CZParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CZParser.IF, i);
		}
		public List<TerminalNode> LEFT_PARANTHESIS() { return getTokens(CZParser.LEFT_PARANTHESIS); }
		public TerminalNode LEFT_PARANTHESIS(int i) {
			return getToken(CZParser.LEFT_PARANTHESIS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARANTHESIS() { return getTokens(CZParser.RIGHT_PARANTHESIS); }
		public TerminalNode RIGHT_PARANTHESIS(int i) {
			return getToken(CZParser.RIGHT_PARANTHESIS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CZParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CZParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(IF);
			setState(241);
			match(LEFT_PARANTHESIS);
			setState(242);
			expression(0);
			setState(243);
			match(RIGHT_PARANTHESIS);
			setState(244);
			block();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(ELSE);
					setState(246);
					match(IF);
					setState(247);
					match(LEFT_PARANTHESIS);
					setState(248);
					expression(0);
					setState(249);
					match(RIGHT_PARANTHESIS);
					setState(250);
					block();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(257);
				match(ELSE);
				setState(258);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CZParser.WHILE, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WHILE);
			setState(262);
			match(LEFT_PARANTHESIS);
			setState(263);
			expression(0);
			setState(264);
			match(RIGHT_PARANTHESIS);
			setState(265);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CZParser.FOR, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CZParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CZParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FOR);
			setState(268);
			match(LEFT_PARANTHESIS);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0) || _la==IDENTIFIER) {
				{
				setState(269);
				for_init();
				}
			}

			setState(272);
			match(SEMICOLON);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -31525126390218752L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) {
				{
				setState(273);
				expression(0);
				}
			}

			setState(276);
			match(SEMICOLON);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(277);
				assignment();
				}
			}

			setState(280);
			match(RIGHT_PARANTHESIS);
			setState(281);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_initContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_init);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
			case ARRAY_INT:
			case ARRAY_DOUBLE:
			case ARRAY_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				declaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(CZParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CZParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(LEFT_BRACE);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -31525125851973634L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 131071L) != 0)) {
				{
				{
				setState(288);
				statement();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SHIFT_LEFT() { return getToken(CZParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(CZParser.SHIFT_RIGHT, 0); }
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDITION() { return getToken(CZParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(CZParser.SUBTRACTION, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(CZParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CZParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(CZParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(CZParser.GREATER_THAN_OR_EQUAL, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_PARANTHESIS() { return getToken(CZParser.LEFT_PARANTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(CZParser.RIGHT_PARANTHESIS, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(CZParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(CZParser.DIVISION, 0); }
		public TerminalNode MODULUS() { return getToken(CZParser.MODULUS, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND() { return getToken(CZParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(CZParser.LOGICAL_OR, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(CZParser.POWER, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExpressionContext extends ExpressionContext {
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public ArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(CZParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(CZParser.NOT_EQUALS, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_AND() { return getToken(CZParser.BITWISE_AND, 0); }
		public TerminalNode BITWISE_OR() { return getToken(CZParser.BITWISE_OR, 0); }
		public TerminalNode BITWISE_XOR() { return getToken(CZParser.BITWISE_XOR, 0); }
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterBitwiseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitBitwiseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CZParser.NOT, 0); }
		public TerminalNode BITWISE_NOT() { return getToken(CZParser.BITWISE_NOT, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext trueExpr;
		public ExpressionContext falseExpr;
		public TerminalNode QUESTION() { return getToken(CZParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(CZParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(297);
				match(LEFT_PARANTHESIS);
				setState(298);
				expression(0);
				setState(299);
				match(RIGHT_PARANTHESIS);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BITWISE_NOT) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				array_literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(310);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 87978110091264L) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(311);
						((MultiplicativeExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PowerExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(313);
						((PowerExpressionContext)_localctx).op = match(POWER);
						setState(314);
						((PowerExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(316);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						((AdditiveExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(319);
						((ShiftExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
							((ShiftExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						((ShiftExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(322);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						((RelationalExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(325);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						((EqualityExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(328);
						((BitwiseExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
							((BitwiseExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						((BitwiseExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 8:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(331);
						((LogicalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LOGICAL_AND || _la==LOGICAL_OR) ) {
							((LogicalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						((LogicalExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 9:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(334);
						match(QUESTION);
						setState(335);
						((TernaryExpressionContext)_localctx).trueExpr = expression(0);
						setState(336);
						match(COLON);
						setState(337);
						((TernaryExpressionContext)_localctx).falseExpr = expression(6);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(CZParser.INTEGER_NUMBER, 0); }
		public TerminalNode DOUBLE_NUMBER() { return getToken(CZParser.DOUBLE_NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(CZParser.CHARACTER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CZParser.STRING_LITERAL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(INTEGER_NUMBER);
				}
				break;
			case DOUBLE_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(DOUBLE_NUMBER);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(CHARACTER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				boolean_literal();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				array_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(CZParser.LEFT_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CZParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CZParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CZParser.COMMA, i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LEFT_BRACKET);
			setState(353);
			expression(0);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(354);
				match(COMMA);
				setState(355);
				expression(0);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CZParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CZParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CZParser.INT, 0); }
		public TerminalNode ARRAY_INT() { return getToken(CZParser.ARRAY_INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CZParser.DOUBLE, 0); }
		public TerminalNode ARRAY_DOUBLE() { return getToken(CZParser.ARRAY_DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(CZParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(CZParser.STRING, 0); }
		public TerminalNode ARRAY_STRING() { return getToken(CZParser.ARRAY_STRING, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001S\u0170\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000M\b\u0000\n\u0000\f\u0000P\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"e\b\u0003\n\u0003\f\u0003h\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"r\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005z\b\u0005\n\u0005\f\u0005}\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009b\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a3\b\b\n\b\f\b\u00a6"+
		"\t\b\u0001\b\u0003\b\u00a9\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u00b1\b\t\n\t\f\t\u00b4\t\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00b9\b\n\n\n\f\n\u00bc\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c9\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cd\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00d6\b\u0010\n\u0010\f\u0010\u00d9\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00df\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00fd\b\u0015\n"+
		"\u0015\f\u0015\u0100\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0104"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010f\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0113\b\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0117\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u011e\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0122"+
		"\b\u0019\n\u0019\f\u0019\u0125\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0134\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0154\b\u001a\n\u001a\f\u001a\u0157\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u015f"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0165"+
		"\b\u001c\n\u001c\f\u001c\u0168\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0000\u00014\u001f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<\u0000\u000b\u0001\u00007K\u0002\u0000$$44\u0003"+
		"\u0000\"\",,..\u0001\u0000*+\u0001\u000056\u0001\u0000&)\u0002\u0000#"+
		"#%%\u0001\u000013\u0001\u0000/0\u0001\u0000\u0010\u0011\u0001\u0000\u0001"+
		"\u0007\u0187\u0000A\u0001\u0000\u0000\u0000\u0002S\u0001\u0000\u0000\u0000"+
		"\u0004Y\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bm\u0001"+
		"\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000"+
		"\u000e\u009a\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000"+
		"\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000\u0000\u0000"+
		"\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00c0\u0001\u0000\u0000\u0000"+
		"\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000\u0000"+
		"\u001e\u00d0\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\""+
		"\u00da\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000\u0000\u0000&\u00e4\u0001"+
		"\u0000\u0000\u0000(\u00eb\u0001\u0000\u0000\u0000*\u00f0\u0001\u0000\u0000"+
		"\u0000,\u0105\u0001\u0000\u0000\u0000.\u010b\u0001\u0000\u0000\u00000"+
		"\u011d\u0001\u0000\u0000\u00002\u011f\u0001\u0000\u0000\u00004\u0133\u0001"+
		"\u0000\u0000\u00006\u015e\u0001\u0000\u0000\u00008\u0160\u0001\u0000\u0000"+
		"\u0000:\u016b\u0001\u0000\u0000\u0000<\u016d\u0001\u0000\u0000\u0000>"+
		"@\u0003\b\u0004\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BG\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DF\u0003\u0004\u0002\u0000ED\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JN\u0003\u0002\u0001\u0000KM\u0003\u0004\u0002\u0000LK\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0000\u0000\u0001R\u0001\u0001\u0000\u0000\u0000ST\u0005\u0001\u0000"+
		"\u0000TU\u0005\u0013\u0000\u0000UV\u0005\u001b\u0000\u0000VW\u0005\u001c"+
		"\u0000\u0000WX\u0003\u0006\u0003\u0000X\u0003\u0001\u0000\u0000\u0000"+
		"YZ\u0003<\u001e\u0000Z[\u0005P\u0000\u0000[]\u0005\u001b\u0000\u0000\\"+
		"^\u0003\n\u0005\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0005\u001c\u0000\u0000`a\u0003\u0006\u0003"+
		"\u0000a\u0005\u0001\u0000\u0000\u0000bf\u0005\u001d\u0000\u0000ce\u0003"+
		"\u000e\u0007\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0003\u001a\r\u0000jk\u0005\u0019\u0000"+
		"\u0000kl\u0005\u001e\u0000\u0000l\u0007\u0001\u0000\u0000\u0000mn\u0003"+
		"<\u001e\u0000no\u0005P\u0000\u0000oq\u0005\u001b\u0000\u0000pr\u0003\n"+
		"\u0005\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0005\u001c\u0000\u0000tu\u0005\u0019\u0000\u0000"+
		"u\t\u0001\u0000\u0000\u0000v{\u0003\f\u0006\u0000wx\u0005\u001a\u0000"+
		"\u0000xz\u0003\f\u0006\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u000b\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0003<\u001e\u0000"+
		"\u007f\u0080\u0005P\u0000\u0000\u0080\r\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0003\"\u0011\u0000\u0082\u0083\u0005\u0019\u0000\u0000\u0083\u009b"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0003$\u0012\u0000\u0085\u0086\u0005"+
		"\u0019\u0000\u0000\u0086\u009b\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"&\u0013\u0000\u0088\u0089\u0005\u0019\u0000\u0000\u0089\u009b\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0003(\u0014\u0000\u008b\u008c\u0005\u0019\u0000"+
		"\u0000\u008c\u009b\u0001\u0000\u0000\u0000\u008d\u009b\u0003*\u0015\u0000"+
		"\u008e\u009b\u0003,\u0016\u0000\u008f\u009b\u0003.\u0017\u0000\u0090\u009b"+
		"\u00032\u0019\u0000\u0091\u009b\u0003\u0016\u000b\u0000\u0092\u009b\u0003"+
		"\u0018\f\u0000\u0093\u0094\u00034\u001a\u0000\u0094\u0095\u0005\u0019"+
		"\u0000\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u001a"+
		"\r\u0000\u0097\u0098\u0005\u0019\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0003\u0010\b\u0000\u009a\u0081\u0001\u0000\u0000\u0000"+
		"\u009a\u0084\u0001\u0000\u0000\u0000\u009a\u0087\u0001\u0000\u0000\u0000"+
		"\u009a\u008a\u0001\u0000\u0000\u0000\u009a\u008d\u0001\u0000\u0000\u0000"+
		"\u009a\u008e\u0001\u0000\u0000\u0000\u009a\u008f\u0001\u0000\u0000\u0000"+
		"\u009a\u0090\u0001\u0000\u0000\u0000\u009a\u0091\u0001\u0000\u0000\u0000"+
		"\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000\u0000\u0000"+
		"\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0014\u0000\u0000"+
		"\u009d\u009e\u0005\u001b\u0000\u0000\u009e\u009f\u00034\u001a\u0000\u009f"+
		"\u00a0\u0005\u001c\u0000\u0000\u00a0\u00a4\u0005\u001d\u0000\u0000\u00a1"+
		"\u00a3\u0003\u0012\t\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u0014\n\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u001e\u0000\u0000\u00ab\u0011\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000\u00ad\u00ae\u0003"+
		"6\u001b\u0000\u00ae\u00b2\u0005\u0018\u0000\u0000\u00af\u00b1\u0003\u000e"+
		"\u0007\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u0013\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6\u00ba\u0005\u0018"+
		"\u0000\u0000\u00b7\u00b9\u0003\u000e\u0007\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u0015\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000e"+
		"\u0000\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u0017\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u000f\u0000\u0000\u00c1\u00c2\u0005\u0019"+
		"\u0000\u0000\u00c2\u0019\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0012"+
		"\u0000\u0000\u00c4\u00c5\u00034\u001a\u0000\u00c5\u001b\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0005P\u0000\u0000\u00c7\u00c9\u0003\u001e\u000f\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u001b\u0000\u0000"+
		"\u00cb\u00cd\u0003 \u0010\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\u001c\u0000\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0007\u0000\u0000\u0000\u00d1\u001f\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d7\u00034\u001a\u0000\u00d3\u00d4\u0005\u001a\u0000\u0000\u00d4\u00d6"+
		"\u00034\u001a\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8!\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0003<\u001e\u0000\u00db\u00de\u0005P\u0000\u0000"+
		"\u00dc\u00dd\u0005!\u0000\u0000\u00dd\u00df\u00034\u001a\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df#\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005P\u0000\u0000\u00e1\u00e2\u0005!\u0000"+
		"\u0000\u00e2\u00e3\u00034\u001a\u0000\u00e3%\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\b\u0000\u0000\u00e5\u00e7\u0005\u001b\u0000\u0000\u00e6\u00e8"+
		"\u0003 \u0010\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005"+
		"\u001c\u0000\u0000\u00ea\'\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\t"+
		"\u0000\u0000\u00ec\u00ed\u0005\u001b\u0000\u0000\u00ed\u00ee\u0005P\u0000"+
		"\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000\u00ef)\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\n\u0000\u0000\u00f1\u00f2\u0005\u001b\u0000\u0000\u00f2"+
		"\u00f3\u00034\u001a\u0000\u00f3\u00f4\u0005\u001c\u0000\u0000\u00f4\u00fe"+
		"\u00032\u0019\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6\u00f7\u0005"+
		"\n\u0000\u0000\u00f7\u00f8\u0005\u001b\u0000\u0000\u00f8\u00f9\u00034"+
		"\u001a\u0000\u00f9\u00fa\u0005\u001c\u0000\u0000\u00fa\u00fb\u00032\u0019"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103\u0001\u0000\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u000b\u0000"+
		"\u0000\u0102\u0104\u00032\u0019\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104+\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005\f\u0000\u0000\u0106\u0107\u0005\u001b\u0000\u0000\u0107\u0108"+
		"\u00034\u001a\u0000\u0108\u0109\u0005\u001c\u0000\u0000\u0109\u010a\u0003"+
		"2\u0019\u0000\u010a-\u0001\u0000\u0000\u0000\u010b\u010c\u0005\r\u0000"+
		"\u0000\u010c\u010e\u0005\u001b\u0000\u0000\u010d\u010f\u00030\u0018\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0005\u0019\u0000\u0000"+
		"\u0111\u0113\u00034\u001a\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0005\u0019\u0000\u0000\u0115\u0117\u0003$\u0012\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u001c\u0000\u0000\u0119\u011a"+
		"\u00032\u0019\u0000\u011a/\u0001\u0000\u0000\u0000\u011b\u011e\u0003\""+
		"\u0011\u0000\u011c\u011e\u0003$\u0012\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e1\u0001\u0000\u0000\u0000"+
		"\u011f\u0123\u0005\u001d\u0000\u0000\u0120\u0122\u0003\u000e\u0007\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u001e\u0000\u0000\u01273\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0006\u001a\uffff\uffff\u0000\u0129\u012a\u0005\u001b\u0000\u0000"+
		"\u012a\u012b\u00034\u001a\u0000\u012b\u012c\u0005\u001c\u0000\u0000\u012c"+
		"\u0134\u0001\u0000\u0000\u0000\u012d\u012e\u0007\u0001\u0000\u0000\u012e"+
		"\u0134\u00034\u001a\u000e\u012f\u0134\u0003\u001c\u000e\u0000\u0130\u0134"+
		"\u0005P\u0000\u0000\u0131\u0134\u00036\u001b\u0000\u0132\u0134\u00038"+
		"\u001c\u0000\u0133\u0128\u0001\u0000\u0000\u0000\u0133\u012d\u0001\u0000"+
		"\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0155\u0001\u0000\u0000\u0000\u0135\u0136\n\r\u0000"+
		"\u0000\u0136\u0137\u0007\u0002\u0000\u0000\u0137\u0154\u00034\u001a\u000e"+
		"\u0138\u0139\n\f\u0000\u0000\u0139\u013a\u0005-\u0000\u0000\u013a\u0154"+
		"\u00034\u001a\r\u013b\u013c\n\u000b\u0000\u0000\u013c\u013d\u0007\u0003"+
		"\u0000\u0000\u013d\u0154\u00034\u001a\f\u013e\u013f\n\n\u0000\u0000\u013f"+
		"\u0140\u0007\u0004\u0000\u0000\u0140\u0154\u00034\u001a\u000b\u0141\u0142"+
		"\n\t\u0000\u0000\u0142\u0143\u0007\u0005\u0000\u0000\u0143\u0154\u0003"+
		"4\u001a\n\u0144\u0145\n\b\u0000\u0000\u0145\u0146\u0007\u0006\u0000\u0000"+
		"\u0146\u0154\u00034\u001a\t\u0147\u0148\n\u0007\u0000\u0000\u0148\u0149"+
		"\u0007\u0007\u0000\u0000\u0149\u0154\u00034\u001a\b\u014a\u014b\n\u0006"+
		"\u0000\u0000\u014b\u014c\u0007\b\u0000\u0000\u014c\u0154\u00034\u001a"+
		"\u0007\u014d\u014e\n\u0005\u0000\u0000\u014e\u014f\u0005\u0017\u0000\u0000"+
		"\u014f\u0150\u00034\u001a\u0000\u0150\u0151\u0005\u0018\u0000\u0000\u0151"+
		"\u0152\u00034\u001a\u0006\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0135"+
		"\u0001\u0000\u0000\u0000\u0153\u0138\u0001\u0000\u0000\u0000\u0153\u013b"+
		"\u0001\u0000\u0000\u0000\u0153\u013e\u0001\u0000\u0000\u0000\u0153\u0141"+
		"\u0001\u0000\u0000\u0000\u0153\u0144\u0001\u0000\u0000\u0000\u0153\u0147"+
		"\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000\u0000\u0000\u0153\u014d"+
		"\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u01565\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015f\u0005"+
		"N\u0000\u0000\u0159\u015f\u0005O\u0000\u0000\u015a\u015f\u0005M\u0000"+
		"\u0000\u015b\u015f\u0005L\u0000\u0000\u015c\u015f\u0003:\u001d\u0000\u015d"+
		"\u015f\u00038\u001c\u0000\u015e\u0158\u0001\u0000\u0000\u0000\u015e\u0159"+
		"\u0001\u0000\u0000\u0000\u015e\u015a\u0001\u0000\u0000\u0000\u015e\u015b"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015f7\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\u001f\u0000\u0000\u0161\u0166\u00034\u001a\u0000\u0162\u0163\u0005\u001a"+
		"\u0000\u0000\u0163\u0165\u00034\u001a\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005 \u0000\u0000"+
		"\u016a9\u0001\u0000\u0000\u0000\u016b\u016c\u0007\t\u0000\u0000\u016c"+
		";\u0001\u0000\u0000\u0000\u016d\u016e\u0007\n\u0000\u0000\u016e=\u0001"+
		"\u0000\u0000\u0000\u001dAGN]fq{\u009a\u00a4\u00a8\u00b2\u00ba\u00c8\u00cc"+
		"\u00d7\u00de\u00e7\u00fe\u0103\u010e\u0112\u0116\u011d\u0123\u0133\u0153"+
		"\u0155\u015e\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}