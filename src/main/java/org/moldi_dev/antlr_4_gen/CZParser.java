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
		SWITCH=22, CASE=23, DEFAULT=24, DEFINE=25, STANDARD_INCLUDE_DIRECTIVE=26, 
		QUESTION=27, COLON=28, SEMICOLON=29, COMMA=30, LEFT_PARENTHESIS=31, RIGHT_PARENTHESIS=32, 
		LEFT_BRACE=33, RIGHT_BRACE=34, LEFT_BRACKET=35, RIGHT_BRACKET=36, ASSIGNMENT=37, 
		MODULUS=38, EQUALS=39, NOT=40, NOT_EQUALS=41, LESS_THAN=42, GREATER_THAN=43, 
		LESS_THAN_OR_EQUAL=44, GREATER_THAN_OR_EQUAL=45, ADDITION=46, SUBTRACTION=47, 
		MULTIPLICATION=48, POWER=49, DIVISION=50, LOGICAL_AND=51, LOGICAL_OR=52, 
		BITWISE_AND=53, BITWISE_OR=54, BITWISE_XOR=55, BITWISE_NOT=56, SHIFT_LEFT=57, 
		SHIFT_RIGHT=58, SINE=59, COSINE=60, HYPERBOLIC_SINE=61, HYPERBOLIC_COSINE=62, 
		DEGREES_TO_RADIANS=63, RADIANS_TO_DEGREES=64, EXPONENTIAL=65, LOGARITHM=66, 
		ARRAY_LENGTH=67, ARRAY_GET_AT=68, ARRAY_SET_AT=69, ARRAY_COPY=70, ARRAY_CONTAINS=71, 
		ARRAY_INDEX_OF=72, ARRAY_COUNT=73, ARRAY_INSERT_FIRST=74, ARRAY_INSERT_AT=75, 
		ARRAY_INSERT_LAST=76, ARRAY_DELETE_FIRST=77, ARRAY_DELETE_AT=78, ARRAY_DELETE_LAST=79, 
		STRING_SLICE=80, STRING_SPLIT=81, STRING_SUBSTRING=82, INT_TO_DOUBLE=83, 
		DOUBLE_TO_INT=84, BOOLEAN_TO_INT=85, STRING_TO_INT=86, STRING_TO_DOUBLE=87, 
		INT_TO_STRING=88, DOUBLE_TO_STRING=89, STRING_LITERAL=90, CHARACTER=91, 
		INTEGER_NUMBER=92, DOUBLE_NUMBER=93, IDENTIFIER=94, COMMENT=95, WS=96, 
		UNEXPECTED_CHAR=97;
	public static final int
		RULE_program = 0, RULE_headers = 1, RULE_define_directive = 2, RULE_main_function = 3, 
		RULE_function = 4, RULE_function_block = 5, RULE_function_declaration = 6, 
		RULE_parameters = 7, RULE_parameter = 8, RULE_statement = 9, RULE_switch_statement = 10, 
		RULE_switch_block = 11, RULE_default_block = 12, RULE_break_statement = 13, 
		RULE_continue_statement = 14, RULE_return_statement = 15, RULE_function_call = 16, 
		RULE_standard_function = 17, RULE_arguments = 18, RULE_declaration = 19, 
		RULE_assignment = 20, RULE_print_statement = 21, RULE_read_statement = 22, 
		RULE_if_statement = 23, RULE_while_statement = 24, RULE_for_statement = 25, 
		RULE_for_init = 26, RULE_block = 27, RULE_expression = 28, RULE_literal = 29, 
		RULE_array_literal = 30, RULE_boolean_literal = 31, RULE_type_ = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "headers", "define_directive", "main_function", "function", 
			"function_block", "function_declaration", "parameters", "parameter", 
			"statement", "switch_statement", "switch_block", "default_block", "break_statement", 
			"continue_statement", "return_statement", "function_call", "standard_function", 
			"arguments", "declaration", "assignment", "print_statement", "read_statement", 
			"if_statement", "while_statement", "for_statement", "for_init", "block", 
			"expression", "literal", "array_literal", "boolean_literal", "type_"
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
			"CASE", "DEFAULT", "DEFINE", "STANDARD_INCLUDE_DIRECTIVE", "QUESTION", 
			"COLON", "SEMICOLON", "COMMA", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "ASSIGNMENT", 
			"MODULUS", "EQUALS", "NOT", "NOT_EQUALS", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "ADDITION", "SUBTRACTION", 
			"MULTIPLICATION", "POWER", "DIVISION", "LOGICAL_AND", "LOGICAL_OR", "BITWISE_AND", 
			"BITWISE_OR", "BITWISE_XOR", "BITWISE_NOT", "SHIFT_LEFT", "SHIFT_RIGHT", 
			"SINE", "COSINE", "HYPERBOLIC_SINE", "HYPERBOLIC_COSINE", "DEGREES_TO_RADIANS", 
			"RADIANS_TO_DEGREES", "EXPONENTIAL", "LOGARITHM", "ARRAY_LENGTH", "ARRAY_GET_AT", 
			"ARRAY_SET_AT", "ARRAY_COPY", "ARRAY_CONTAINS", "ARRAY_INDEX_OF", "ARRAY_COUNT", 
			"ARRAY_INSERT_FIRST", "ARRAY_INSERT_AT", "ARRAY_INSERT_LAST", "ARRAY_DELETE_FIRST", 
			"ARRAY_DELETE_AT", "ARRAY_DELETE_LAST", "STRING_SLICE", "STRING_SPLIT", 
			"STRING_SUBSTRING", "INT_TO_DOUBLE", "DOUBLE_TO_INT", "BOOLEAN_TO_INT", 
			"STRING_TO_INT", "STRING_TO_DOUBLE", "INT_TO_STRING", "DOUBLE_TO_STRING", 
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
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
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
			setState(66);
			headers();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				setState(67);
				define_directive();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					function_declaration();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					function();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(85);
			main_function();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				{
				setState(86);
				function();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
	public static class HeadersContext extends ParserRuleContext {
		public TerminalNode STANDARD_INCLUDE_DIRECTIVE() { return getToken(CZParser.STANDARD_INCLUDE_DIRECTIVE, 0); }
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CZListener ) ((CZListener)listener).exitHeaders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CZVisitor ) return ((CZVisitor<? extends T>)visitor).visitHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(STANDARD_INCLUDE_DIRECTIVE);
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
		enterRule(_localctx, 4, RULE_define_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DEFINE);
			setState(97);
			match(IDENTIFIER);
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				{
				setState(98);
				match(INTEGER_NUMBER);
				}
				break;
			case DOUBLE_NUMBER:
				{
				setState(99);
				match(DOUBLE_NUMBER);
				}
				break;
			case STRING_LITERAL:
				{
				setState(100);
				match(STRING_LITERAL);
				}
				break;
			case CHARACTER:
				{
				setState(101);
				match(CHARACTER);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(102);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 6, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(INT);
			setState(106);
			match(MAIN);
			setState(107);
			match(LEFT_PARENTHESIS);
			setState(108);
			match(RIGHT_PARENTHESIS);
			setState(109);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type_();
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(LEFT_PARENTHESIS);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				setState(114);
				parameters();
				}
			}

			setState(117);
			match(RIGHT_PARENTHESIS);
			setState(118);
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
		enterRule(_localctx, 10, RULE_function_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LEFT_BRACE);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					statement();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(127);
			return_statement();
			setState(128);
			match(SEMICOLON);
			setState(129);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 12, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			type_();
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(LEFT_PARENTHESIS);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				setState(134);
				parameters();
				}
			}

			setState(137);
			match(RIGHT_PARENTHESIS);
			setState(138);
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
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			parameter();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				parameter();
				}
				}
				setState(147);
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
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			type_();
			setState(149);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				declaration();
				setState(152);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				assignment();
				setState(155);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				print_statement();
				setState(158);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				read_statement();
				setState(161);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				break_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(168);
				continue_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(169);
				expression(0);
				setState(170);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				return_statement();
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(175);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 20, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SWITCH);
			setState(179);
			match(LEFT_PARENTHESIS);
			setState(180);
			expression(0);
			setState(181);
			match(RIGHT_PARENTHESIS);
			setState(182);
			match(LEFT_BRACE);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(183);
				switch_block();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(189);
				default_block();
				}
			}

			setState(192);
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
		enterRule(_localctx, 22, RULE_switch_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CASE);
			setState(195);
			literal();
			setState(196);
			match(COLON);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402013650427906L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				{
				setState(197);
				statement();
				}
				}
				setState(202);
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
		enterRule(_localctx, 24, RULE_default_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(DEFAULT);
			setState(204);
			match(COLON);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402013650427906L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(210);
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
		enterRule(_localctx, 26, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(BREAK);
			setState(212);
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
		enterRule(_localctx, 28, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CONTINUE);
			setState(215);
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
		enterRule(_localctx, 30, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(RETURN);
			setState(218);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 32, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(220);
				match(IDENTIFIER);
				}
				break;
			case SINE:
			case COSINE:
			case HYPERBOLIC_SINE:
			case HYPERBOLIC_COSINE:
			case DEGREES_TO_RADIANS:
			case RADIANS_TO_DEGREES:
			case EXPONENTIAL:
			case LOGARITHM:
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
			case STRING_SLICE:
			case STRING_SPLIT:
			case STRING_SUBSTRING:
			case INT_TO_DOUBLE:
			case DOUBLE_TO_INT:
			case BOOLEAN_TO_INT:
			case STRING_TO_INT:
			case STRING_TO_DOUBLE:
			case INT_TO_STRING:
			case DOUBLE_TO_STRING:
				{
				setState(221);
				standard_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			match(LEFT_PARENTHESIS);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402022245859328L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				setState(225);
				arguments();
				}
			}

			setState(228);
			match(RIGHT_PARENTHESIS);
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
		public TerminalNode HYPERBOLIC_SINE() { return getToken(CZParser.HYPERBOLIC_SINE, 0); }
		public TerminalNode HYPERBOLIC_COSINE() { return getToken(CZParser.HYPERBOLIC_COSINE, 0); }
		public TerminalNode DEGREES_TO_RADIANS() { return getToken(CZParser.DEGREES_TO_RADIANS, 0); }
		public TerminalNode RADIANS_TO_DEGREES() { return getToken(CZParser.RADIANS_TO_DEGREES, 0); }
		public TerminalNode EXPONENTIAL() { return getToken(CZParser.EXPONENTIAL, 0); }
		public TerminalNode LOGARITHM() { return getToken(CZParser.LOGARITHM, 0); }
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
		public TerminalNode STRING_SLICE() { return getToken(CZParser.STRING_SLICE, 0); }
		public TerminalNode STRING_SPLIT() { return getToken(CZParser.STRING_SPLIT, 0); }
		public TerminalNode STRING_SUBSTRING() { return getToken(CZParser.STRING_SUBSTRING, 0); }
		public TerminalNode INT_TO_DOUBLE() { return getToken(CZParser.INT_TO_DOUBLE, 0); }
		public TerminalNode DOUBLE_TO_INT() { return getToken(CZParser.DOUBLE_TO_INT, 0); }
		public TerminalNode BOOLEAN_TO_INT() { return getToken(CZParser.BOOLEAN_TO_INT, 0); }
		public TerminalNode STRING_TO_INT() { return getToken(CZParser.STRING_TO_INT, 0); }
		public TerminalNode STRING_TO_DOUBLE() { return getToken(CZParser.STRING_TO_DOUBLE, 0); }
		public TerminalNode INT_TO_STRING() { return getToken(CZParser.INT_TO_STRING, 0); }
		public TerminalNode DOUBLE_TO_STRING() { return getToken(CZParser.DOUBLE_TO_STRING, 0); }
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
		enterRule(_localctx, 34, RULE_standard_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 2147483647L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expression(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				expression(0);
				}
				}
				setState(239);
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
		enterRule(_localctx, 38, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((DeclarationContext)_localctx).type = type_();
			setState(241);
			match(IDENTIFIER);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(242);
				match(ASSIGNMENT);
				setState(243);
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IDENTIFIER);
			setState(247);
			match(ASSIGNMENT);
			setState(248);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 42, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PRINT);
			setState(251);
			match(LEFT_PARENTHESIS);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402022245859328L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				setState(252);
				arguments();
				}
			}

			setState(255);
			match(RIGHT_PARENTHESIS);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CZParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 44, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(READ);
			setState(258);
			match(LEFT_PARENTHESIS);
			setState(259);
			match(IDENTIFIER);
			setState(260);
			match(RIGHT_PARENTHESIS);
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
		public List<TerminalNode> LEFT_PARENTHESIS() { return getTokens(CZParser.LEFT_PARENTHESIS); }
		public TerminalNode LEFT_PARENTHESIS(int i) {
			return getToken(CZParser.LEFT_PARENTHESIS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(CZParser.RIGHT_PARENTHESIS); }
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(CZParser.RIGHT_PARENTHESIS, i);
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
		enterRule(_localctx, 46, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IF);
			setState(263);
			match(LEFT_PARENTHESIS);
			setState(264);
			expression(0);
			setState(265);
			match(RIGHT_PARENTHESIS);
			setState(266);
			block();
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(ELSE);
					setState(268);
					match(IF);
					setState(269);
					match(LEFT_PARENTHESIS);
					setState(270);
					expression(0);
					setState(271);
					match(RIGHT_PARENTHESIS);
					setState(272);
					block();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(279);
				match(ELSE);
				setState(280);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 48, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(WHILE);
			setState(284);
			match(LEFT_PARENTHESIS);
			setState(285);
			expression(0);
			setState(286);
			match(RIGHT_PARENTHESIS);
			setState(287);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CZParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CZParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 50, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FOR);
			setState(290);
			match(LEFT_PARENTHESIS);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0) || _la==IDENTIFIER) {
				{
				setState(291);
				for_init();
				}
			}

			setState(294);
			match(SEMICOLON);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402022245859328L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				setState(295);
				expression(0);
				}
			}

			setState(298);
			match(SEMICOLON);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(299);
				assignment();
				}
			}

			setState(302);
			match(RIGHT_PARENTHESIS);
			setState(303);
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
		enterRule(_localctx, 52, RULE_for_init);
		try {
			setState(307);
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
				setState(305);
				declaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
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
		enterRule(_localctx, 54, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(LEFT_BRACE);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402013650427906L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				{
				setState(310);
				statement();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
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
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CZParser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CZParser.RIGHT_PARENTHESIS, 0); }
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(319);
				match(LEFT_PARENTHESIS);
				setState(320);
				expression(0);
				setState(321);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
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
				setState(324);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				array_literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(332);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407649761460224L) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						((MultiplicativeExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PowerExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(335);
						((PowerExpressionContext)_localctx).op = match(POWER);
						setState(336);
						((PowerExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(338);
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
						setState(339);
						((AdditiveExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(341);
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
						setState(342);
						((ShiftExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(344);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697666560L) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						((RelationalExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(347);
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
						setState(348);
						((EqualityExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(350);
						((BitwiseExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0)) ) {
							((BitwiseExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(351);
						((BitwiseExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 8:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(353);
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
						setState(354);
						((LogicalExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 9:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(356);
						match(QUESTION);
						setState(357);
						((TernaryExpressionContext)_localctx).trueExpr = expression(0);
						setState(358);
						match(COLON);
						setState(359);
						((TernaryExpressionContext)_localctx).falseExpr = expression(6);
						}
						break;
					}
					} 
				}
				setState(365);
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
		enterRule(_localctx, 58, RULE_literal);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(INTEGER_NUMBER);
				}
				break;
			case DOUBLE_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(DOUBLE_NUMBER);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(CHARACTER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				boolean_literal();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
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
		public TerminalNode RIGHT_BRACKET() { return getToken(CZParser.RIGHT_BRACKET, 0); }
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
		enterRule(_localctx, 60, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LEFT_BRACKET);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -504402022245859328L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2147483647L) != 0)) {
				{
				{
				setState(375);
				expression(0);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(377);
					expression(0);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		enterRule(_localctx, 62, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 64, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		case 28:
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
		"\u0004\u0001a\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0005\u0000K\b\u0000\n"+
		"\u0000\f\u0000N\t\u0000\u0001\u0000\u0005\u0000Q\b\u0000\n\u0000\f\u0000"+
		"T\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000X\b\u0000\n\u0000\f\u0000"+
		"[\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002h\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004t\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005{\b\u0005\n\u0005\f\u0005~\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0090\b\u0007\n\u0007"+
		"\f\u0007\u0093\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b1\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b9\b\n\n\n\f\n\u00bc\t\n\u0001\n"+
		"\u0003\n\u00bf\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00c7\b\u000b\n\u000b\f\u000b\u00ca\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00cf\b\f\n\f\f\f\u00d2\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00df\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00e3\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ec\b\u0012\n"+
		"\u0012\f\u0012\u00ef\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00f5\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00fe\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0113\b\u0017\n\u0017\f\u0017\u0116\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u011a\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0125\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0129\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u012d\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0134\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0138\b\u001b\n\u001b\f\u001b\u013b\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u014a\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u016a\b\u001c\n\u001c"+
		"\f\u001c\u016d\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0175\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u017b\b\u001e\n\u001e\f\u001e\u017e"+
		"\t\u001e\u0005\u001e\u0180\b\u001e\n\u001e\f\u001e\u0183\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0000"+
		"\u00018!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u000b\u0001\u0000;Y\u0002\u0000"+
		"((88\u0003\u0000&&0022\u0001\u0000./\u0001\u00009:\u0001\u0000*-\u0002"+
		"\u0000\'\'))\u0001\u000057\u0001\u000034\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u0001\t\u01a6\u0000B\u0001\u0000\u0000\u0000\u0002^\u0001\u0000"+
		"\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000"+
		"\bo\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000"+
		"\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000"+
		"\u0000\u0000\u0012\u00b0\u0001\u0000\u0000\u0000\u0014\u00b2\u0001\u0000"+
		"\u0000\u0000\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u00cb\u0001\u0000"+
		"\u0000\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c\u00d6\u0001\u0000"+
		"\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000 \u00de\u0001\u0000\u0000"+
		"\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00e8\u0001\u0000\u0000\u0000"+
		"&\u00f0\u0001\u0000\u0000\u0000(\u00f6\u0001\u0000\u0000\u0000*\u00fa"+
		"\u0001\u0000\u0000\u0000,\u0101\u0001\u0000\u0000\u0000.\u0106\u0001\u0000"+
		"\u0000\u00000\u011b\u0001\u0000\u0000\u00002\u0121\u0001\u0000\u0000\u0000"+
		"4\u0133\u0001\u0000\u0000\u00006\u0135\u0001\u0000\u0000\u00008\u0149"+
		"\u0001\u0000\u0000\u0000:\u0174\u0001\u0000\u0000\u0000<\u0176\u0001\u0000"+
		"\u0000\u0000>\u0186\u0001\u0000\u0000\u0000@\u0188\u0001\u0000\u0000\u0000"+
		"BF\u0003\u0002\u0001\u0000CE\u0003\u0004\u0002\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GL\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003"+
		"\f\u0006\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MR\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OQ\u0003\b\u0004\u0000PO\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UY\u0003\u0006"+
		"\u0003\u0000VX\u0003\b\u0004\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0000\u0000\u0001"+
		"]\u0001\u0001\u0000\u0000\u0000^_\u0005\u001a\u0000\u0000_\u0003\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0019\u0000\u0000ag\u0005^\u0000\u0000bh\u0005"+
		"\\\u0000\u0000ch\u0005]\u0000\u0000dh\u0005Z\u0000\u0000eh\u0005[\u0000"+
		"\u0000fh\u0003>\u001f\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000h\u0005\u0001\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000"+
		"jk\u0005\u0015\u0000\u0000kl\u0005\u001f\u0000\u0000lm\u0005 \u0000\u0000"+
		"mn\u0003\n\u0005\u0000n\u0007\u0001\u0000\u0000\u0000op\u0003@ \u0000"+
		"pq\u0005^\u0000\u0000qs\u0005\u001f\u0000\u0000rt\u0003\u000e\u0007\u0000"+
		"sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0005 \u0000\u0000vw\u0003\n\u0005\u0000w\t\u0001\u0000\u0000"+
		"\u0000x|\u0005!\u0000\u0000y{\u0003\u0012\t\u0000zy\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\u001e\u000f\u0000\u0080\u0081\u0005\u001d\u0000\u0000"+
		"\u0081\u0082\u0005\"\u0000\u0000\u0082\u000b\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0003@ \u0000\u0084\u0085\u0005^\u0000\u0000\u0085\u0087\u0005"+
		"\u001f\u0000\u0000\u0086\u0088\u0003\u000e\u0007\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005 \u0000\u0000\u008a\u008b\u0005\u001d"+
		"\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u0091\u0003\u0010\b"+
		"\u0000\u008d\u008e\u0005\u001e\u0000\u0000\u008e\u0090\u0003\u0010\b\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0003@ \u0000\u0095\u0096\u0005^\u0000\u0000\u0096\u0011"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0003&\u0013\u0000\u0098\u0099\u0005"+
		"\u001d\u0000\u0000\u0099\u00b1\u0001\u0000\u0000\u0000\u009a\u009b\u0003"+
		"(\u0014\u0000\u009b\u009c\u0005\u001d\u0000\u0000\u009c\u00b1\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0003*\u0015\u0000\u009e\u009f\u0005\u001d\u0000"+
		"\u0000\u009f\u00b1\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003,\u0016\u0000"+
		"\u00a1\u00a2\u0005\u001d\u0000\u0000\u00a2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00b1\u0003.\u0017\u0000\u00a4\u00b1\u00030\u0018\u0000\u00a5\u00b1"+
		"\u00032\u0019\u0000\u00a6\u00b1\u00036\u001b\u0000\u00a7\u00b1\u0003\u001a"+
		"\r\u0000\u00a8\u00b1\u0003\u001c\u000e\u0000\u00a9\u00aa\u00038\u001c"+
		"\u0000\u00aa\u00ab\u0005\u001d\u0000\u0000\u00ab\u00b1\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0003\u001e\u000f\u0000\u00ad\u00ae\u0005\u001d\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b1\u0003\u0014\n\u0000"+
		"\u00b0\u0097\u0001\u0000\u0000\u0000\u00b0\u009a\u0001\u0000\u0000\u0000"+
		"\u00b0\u009d\u0001\u0000\u0000\u0000\u00b0\u00a0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a3\u0001\u0000\u0000\u0000\u00b0\u00a4\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a5\u0001\u0000\u0000\u0000\u00b0\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u0013\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0016\u0000\u0000\u00b3\u00b4\u0005\u001f\u0000\u0000"+
		"\u00b4\u00b5\u00038\u001c\u0000\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u00ba"+
		"\u0005!\u0000\u0000\u00b7\u00b9\u0003\u0016\u000b\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003"+
		"\u0018\f\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\"\u0000"+
		"\u0000\u00c1\u0015\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0017\u0000"+
		"\u0000\u00c3\u00c4\u0003:\u001d\u0000\u00c4\u00c8\u0005\u001c\u0000\u0000"+
		"\u00c5\u00c7\u0003\u0012\t\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0018\u0000\u0000\u00cc"+
		"\u00d0\u0005\u001c\u0000\u0000\u00cd\u00cf\u0003\u0012\t\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u0019"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u0010\u0000\u0000\u00d4\u00d5\u0005\u001d\u0000\u0000\u00d5\u001b"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0011\u0000\u0000\u00d7\u00d8"+
		"\u0005\u001d\u0000\u0000\u00d8\u001d\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0014\u0000\u0000\u00da\u00db\u00038\u001c\u0000\u00db\u001f\u0001"+
		"\u0000\u0000\u0000\u00dc\u00df\u0005^\u0000\u0000\u00dd\u00df\u0003\""+
		"\u0011\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0005\u001f"+
		"\u0000\u0000\u00e1\u00e3\u0003$\u0012\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005 \u0000\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0007\u0000\u0000\u0000\u00e7#\u0001\u0000\u0000\u0000\u00e8\u00ed"+
		"\u00038\u001c\u0000\u00e9\u00ea\u0005\u001e\u0000\u0000\u00ea\u00ec\u0003"+
		"8\u001c\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0003@ \u0000\u00f1\u00f4\u0005^\u0000\u0000\u00f2"+
		"\u00f3\u0005%\u0000\u0000\u00f3\u00f5\u00038\u001c\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\'\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005^\u0000\u0000\u00f7\u00f8\u0005%\u0000\u0000"+
		"\u00f8\u00f9\u00038\u001c\u0000\u00f9)\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005\n\u0000\u0000\u00fb\u00fd\u0005\u001f\u0000\u0000\u00fc\u00fe\u0003"+
		"$\u0012\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0005 \u0000"+
		"\u0000\u0100+\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u000b\u0000\u0000"+
		"\u0102\u0103\u0005\u001f\u0000\u0000\u0103\u0104\u0005^\u0000\u0000\u0104"+
		"\u0105\u0005 \u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\f\u0000\u0000\u0107\u0108\u0005\u001f\u0000\u0000\u0108\u0109\u00038"+
		"\u001c\u0000\u0109\u010a\u0005 \u0000\u0000\u010a\u0114\u00036\u001b\u0000"+
		"\u010b\u010c\u0005\r\u0000\u0000\u010c\u010d\u0005\f\u0000\u0000\u010d"+
		"\u010e\u0005\u001f\u0000\u0000\u010e\u010f\u00038\u001c\u0000\u010f\u0110"+
		"\u0005 \u0000\u0000\u0110\u0111\u00036\u001b\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u010b\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0119\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\r\u0000\u0000\u0118\u011a\u00036\u001b"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a/\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u000e\u0000\u0000"+
		"\u011c\u011d\u0005\u001f\u0000\u0000\u011d\u011e\u00038\u001c\u0000\u011e"+
		"\u011f\u0005 \u0000\u0000\u011f\u0120\u00036\u001b\u0000\u01201\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005\u000f\u0000\u0000\u0122\u0124\u0005"+
		"\u001f\u0000\u0000\u0123\u0125\u00034\u001a\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u0005\u001d\u0000\u0000\u0127\u0129\u00038\u001c"+
		"\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0005\u001d\u0000"+
		"\u0000\u012b\u012d\u0003(\u0014\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005 \u0000\u0000\u012f\u0130\u00036\u001b\u0000\u01303"+
		"\u0001\u0000\u0000\u0000\u0131\u0134\u0003&\u0013\u0000\u0132\u0134\u0003"+
		"(\u0014\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u01345\u0001\u0000\u0000\u0000\u0135\u0139\u0005!\u0000\u0000"+
		"\u0136\u0138\u0003\u0012\t\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013c\u013d\u0005\"\u0000\u0000\u013d7"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u001c\uffff\uffff\u0000\u013f"+
		"\u0140\u0005\u001f\u0000\u0000\u0140\u0141\u00038\u001c\u0000\u0141\u0142"+
		"\u0005 \u0000\u0000\u0142\u014a\u0001\u0000\u0000\u0000\u0143\u0144\u0007"+
		"\u0001\u0000\u0000\u0144\u014a\u00038\u001c\u000e\u0145\u014a\u0003 \u0010"+
		"\u0000\u0146\u014a\u0005^\u0000\u0000\u0147\u014a\u0003:\u001d\u0000\u0148"+
		"\u014a\u0003<\u001e\u0000\u0149\u013e\u0001\u0000\u0000\u0000\u0149\u0143"+
		"\u0001\u0000\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u016b\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\n\r\u0000\u0000\u014c\u014d\u0007\u0002\u0000\u0000\u014d\u016a\u0003"+
		"8\u001c\u000e\u014e\u014f\n\f\u0000\u0000\u014f\u0150\u00051\u0000\u0000"+
		"\u0150\u016a\u00038\u001c\r\u0151\u0152\n\u000b\u0000\u0000\u0152\u0153"+
		"\u0007\u0003\u0000\u0000\u0153\u016a\u00038\u001c\f\u0154\u0155\n\n\u0000"+
		"\u0000\u0155\u0156\u0007\u0004\u0000\u0000\u0156\u016a\u00038\u001c\u000b"+
		"\u0157\u0158\n\t\u0000\u0000\u0158\u0159\u0007\u0005\u0000\u0000\u0159"+
		"\u016a\u00038\u001c\n\u015a\u015b\n\b\u0000\u0000\u015b\u015c\u0007\u0006"+
		"\u0000\u0000\u015c\u016a\u00038\u001c\t\u015d\u015e\n\u0007\u0000\u0000"+
		"\u015e\u015f\u0007\u0007\u0000\u0000\u015f\u016a\u00038\u001c\b\u0160"+
		"\u0161\n\u0006\u0000\u0000\u0161\u0162\u0007\b\u0000\u0000\u0162\u016a"+
		"\u00038\u001c\u0007\u0163\u0164\n\u0005\u0000\u0000\u0164\u0165\u0005"+
		"\u001b\u0000\u0000\u0165\u0166\u00038\u001c\u0000\u0166\u0167\u0005\u001c"+
		"\u0000\u0000\u0167\u0168\u00038\u001c\u0006\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u014b\u0001\u0000\u0000\u0000\u0169\u014e\u0001\u0000\u0000"+
		"\u0000\u0169\u0151\u0001\u0000\u0000\u0000\u0169\u0154\u0001\u0000\u0000"+
		"\u0000\u0169\u0157\u0001\u0000\u0000\u0000\u0169\u015a\u0001\u0000\u0000"+
		"\u0000\u0169\u015d\u0001\u0000\u0000\u0000\u0169\u0160\u0001\u0000\u0000"+
		"\u0000\u0169\u0163\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c9\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016e\u0175\u0005\\\u0000\u0000\u016f\u0175\u0005]\u0000\u0000\u0170"+
		"\u0175\u0005[\u0000\u0000\u0171\u0175\u0005Z\u0000\u0000\u0172\u0175\u0003"+
		">\u001f\u0000\u0173\u0175\u0003<\u001e\u0000\u0174\u016e\u0001\u0000\u0000"+
		"\u0000\u0174\u016f\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000"+
		"\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175;\u0001\u0000\u0000\u0000"+
		"\u0176\u0181\u0005#\u0000\u0000\u0177\u017c\u00038\u001c\u0000\u0178\u0179"+
		"\u0005\u001e\u0000\u0000\u0179\u017b\u00038\u001c\u0000\u017a\u0178\u0001"+
		"\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0177\u0001"+
		"\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"$\u0000\u0000\u0185=\u0001\u0000\u0000\u0000\u0186\u0187\u0007\t\u0000"+
		"\u0000\u0187?\u0001\u0000\u0000\u0000\u0188\u0189\u0007\n\u0000\u0000"+
		"\u0189A\u0001\u0000\u0000\u0000 FLRYgs|\u0087\u0091\u00b0\u00ba\u00be"+
		"\u00c8\u00d0\u00de\u00e2\u00ed\u00f4\u00fd\u0114\u0119\u0124\u0128\u012c"+
		"\u0133\u0139\u0149\u0169\u016b\u0174\u017c\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}