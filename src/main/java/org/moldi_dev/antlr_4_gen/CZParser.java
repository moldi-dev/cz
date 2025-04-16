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
		INT=1, BOOLEAN=2, DOUBLE=3, CHAR=4, STRING=5, ARRAY_INT=6, ARRAY_DOUBLE=7, 
		ARRAY_STRING=8, ARRAY_BOOLEAN=9, PRINT=10, READ=11, IF=12, ELSE=13, WHILE=14, 
		FOR=15, BREAK=16, CONTINUE=17, TRUE=18, FALSE=19, RETURN=20, MAIN=21, 
		SWITCH=22, CASE=23, DEFAULT=24, DEFINE=25, QUESTION=26, COLON=27, SEMICOLON=28, 
		COMMA=29, LEFT_PARANTHESIS=30, RIGHT_PARANTHESIS=31, LEFT_BRACE=32, RIGHT_BRACE=33, 
		LEFT_BRACKET=34, RIGHT_BRACKET=35, ASSIGNMENT=36, MODULUS=37, EQUALS=38, 
		NOT=39, NOT_EQUALS=40, LESS_THAN=41, GREATER_THAN=42, LESS_THAN_OR_EQUAL=43, 
		GREATER_THAN_OR_EQUAL=44, ADDITION=45, SUBTRACTION=46, MULTIPLICATION=47, 
		POWER=48, DIVISION=49, LOGICAL_AND=50, LOGICAL_OR=51, BITWISE_AND=52, 
		BITWISE_OR=53, BITWISE_XOR=54, BITWISE_NOT=55, SHIFT_LEFT=56, SHIFT_RIGHT=57, 
		SINE=58, COSINE=59, TANGENT=60, COTANGENT=61, ARCSINE=62, ARCCOSINE=63, 
		ARCTANGENT=64, ARCCOTANGENT=65, ARRAY_LENGTH=66, ARRAY_GET_AT=67, ARRAY_SET_AT=68, 
		ARRAY_COPY=69, ARRAY_CONTAINS=70, ARRAY_INDEX_OF=71, ARRAY_COUNT=72, ARRAY_INSERT_FIRST=73, 
		ARRAY_INSERT_AT=74, ARRAY_INSERT_LAST=75, ARRAY_DELETE_FIRST=76, ARRAY_DELETE_AT=77, 
		ARRAY_DELETE_LAST=78, STRING_LITERAL=79, CHARACTER=80, INTEGER_NUMBER=81, 
		DOUBLE_NUMBER=82, IDENTIFIER=83, COMMENT=84, WS=85, UNEXPECTED_CHAR=86;
	public static final int
		RULE_program = 0, RULE_define_directive = 1, RULE_main_function = 2, RULE_function = 3, 
		RULE_function_block = 4, RULE_function_declaration = 5, RULE_parameters = 6, 
		RULE_parameter = 7, RULE_statement = 8, RULE_switch_statement = 9, RULE_switch_block = 10, 
		RULE_default_block = 11, RULE_break_statement = 12, RULE_continue_statement = 13, 
		RULE_return_statement = 14, RULE_function_call = 15, RULE_standard_function = 16, 
		RULE_arguments = 17, RULE_declaration = 18, RULE_assignment = 19, RULE_print_statement = 20, 
		RULE_read_statement = 21, RULE_if_statement = 22, RULE_while_statement = 23, 
		RULE_for_statement = 24, RULE_for_init = 25, RULE_block = 26, RULE_expression = 27, 
		RULE_literal = 28, RULE_array_literal = 29, RULE_boolean_literal = 30, 
		RULE_type_ = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "define_directive", "main_function", "function", "function_block", 
			"function_declaration", "parameters", "parameter", "statement", "switch_statement", 
			"switch_block", "default_block", "break_statement", "continue_statement", 
			"return_statement", "function_call", "standard_function", "arguments", 
			"declaration", "assignment", "print_statement", "read_statement", "if_statement", 
			"while_statement", "for_statement", "for_init", "block", "expression", 
			"literal", "array_literal", "boolean_literal", "type_"
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
			null, "INT", "BOOLEAN", "DOUBLE", "CHAR", "STRING", "ARRAY_INT", "ARRAY_DOUBLE", 
			"ARRAY_STRING", "ARRAY_BOOLEAN", "PRINT", "READ", "IF", "ELSE", "WHILE", 
			"FOR", "BREAK", "CONTINUE", "TRUE", "FALSE", "RETURN", "MAIN", "SWITCH", 
			"CASE", "DEFAULT", "DEFINE", "QUESTION", "COLON", "SEMICOLON", "COMMA", 
			"LEFT_PARANTHESIS", "RIGHT_PARANTHESIS", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "ASSIGNMENT", "MODULUS", "EQUALS", "NOT", 
			"NOT_EQUALS", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", 
			"ADDITION", "SUBTRACTION", "MULTIPLICATION", "POWER", "DIVISION", "LOGICAL_AND", 
			"LOGICAL_OR", "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", "BITWISE_NOT", 
			"SHIFT_LEFT", "SHIFT_RIGHT", "SINE", "COSINE", "TANGENT", "COTANGENT", 
			"ARCSINE", "ARCCOSINE", "ARCTANGENT", "ARCCOTANGENT", "ARRAY_LENGTH", 
			"ARRAY_GET_AT", "ARRAY_SET_AT", "ARRAY_COPY", "ARRAY_CONTAINS", "ARRAY_INDEX_OF", 
			"ARRAY_COUNT", "ARRAY_INSERT_FIRST", "ARRAY_INSERT_AT", "ARRAY_INSERT_LAST", 
			"ARRAY_DELETE_FIRST", "ARRAY_DELETE_AT", "ARRAY_DELETE_LAST", "STRING_LITERAL", 
			"CHARACTER", "INTEGER_NUMBER", "DOUBLE_NUMBER", "IDENTIFIER", "COMMENT", 
			"WS", "UNEXPECTED_CHAR"
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
		public List<Define_directiveContext> define_directive() {
			return getRuleContexts(Define_directiveContext.class);
		}
		public Define_directiveContext define_directive(int i) {
			return getRuleContext(Define_directiveContext.class,i);
		}
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				setState(64);
				define_directive();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					function_declaration();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					function();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(82);
			main_function();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				{
				setState(83);
				function();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
	public static class Define_directiveContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(CZParser.DEFINE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(CZParser.INTEGER_NUMBER, 0); }
		public TerminalNode DOUBLE_NUMBER() { return getToken(CZParser.DOUBLE_NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CZParser.STRING_LITERAL, 0); }
		public TerminalNode CHARACTER() { return getToken(CZParser.CHARACTER, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Define_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterDefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitDefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitDefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_directiveContext define_directive() throws RecognitionException {
		Define_directiveContext _localctx = new Define_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DEFINE);
			setState(92);
			match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				{
				setState(93);
				match(INTEGER_NUMBER);
				}
				break;
			case DOUBLE_NUMBER:
				{
				setState(94);
				match(DOUBLE_NUMBER);
				}
				break;
			case STRING_LITERAL:
				{
				setState(95);
				match(STRING_LITERAL);
				}
				break;
			case CHARACTER:
				{
				setState(96);
				match(CHARACTER);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(97);
				boolean_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 4, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(INT);
			setState(101);
			match(MAIN);
			setState(102);
			match(LEFT_PARANTHESIS);
			setState(103);
			match(RIGHT_PARANTHESIS);
			setState(104);
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
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type_();
			setState(107);
			match(IDENTIFIER);
			setState(108);
			match(LEFT_PARANTHESIS);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				setState(109);
				parameters();
				}
			}

			setState(112);
			match(RIGHT_PARANTHESIS);
			setState(113);
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
		enterRule(_localctx, 8, RULE_function_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LEFT_BRACE);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					statement();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(122);
			return_statement();
			setState(123);
			match(SEMICOLON);
			setState(124);
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
		enterRule(_localctx, 10, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type_();
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(LEFT_PARANTHESIS);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				setState(129);
				parameters();
				}
			}

			setState(132);
			match(RIGHT_PARANTHESIS);
			setState(133);
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
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			parameter();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				parameter();
				}
				}
				setState(142);
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
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type_();
			setState(144);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				declaration();
				setState(147);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				assignment();
				setState(150);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				print_statement();
				setState(153);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				read_statement();
				setState(156);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				break_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				continue_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(164);
				expression(0);
				setState(165);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(167);
				return_statement();
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
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
		enterRule(_localctx, 18, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(SWITCH);
			setState(174);
			match(LEFT_PARANTHESIS);
			setState(175);
			expression(0);
			setState(176);
			match(RIGHT_PARANTHESIS);
			setState(177);
			match(LEFT_BRACE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(178);
				switch_block();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(184);
				default_block();
				}
			}

			setState(187);
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
		enterRule(_localctx, 20, RULE_switch_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CASE);
			setState(190);
			literal();
			setState(191);
			match(COLON);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -252201006822072322L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048575L) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
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
		enterRule(_localctx, 22, RULE_default_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(DEFAULT);
			setState(199);
			match(COLON);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -252201006822072322L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048575L) != 0)) {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(205);
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
		enterRule(_localctx, 24, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(BREAK);
			setState(207);
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
		enterRule(_localctx, 26, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CONTINUE);
			setState(210);
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
		enterRule(_localctx, 28, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(RETURN);
			setState(213);
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
		enterRule(_localctx, 30, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(215);
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
			case ARRAY_GET_AT:
			case ARRAY_SET_AT:
			case ARRAY_COPY:
			case ARRAY_CONTAINS:
			case ARRAY_INDEX_OF:
			case ARRAY_COUNT:
			case ARRAY_INSERT_FIRST:
			case ARRAY_INSERT_AT:
			case ARRAY_INSERT_LAST:
			case ARRAY_DELETE_FIRST:
			case ARRAY_DELETE_AT:
			case ARRAY_DELETE_LAST:
				{
				setState(216);
				standard_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(LEFT_PARANTHESIS);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -252201011122536448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048575L) != 0)) {
				{
				setState(220);
				arguments();
				}
			}

			setState(223);
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
		public TerminalNode SINE() { return getToken(CZParser.SINE, 0); }
		public TerminalNode COSINE() { return getToken(CZParser.COSINE, 0); }
		public TerminalNode TANGENT() { return getToken(CZParser.TANGENT, 0); }
		public TerminalNode COTANGENT() { return getToken(CZParser.COTANGENT, 0); }
		public TerminalNode ARCSINE() { return getToken(CZParser.ARCSINE, 0); }
		public TerminalNode ARCCOSINE() { return getToken(CZParser.ARCCOSINE, 0); }
		public TerminalNode ARCTANGENT() { return getToken(CZParser.ARCTANGENT, 0); }
		public TerminalNode ARCCOTANGENT() { return getToken(CZParser.ARCCOTANGENT, 0); }
		public TerminalNode ARRAY_LENGTH() { return getToken(CZParser.ARRAY_LENGTH, 0); }
		public TerminalNode ARRAY_GET_AT() { return getToken(CZParser.ARRAY_GET_AT, 0); }
		public TerminalNode ARRAY_SET_AT() { return getToken(CZParser.ARRAY_SET_AT, 0); }
		public TerminalNode ARRAY_COPY() { return getToken(CZParser.ARRAY_COPY, 0); }
		public TerminalNode ARRAY_CONTAINS() { return getToken(CZParser.ARRAY_CONTAINS, 0); }
		public TerminalNode ARRAY_INDEX_OF() { return getToken(CZParser.ARRAY_INDEX_OF, 0); }
		public TerminalNode ARRAY_COUNT() { return getToken(CZParser.ARRAY_COUNT, 0); }
		public TerminalNode ARRAY_INSERT_FIRST() { return getToken(CZParser.ARRAY_INSERT_FIRST, 0); }
		public TerminalNode ARRAY_INSERT_AT() { return getToken(CZParser.ARRAY_INSERT_AT, 0); }
		public TerminalNode ARRAY_INSERT_LAST() { return getToken(CZParser.ARRAY_INSERT_LAST, 0); }
		public TerminalNode ARRAY_DELETE_FIRST() { return getToken(CZParser.ARRAY_DELETE_FIRST, 0); }
		public TerminalNode ARRAY_DELETE_AT() { return getToken(CZParser.ARRAY_DELETE_AT, 0); }
		public TerminalNode ARRAY_DELETE_LAST() { return getToken(CZParser.ARRAY_DELETE_LAST, 0); }
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
		enterRule(_localctx, 32, RULE_standard_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 2097151L) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expression(0);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				expression(0);
				}
				}
				setState(234);
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
		enterRule(_localctx, 36, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((DeclarationContext)_localctx).type = type_();
			setState(236);
			match(IDENTIFIER);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(237);
				match(ASSIGNMENT);
				setState(238);
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
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IDENTIFIER);
			setState(242);
			match(ASSIGNMENT);
			setState(243);
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
		enterRule(_localctx, 40, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(PRINT);
			setState(246);
			match(LEFT_PARANTHESIS);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -252201011122536448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048575L) != 0)) {
				{
				setState(247);
				arguments();
				}
			}

			setState(250);
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
		enterRule(_localctx, 42, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(READ);
			setState(253);
			match(LEFT_PARANTHESIS);
			setState(254);
			match(IDENTIFIER);
			setState(255);
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
		enterRule(_localctx, 44, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IF);
			setState(258);
			match(LEFT_PARANTHESIS);
			setState(259);
			expression(0);
			setState(260);
			match(RIGHT_PARANTHESIS);
			setState(261);
			block();
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					match(ELSE);
					setState(263);
					match(IF);
					setState(264);
					match(LEFT_PARANTHESIS);
					setState(265);
					expression(0);
					setState(266);
					match(RIGHT_PARANTHESIS);
					setState(267);
					block();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(274);
				match(ELSE);
				setState(275);
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
		enterRule(_localctx, 46, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(WHILE);
			setState(279);
			match(LEFT_PARANTHESIS);
			setState(280);
			expression(0);
			setState(281);
			match(RIGHT_PARANTHESIS);
			setState(282);
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
		enterRule(_localctx, 48, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(FOR);
			setState(285);
			match(LEFT_PARANTHESIS);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0) || _la==IDENTIFIER) {
				{
				setState(286);
				for_init();
				}
			}

			setState(289);
			match(SEMICOLON);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -252201011122536448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048575L) != 0)) {
				{
				setState(290);
				expression(0);
				}
			}

			setState(293);
			match(SEMICOLON);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(294);
				assignment();
				}
			}

			setState(297);
			match(RIGHT_PARANTHESIS);
			setState(298);
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
		enterRule(_localctx, 50, RULE_for_init);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case STRING:
			case ARRAY_INT:
			case ARRAY_DOUBLE:
			case ARRAY_STRING:
			case ARRAY_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				declaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(LEFT_BRACE);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -252201006822072322L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048575L) != 0)) {
				{
				{
				setState(305);
				statement();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(314);
				match(LEFT_PARANTHESIS);
				setState(315);
				expression(0);
				setState(316);
				match(RIGHT_PARANTHESIS);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
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
				setState(319);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				array_literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(327);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 703824880730112L) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(328);
						((MultiplicativeExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PowerExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(330);
						((PowerExpressionContext)_localctx).op = match(POWER);
						setState(331);
						((PowerExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(333);
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
						setState(334);
						((AdditiveExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(336);
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
						setState(337);
						((ShiftExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(339);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						((RelationalExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(342);
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
						setState(343);
						((EqualityExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(345);
						((BitwiseExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) ) {
							((BitwiseExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						((BitwiseExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 8:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(348);
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
						setState(349);
						((LogicalExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 9:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(351);
						match(QUESTION);
						setState(352);
						((TernaryExpressionContext)_localctx).trueExpr = expression(0);
						setState(353);
						match(COLON);
						setState(354);
						((TernaryExpressionContext)_localctx).falseExpr = expression(6);
						}
						break;
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(INTEGER_NUMBER);
				}
				break;
			case DOUBLE_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(DOUBLE_NUMBER);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(CHARACTER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				boolean_literal();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
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
		enterRule(_localctx, 58, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LEFT_BRACKET);
			setState(370);
			expression(0);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				expression(0);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
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
		enterRule(_localctx, 60, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		public TerminalNode BOOLEAN() { return getToken(CZParser.BOOLEAN, 0); }
		public TerminalNode ARRAY_BOOLEAN() { return getToken(CZParser.ARRAY_BOOLEAN, 0); }
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
		enterRule(_localctx, 62, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) ) {
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
		case 27:
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
		"\u0004\u0001V\u0181\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001"+
		"\u0000\u0005\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000U\b\u0000\n\u0000\f\u0000X\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004v\b\u0004\n\u0004\f\u0004y\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008b"+
		"\b\u0006\n\u0006\f\u0006\u008e\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ac"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b4\b\t"+
		"\n\t\f\t\u00b7\t\t\u0001\t\u0003\t\u00ba\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00c2\b\n\n\n\f\n\u00c5\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00ca\b\u000b\n\u000b\f\u000b\u00cd\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00da\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00de\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00e7\b\u0011"+
		"\n\u0011\f\u0011\u00ea\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f0\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f9\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u010e\b\u0016\n\u0016\f\u0016\u0111\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0115\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0120\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0124\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0128\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u012f\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0133\b\u001a\n\u001a\f\u001a\u0136\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0145\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0165\b\u001b\n\u001b"+
		"\f\u001b\u0168\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0170\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0176\b\u001d\n\u001d\f\u001d\u0179"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0000\u00016 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u000b"+
		"\u0001\u0000:N\u0002\u0000\'\'77\u0003\u0000%%//11\u0001\u0000-.\u0001"+
		"\u000089\u0001\u0000),\u0002\u0000&&((\u0001\u000046\u0001\u000023\u0001"+
		"\u0000\u0012\u0013\u0001\u0000\u0001\t\u019c\u0000C\u0001\u0000\u0000"+
		"\u0000\u0002[\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006"+
		"j\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000"+
		"\u0000\f\u0087\u0001\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000"+
		"\u0010\u00ab\u0001\u0000\u0000\u0000\u0012\u00ad\u0001\u0000\u0000\u0000"+
		"\u0014\u00bd\u0001\u0000\u0000\u0000\u0016\u00c6\u0001\u0000\u0000\u0000"+
		"\u0018\u00ce\u0001\u0000\u0000\u0000\u001a\u00d1\u0001\u0000\u0000\u0000"+
		"\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000"+
		" \u00e1\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u00eb"+
		"\u0001\u0000\u0000\u0000&\u00f1\u0001\u0000\u0000\u0000(\u00f5\u0001\u0000"+
		"\u0000\u0000*\u00fc\u0001\u0000\u0000\u0000,\u0101\u0001\u0000\u0000\u0000"+
		".\u0116\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u00002\u012e"+
		"\u0001\u0000\u0000\u00004\u0130\u0001\u0000\u0000\u00006\u0144\u0001\u0000"+
		"\u0000\u00008\u016f\u0001\u0000\u0000\u0000:\u0171\u0001\u0000\u0000\u0000"+
		"<\u017c\u0001\u0000\u0000\u0000>\u017e\u0001\u0000\u0000\u0000@B\u0003"+
		"\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DI\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FH\u0003\n\u0005\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JO\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0003"+
		"\u0006\u0003\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RV\u0003\u0004\u0002\u0000SU\u0003\u0006"+
		"\u0003\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\u0000\u0000\u0001Z\u0001\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u0019\u0000\u0000\\b\u0005S\u0000\u0000]c\u0005"+
		"Q\u0000\u0000^c\u0005R\u0000\u0000_c\u0005O\u0000\u0000`c\u0005P\u0000"+
		"\u0000ac\u0003<\u001e\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000"+
		"\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000c\u0003\u0001\u0000\u0000\u0000de\u0005\u0001\u0000\u0000"+
		"ef\u0005\u0015\u0000\u0000fg\u0005\u001e\u0000\u0000gh\u0005\u001f\u0000"+
		"\u0000hi\u0003\b\u0004\u0000i\u0005\u0001\u0000\u0000\u0000jk\u0003>\u001f"+
		"\u0000kl\u0005S\u0000\u0000ln\u0005\u001e\u0000\u0000mo\u0003\f\u0006"+
		"\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0005\u001f\u0000\u0000qr\u0003\b\u0004\u0000r\u0007\u0001"+
		"\u0000\u0000\u0000sw\u0005 \u0000\u0000tv\u0003\u0010\b\u0000ut\u0001"+
		"\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0003\u001c\u000e\u0000{|\u0005\u001c\u0000\u0000|}\u0005!\u0000"+
		"\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0003>\u001f\u0000\u007f\u0080"+
		"\u0005S\u0000\u0000\u0080\u0082\u0005\u001e\u0000\u0000\u0081\u0083\u0003"+
		"\f\u0006\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001f"+
		"\u0000\u0000\u0085\u0086\u0005\u001c\u0000\u0000\u0086\u000b\u0001\u0000"+
		"\u0000\u0000\u0087\u008c\u0003\u000e\u0007\u0000\u0088\u0089\u0005\u001d"+
		"\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\r\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0003>\u001f\u0000"+
		"\u0090\u0091\u0005S\u0000\u0000\u0091\u000f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0003$\u0012\u0000\u0093\u0094\u0005\u001c\u0000\u0000\u0094\u00ac"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0003&\u0013\u0000\u0096\u0097\u0005"+
		"\u001c\u0000\u0000\u0097\u00ac\u0001\u0000\u0000\u0000\u0098\u0099\u0003"+
		"(\u0014\u0000\u0099\u009a\u0005\u001c\u0000\u0000\u009a\u00ac\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0003*\u0015\u0000\u009c\u009d\u0005\u001c\u0000"+
		"\u0000\u009d\u00ac\u0001\u0000\u0000\u0000\u009e\u00ac\u0003,\u0016\u0000"+
		"\u009f\u00ac\u0003.\u0017\u0000\u00a0\u00ac\u00030\u0018\u0000\u00a1\u00ac"+
		"\u00034\u001a\u0000\u00a2\u00ac\u0003\u0018\f\u0000\u00a3\u00ac\u0003"+
		"\u001a\r\u0000\u00a4\u00a5\u00036\u001b\u0000\u00a5\u00a6\u0005\u001c"+
		"\u0000\u0000\u00a6\u00ac\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u001c"+
		"\u000e\u0000\u00a8\u00a9\u0005\u001c\u0000\u0000\u00a9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0003\u0012\t\u0000\u00ab\u0092\u0001\u0000\u0000"+
		"\u0000\u00ab\u0095\u0001\u0000\u0000\u0000\u00ab\u0098\u0001\u0000\u0000"+
		"\u0000\u00ab\u009b\u0001\u0000\u0000\u0000\u00ab\u009e\u0001\u0000\u0000"+
		"\u0000\u00ab\u009f\u0001\u0000\u0000\u0000\u00ab\u00a0\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab\u00a2\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u0011\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000"+
		"\u0000\u00ae\u00af\u0005\u001e\u0000\u0000\u00af\u00b0\u00036\u001b\u0000"+
		"\u00b0\u00b1\u0005\u001f\u0000\u0000\u00b1\u00b5\u0005 \u0000\u0000\u00b2"+
		"\u00b4\u0003\u0014\n\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u0016\u000b\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005!\u0000\u0000\u00bc\u0013\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00bf\u0003"+
		"8\u001c\u0000\u00bf\u00c3\u0005\u001b\u0000\u0000\u00c0\u00c2\u0003\u0010"+
		"\b\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u0015\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000\u00c7\u00cb\u0005\u001b\u0000"+
		"\u0000\u00c8\u00ca\u0003\u0010\b\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0017\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0010\u0000\u0000"+
		"\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0011\u0000\u0000\u00d2\u00d3\u0005\u001c\u0000\u0000"+
		"\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000"+
		"\u00d5\u00d6\u00036\u001b\u0000\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0005S\u0000\u0000\u00d8\u00da\u0003 \u0010\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0005\u001e\u0000\u0000\u00dc\u00de\u0003"+
		"\"\u0011\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u001f"+
		"\u0000\u0000\u00e0\u001f\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0000"+
		"\u0000\u0000\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e8\u00036\u001b\u0000"+
		"\u00e4\u00e5\u0005\u001d\u0000\u0000\u00e5\u00e7\u00036\u001b\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"#\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0003>\u001f\u0000\u00ec\u00ef\u0005S\u0000\u0000\u00ed\u00ee\u0005$"+
		"\u0000\u0000\u00ee\u00f0\u00036\u001b\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0%\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0005S\u0000\u0000\u00f2\u00f3\u0005$\u0000\u0000\u00f3\u00f4"+
		"\u00036\u001b\u0000\u00f4\'\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\n\u0000\u0000\u00f6\u00f8\u0005\u001e\u0000\u0000\u00f7\u00f9\u0003\""+
		"\u0011\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001f"+
		"\u0000\u0000\u00fb)\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u000b\u0000"+
		"\u0000\u00fd\u00fe\u0005\u001e\u0000\u0000\u00fe\u00ff\u0005S\u0000\u0000"+
		"\u00ff\u0100\u0005\u001f\u0000\u0000\u0100+\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005\f\u0000\u0000\u0102\u0103\u0005\u001e\u0000\u0000\u0103\u0104"+
		"\u00036\u001b\u0000\u0104\u0105\u0005\u001f\u0000\u0000\u0105\u010f\u0003"+
		"4\u001a\u0000\u0106\u0107\u0005\r\u0000\u0000\u0107\u0108\u0005\f\u0000"+
		"\u0000\u0108\u0109\u0005\u001e\u0000\u0000\u0109\u010a\u00036\u001b\u0000"+
		"\u010a\u010b\u0005\u001f\u0000\u0000\u010b\u010c\u00034\u001a\u0000\u010c"+
		"\u010e\u0001\u0000\u0000\u0000\u010d\u0106\u0001\u0000\u0000\u0000\u010e"+
		"\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0114\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005\r\u0000\u0000\u0113\u0115"+
		"\u00034\u001a\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001"+
		"\u0000\u0000\u0000\u0115-\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u000e"+
		"\u0000\u0000\u0117\u0118\u0005\u001e\u0000\u0000\u0118\u0119\u00036\u001b"+
		"\u0000\u0119\u011a\u0005\u001f\u0000\u0000\u011a\u011b\u00034\u001a\u0000"+
		"\u011b/\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u000f\u0000\u0000\u011d"+
		"\u011f\u0005\u001e\u0000\u0000\u011e\u0120\u00032\u0019\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0123\u0005\u001c\u0000\u0000\u0122\u0124"+
		"\u00036\u001b\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0005"+
		"\u001c\u0000\u0000\u0126\u0128\u0003&\u0013\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0005\u001f\u0000\u0000\u012a\u012b\u00034\u001a"+
		"\u0000\u012b1\u0001\u0000\u0000\u0000\u012c\u012f\u0003$\u0012\u0000\u012d"+
		"\u012f\u0003&\u0013\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012f3\u0001\u0000\u0000\u0000\u0130\u0134\u0005"+
		" \u0000\u0000\u0131\u0133\u0003\u0010\b\u0000\u0132\u0131\u0001\u0000"+
		"\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000"+
		"\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0005!\u0000"+
		"\u0000\u01385\u0001\u0000\u0000\u0000\u0139\u013a\u0006\u001b\uffff\uffff"+
		"\u0000\u013a\u013b\u0005\u001e\u0000\u0000\u013b\u013c\u00036\u001b\u0000"+
		"\u013c\u013d\u0005\u001f\u0000\u0000\u013d\u0145\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0007\u0001\u0000\u0000\u013f\u0145\u00036\u001b\u000e\u0140"+
		"\u0145\u0003\u001e\u000f\u0000\u0141\u0145\u0005S\u0000\u0000\u0142\u0145"+
		"\u00038\u001c\u0000\u0143\u0145\u0003:\u001d\u0000\u0144\u0139\u0001\u0000"+
		"\u0000\u0000\u0144\u013e\u0001\u0000\u0000\u0000\u0144\u0140\u0001\u0000"+
		"\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0166\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\n\r\u0000\u0000\u0147\u0148\u0007\u0002\u0000"+
		"\u0000\u0148\u0165\u00036\u001b\u000e\u0149\u014a\n\f\u0000\u0000\u014a"+
		"\u014b\u00050\u0000\u0000\u014b\u0165\u00036\u001b\r\u014c\u014d\n\u000b"+
		"\u0000\u0000\u014d\u014e\u0007\u0003\u0000\u0000\u014e\u0165\u00036\u001b"+
		"\f\u014f\u0150\n\n\u0000\u0000\u0150\u0151\u0007\u0004\u0000\u0000\u0151"+
		"\u0165\u00036\u001b\u000b\u0152\u0153\n\t\u0000\u0000\u0153\u0154\u0007"+
		"\u0005\u0000\u0000\u0154\u0165\u00036\u001b\n\u0155\u0156\n\b\u0000\u0000"+
		"\u0156\u0157\u0007\u0006\u0000\u0000\u0157\u0165\u00036\u001b\t\u0158"+
		"\u0159\n\u0007\u0000\u0000\u0159\u015a\u0007\u0007\u0000\u0000\u015a\u0165"+
		"\u00036\u001b\b\u015b\u015c\n\u0006\u0000\u0000\u015c\u015d\u0007\b\u0000"+
		"\u0000\u015d\u0165\u00036\u001b\u0007\u015e\u015f\n\u0005\u0000\u0000"+
		"\u015f\u0160\u0005\u001a\u0000\u0000\u0160\u0161\u00036\u001b\u0000\u0161"+
		"\u0162\u0005\u001b\u0000\u0000\u0162\u0163\u00036\u001b\u0006\u0163\u0165"+
		"\u0001\u0000\u0000\u0000\u0164\u0146\u0001\u0000\u0000\u0000\u0164\u0149"+
		"\u0001\u0000\u0000\u0000\u0164\u014c\u0001\u0000\u0000\u0000\u0164\u014f"+
		"\u0001\u0000\u0000\u0000\u0164\u0152\u0001\u0000\u0000\u0000\u0164\u0155"+
		"\u0001\u0000\u0000\u0000\u0164\u0158\u0001\u0000\u0000\u0000\u0164\u015b"+
		"\u0001\u0000\u0000\u0000\u0164\u015e\u0001\u0000\u0000\u0000\u0165\u0168"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u01677\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0169\u0170\u0005Q\u0000\u0000\u016a\u0170\u0005R\u0000"+
		"\u0000\u016b\u0170\u0005P\u0000\u0000\u016c\u0170\u0005O\u0000\u0000\u016d"+
		"\u0170\u0003<\u001e\u0000\u016e\u0170\u0003:\u001d\u0000\u016f\u0169\u0001"+
		"\u0000\u0000\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u016f\u016b\u0001"+
		"\u0000\u0000\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u01709\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0005\"\u0000\u0000\u0172\u0177\u00036\u001b"+
		"\u0000\u0173\u0174\u0005\u001d\u0000\u0000\u0174\u0176\u00036\u001b\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005#\u0000\u0000\u017b;\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0007\t\u0000\u0000\u017d=\u0001\u0000\u0000\u0000\u017e\u017f\u0007"+
		"\n\u0000\u0000\u017f?\u0001\u0000\u0000\u0000\u001fCIOVbnw\u0082\u008c"+
		"\u00ab\u00b5\u00b9\u00c3\u00cb\u00d9\u00dd\u00e8\u00ef\u00f8\u010f\u0114"+
		"\u011f\u0123\u0127\u012e\u0134\u0144\u0164\u0166\u016f\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}