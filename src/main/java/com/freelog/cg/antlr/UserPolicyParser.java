// Generated from generated_grammars/UserPolicy.g4 by ANTLR 4.8

    package com.freelog.cg.antlr;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserPolicyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELF=8, TERMINATE=9, 
		SUBJECT_ID=10, UOID=11, ACCOUNT_NUMBER=12, SUBJECT_SERVICE_NAME=13, EVENT_SERVICE_NAME=14, 
		ANY_CONTRACT=15, WITH=16, OF=17, REQUIRE=18, USER_ID=19, FEATHER=20, BARB=21, 
		INT=22, MONEY_AMOUNT=23, TIME=24, DATE=25, PHONE_NUMBER_CN_MOBILE=26, 
		EMAIL=27, PERIOD=28, ID=29, WS=30, LPAREN=31, RPAREN=32, PLUS=33, MINUS=34, 
		TIMES=35, DIV=36, GT=37, LT=38, EQ=39, COMMA=40, POINT=41, POW=42, PI=43, 
		SCIENTIFIC_NUMBER=44, EULER=45, SUM=46;
	public static final int
		RULE_policy = 0, RULE_requirement = 1, RULE_contract_with_subject = 2, 
		RULE_declaration_section = 3, RULE_declaration_statements = 4, RULE_state_definition_section = 5, 
		RULE_state_definition = 6, RULE_state_transition = 7, RULE_state_name = 8, 
		RULE_service_state = 9, RULE_subject_id = 10, RULE_event = 11, RULE_event_path = 12, 
		RULE_event_name = 13, RULE_expression_test = 14, RULE_expression_call_or_literal = 15, 
		RULE_expression_assignment = 16, RULE_expression_call = 17, RULE_expression_call_argument = 18, 
		RULE_expression_handle = 19, RULE_expression = 20, RULE_multiplyingExpression = 21, 
		RULE_powExpression = 22, RULE_signedAtom = 23, RULE_built_in_function = 24, 
		RULE_funcname = 25, RULE_atom = 26, RULE_scientific = 27, RULE_constant = 28, 
		RULE_variable = 29, RULE_environment_variable = 30, RULE_entity_bracket = 31, 
		RULE_subject_service = 32, RULE_event_service = 33, RULE_subject = 34, 
		RULE_account = 35, RULE_user_organization_name = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"policy", "requirement", "contract_with_subject", "declaration_section", 
			"declaration_statements", "state_definition_section", "state_definition", 
			"state_transition", "state_name", "service_state", "subject_id", "event", 
			"event_path", "event_name", "expression_test", "expression_call_or_literal", 
			"expression_assignment", "expression_call", "expression_call_argument", 
			"expression_handle", "expression", "multiplyingExpression", "powExpression", 
			"signedAtom", "built_in_function", "funcname", "atom", "scientific", 
			"constant", "variable", "environment_variable", "entity_bracket", "subject_service", 
			"event_service", "subject", "account", "user_organization_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'contract'", "':'", "'proceed'", "'to'", "'on'", "'authorized'", 
			"'unauthorized'", "'self'", "'terminate'", null, null, null, null, null, 
			"'AnyContract'", "'with'", "'of'", "'require'", null, "'feather'", "'barb'", 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", 
			null, "'e'", "'sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SELF", "TERMINATE", 
			"SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", 
			"ANY_CONTRACT", "WITH", "OF", "REQUIRE", "USER_ID", "FEATHER", "BARB", 
			"INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", "EMAIL", 
			"PERIOD", "ID", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "SCIENTIFIC_NUMBER", 
			"EULER", "SUM"
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
	public String getGrammarFileName() { return "UserPolicy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static Stack<String> stack = new Stack<>();

	    public static void putCycle(String cycle){
	        stack.push(cycle);
	    }

	    public static void popCycle(){
	        if(!stack.isEmpty()){
	            stack.pop();
	        }
	    }

	    public static String getCycle(){
	        if(!stack.isEmpty()){
	            return stack.peek();
	        }else{
	            return null;
	        }
	    }

	public UserPolicyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PolicyContext extends ParserRuleContext {
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public State_definition_sectionContext state_definition_section() {
			return getRuleContext(State_definition_sectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UserPolicyParser.EOF, 0); }
		public Declaration_sectionContext declaration_section() {
			return getRuleContext(Declaration_sectionContext.class,0);
		}
		public PolicyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterPolicy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitPolicy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitPolicy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyContext policy() throws RecognitionException {
		PolicyContext _localctx = new PolicyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_policy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			requirement();
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(75);
				declaration_section();
				}
				break;
			}
			setState(78);
			state_definition_section();
			setState(79);
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

	public static class RequirementContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(UserPolicyParser.REQUIRE, 0); }
		public Contract_with_subjectContext contract_with_subject() {
			return getRuleContext(Contract_with_subjectContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(REQUIRE);
			{
			setState(82);
			contract_with_subject();
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

	public static class Contract_with_subjectContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(UserPolicyParser.WITH, 0); }
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public Contract_with_subjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract_with_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterContract_with_subject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitContract_with_subject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitContract_with_subject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contract_with_subjectContext contract_with_subject() throws RecognitionException {
		Contract_with_subjectContext _localctx = new Contract_with_subjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contract_with_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			match(WITH);
			setState(86);
			subject();
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

	public static class Declaration_sectionContext extends ParserRuleContext {
		public List<Declaration_statementsContext> declaration_statements() {
			return getRuleContexts(Declaration_statementsContext.class);
		}
		public Declaration_statementsContext declaration_statements(int i) {
			return getRuleContext(Declaration_statementsContext.class,i);
		}
		public Declaration_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterDeclaration_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitDeclaration_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitDeclaration_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_sectionContext declaration_section() throws RecognitionException {
		Declaration_sectionContext _localctx = new Declaration_sectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					declaration_statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Declaration_statementsContext extends ParserRuleContext {
		public Expression_assignmentContext expression_assignment() {
			return getRuleContext(Expression_assignmentContext.class,0);
		}
		public Declaration_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterDeclaration_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitDeclaration_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitDeclaration_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statementsContext declaration_statements() throws RecognitionException {
		Declaration_statementsContext _localctx = new Declaration_statementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expression_assignment();
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

	public static class State_definition_sectionContext extends ParserRuleContext {
		public List<State_definitionContext> state_definition() {
			return getRuleContexts(State_definitionContext.class);
		}
		public State_definitionContext state_definition(int i) {
			return getRuleContext(State_definitionContext.class,i);
		}
		public State_definition_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_definition_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterState_definition_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitState_definition_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitState_definition_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_definition_sectionContext state_definition_section() throws RecognitionException {
		State_definition_sectionContext _localctx = new State_definition_sectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_state_definition_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				state_definition();
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << ID))) != 0) );
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

	public static class State_definitionContext extends ParserRuleContext {
		public State_nameContext state_name() {
			return getRuleContext(State_nameContext.class,0);
		}
		public Service_stateContext service_state() {
			return getRuleContext(Service_stateContext.class,0);
		}
		public List<State_transitionContext> state_transition() {
			return getRuleContexts(State_transitionContext.class);
		}
		public State_transitionContext state_transition(int i) {
			return getRuleContext(State_transitionContext.class,i);
		}
		public State_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterState_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitState_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitState_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_definitionContext state_definition() throws RecognitionException {
		State_definitionContext _localctx = new State_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(100);
				service_state();
				}
			}

			setState(103);
			state_name();
			setState(104);
			match(T__1);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				state_transition();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==TERMINATE );
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

	public static class State_transitionContext extends ParserRuleContext {
		public State_nameContext state_name() {
			return getRuleContext(State_nameContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode TERMINATE() { return getToken(UserPolicyParser.TERMINATE, 0); }
		public State_transitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterState_transition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitState_transition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitState_transition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_transitionContext state_transition() throws RecognitionException {
		State_transitionContext _localctx = new State_transitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_state_transition);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__2);
				setState(111);
				match(T__3);
				setState(112);
				state_name();
				setState(113);
				match(T__4);
				setState(114);
				event();
				}
				break;
			case TERMINATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(TERMINATE);
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

	public static class State_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UserPolicyParser.ID, 0); }
		public State_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterState_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitState_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitState_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_nameContext state_name() throws RecognitionException {
		State_nameContext _localctx = new State_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
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

	public static class Service_stateContext extends ParserRuleContext {
		public Service_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterService_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitService_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitService_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Service_stateContext service_state() throws RecognitionException {
		Service_stateContext _localctx = new Service_stateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_service_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class Subject_idContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public Subject_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterSubject_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitSubject_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitSubject_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subject_idContext subject_id() throws RecognitionException {
		Subject_idContext _localctx = new Subject_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subject_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			subject();
			  
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode EVENT_SERVICE_NAME() { return getToken(UserPolicyParser.EVENT_SERVICE_NAME, 0); }
		public List<TerminalNode> POINT() { return getTokens(UserPolicyParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(UserPolicyParser.POINT, i);
		}
		public Event_nameContext event_name() {
			return getRuleContext(Event_nameContext.class,0);
		}
		public Event_pathContext event_path() {
			return getRuleContext(Event_pathContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(EVENT_SERVICE_NAME);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(127);
				match(POINT);
				setState(128);
				event_path();
				}
				break;
			}
			setState(131);
			match(POINT);
			setState(132);
			event_name();
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

	public static class Event_pathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(UserPolicyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UserPolicyParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(UserPolicyParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(UserPolicyParser.POINT, i);
		}
		public Event_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterEvent_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitEvent_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitEvent_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_pathContext event_path() throws RecognitionException {
		Event_pathContext _localctx = new Event_pathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_event_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(POINT);
					setState(136);
					match(ID);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Event_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UserPolicyParser.ID, 0); }
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterEvent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitEvent_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitEvent_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
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

	public static class Expression_testContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UserPolicyParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_testContext expression_test() throws RecognitionException {
		Expression_testContext _localctx = new Expression_testContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				expression();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PI) | (1L << SCIENTIFIC_NUMBER) | (1L << EULER) | (1L << SUM))) != 0) );
			setState(149);
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

	public static class Expression_call_or_literalContext extends ParserRuleContext {
		public Expression_callContext expression_call() {
			return getRuleContext(Expression_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_call_or_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_call_or_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression_call_or_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression_call_or_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression_call_or_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_call_or_literalContext expression_call_or_literal() throws RecognitionException {
		Expression_call_or_literalContext _localctx = new Expression_call_or_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression_call_or_literal);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				expression_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expression();
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

	public static class Expression_assignmentContext extends ParserRuleContext {
		public Expression_handleContext expression_handle() {
			return getRuleContext(Expression_handleContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UserPolicyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UserPolicyParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(UserPolicyParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(UserPolicyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UserPolicyParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UserPolicyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UserPolicyParser.COMMA, i);
		}
		public Expression_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_assignmentContext expression_assignment() throws RecognitionException {
		Expression_assignmentContext _localctx = new Expression_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			expression_handle();
			setState(156);
			match(LPAREN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(157);
				match(ID);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					match(ID);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(RPAREN);
			setState(171);
			match(EQ);
			setState(172);
			expression();
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

	public static class Expression_callContext extends ParserRuleContext {
		public Expression_handleContext expression_handle() {
			return getRuleContext(Expression_handleContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UserPolicyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UserPolicyParser.RPAREN, 0); }
		public List<Expression_call_argumentContext> expression_call_argument() {
			return getRuleContexts(Expression_call_argumentContext.class);
		}
		public Expression_call_argumentContext expression_call_argument(int i) {
			return getRuleContext(Expression_call_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UserPolicyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UserPolicyParser.COMMA, i);
		}
		public Expression_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_callContext expression_call() throws RecognitionException {
		Expression_callContext _localctx = new Expression_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expression_handle();
			setState(175);
			match(LPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==ID) {
				{
				{
				setState(176);
				expression_call_argument();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					expression_call_argument();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(RPAREN);
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

	public static class Expression_call_argumentContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UserPolicyParser.INT, 0); }
		public Environment_variableContext environment_variable() {
			return getRuleContext(Environment_variableContext.class,0);
		}
		public Expression_call_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_call_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression_call_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression_call_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression_call_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_call_argumentContext expression_call_argument() throws RecognitionException {
		Expression_call_argumentContext _localctx = new Expression_call_argumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression_call_argument);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				environment_variable();
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

	public static class Expression_handleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UserPolicyParser.ID, 0); }
		public Expression_handleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_handle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression_handle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression_handle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression_handle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_handleContext expression_handle() throws RecognitionException {
		Expression_handleContext _localctx = new Expression_handleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression_handle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(UserPolicyParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(UserPolicyParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(UserPolicyParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(UserPolicyParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			multiplyingExpression();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(199);
					multiplyingExpression();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(UserPolicyParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(UserPolicyParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(UserPolicyParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(UserPolicyParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			powExpression();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				powExpression();
				}
				}
				setState(212);
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

	public static class PowExpressionContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(UserPolicyParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(UserPolicyParser.POW, i);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			signedAtom();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(214);
				match(POW);
				setState(215);
				signedAtom();
				}
				}
				setState(220);
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

	public static class SignedAtomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(UserPolicyParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(UserPolicyParser.MINUS, 0); }
		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitSignedAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signedAtom);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(PLUS);
				setState(222);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(MINUS);
				setState(224);
				signedAtom();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				built_in_function();
				}
				break;
			case INT:
			case ID:
			case LPAREN:
			case PI:
			case SCIENTIFIC_NUMBER:
			case EULER:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				atom();
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

	public static class Built_in_functionContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UserPolicyParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(UserPolicyParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UserPolicyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UserPolicyParser.COMMA, i);
		}
		public Built_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterBuilt_in_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitBuilt_in_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitBuilt_in_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_functionContext built_in_function() throws RecognitionException {
		Built_in_functionContext _localctx = new Built_in_functionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_built_in_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			funcname();
			setState(230);
			match(LPAREN);
			setState(231);
			expression();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(232);
				match(COMMA);
				setState(233);
				expression();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(RPAREN);
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(UserPolicyParser.SUM, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(SUM);
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

	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UserPolicyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UserPolicyParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(UserPolicyParser.INT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atom);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				scientific();
				}
				break;
			case PI:
			case EULER:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(LPAREN);
				setState(246);
				expression();
				setState(247);
				match(RPAREN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				variable();
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

	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(UserPolicyParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(SCIENTIFIC_NUMBER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(UserPolicyParser.PI, 0); }
		public TerminalNode EULER() { return getToken(UserPolicyParser.EULER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==PI || _la==EULER) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UserPolicyParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
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

	public static class Environment_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UserPolicyParser.ID, 0); }
		public Environment_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterEnvironment_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitEnvironment_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitEnvironment_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Environment_variableContext environment_variable() throws RecognitionException {
		Environment_variableContext _localctx = new Environment_variableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_environment_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
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

	public static class Entity_bracketContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UserPolicyParser.EOF, 0); }
		public List<Subject_serviceContext> subject_service() {
			return getRuleContexts(Subject_serviceContext.class);
		}
		public Subject_serviceContext subject_service(int i) {
			return getRuleContext(Subject_serviceContext.class,i);
		}
		public List<Event_serviceContext> event_service() {
			return getRuleContexts(Event_serviceContext.class);
		}
		public Event_serviceContext event_service(int i) {
			return getRuleContext(Event_serviceContext.class,i);
		}
		public List<SubjectContext> subject() {
			return getRuleContexts(SubjectContext.class);
		}
		public SubjectContext subject(int i) {
			return getRuleContext(SubjectContext.class,i);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public List<PolicyContext> policy() {
			return getRuleContexts(PolicyContext.class);
		}
		public PolicyContext policy(int i) {
			return getRuleContext(PolicyContext.class,i);
		}
		public List<AccountContext> account() {
			return getRuleContexts(AccountContext.class);
		}
		public AccountContext account(int i) {
			return getRuleContext(AccountContext.class,i);
		}
		public List<User_organization_nameContext> user_organization_name() {
			return getRuleContexts(User_organization_nameContext.class);
		}
		public User_organization_nameContext user_organization_name(int i) {
			return getRuleContext(User_organization_nameContext.class,i);
		}
		public Entity_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterEntity_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitEntity_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitEntity_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_bracketContext entity_bracket() throws RecognitionException {
		Entity_bracketContext _localctx = new Entity_bracketContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_entity_bracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UOID) | (1L << ACCOUNT_NUMBER) | (1L << SUBJECT_SERVICE_NAME) | (1L << EVENT_SERVICE_NAME) | (1L << REQUIRE))) != 0)) {
				{
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(261);
					subject_service();
					}
					break;
				case 2:
					{
					setState(262);
					event_service();
					}
					break;
				case 3:
					{
					setState(263);
					subject();
					}
					break;
				case 4:
					{
					setState(264);
					event();
					}
					break;
				case 5:
					{
					setState(265);
					policy();
					}
					break;
				case 6:
					{
					setState(266);
					account();
					}
					break;
				case 7:
					{
					setState(267);
					user_organization_name();
					}
					break;
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
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

	public static class Subject_serviceContext extends ParserRuleContext {
		public TerminalNode SUBJECT_SERVICE_NAME() { return getToken(UserPolicyParser.SUBJECT_SERVICE_NAME, 0); }
		public Subject_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterSubject_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitSubject_service(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitSubject_service(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subject_serviceContext subject_service() throws RecognitionException {
		Subject_serviceContext _localctx = new Subject_serviceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_subject_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(SUBJECT_SERVICE_NAME);
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

	public static class Event_serviceContext extends ParserRuleContext {
		public TerminalNode EVENT_SERVICE_NAME() { return getToken(UserPolicyParser.EVENT_SERVICE_NAME, 0); }
		public Event_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterEvent_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitEvent_service(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitEvent_service(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_serviceContext event_service() throws RecognitionException {
		Event_serviceContext _localctx = new Event_serviceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_event_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(EVENT_SERVICE_NAME);
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

	public static class SubjectContext extends ParserRuleContext {
		public Subject_serviceContext subject_service() {
			return getRuleContext(Subject_serviceContext.class,0);
		}
		public List<TerminalNode> POINT() { return getTokens(UserPolicyParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(UserPolicyParser.POINT, i);
		}
		public User_organization_nameContext user_organization_name() {
			return getRuleContext(User_organization_nameContext.class,0);
		}
		public TerminalNode SUBJECT_ID() { return getToken(UserPolicyParser.SUBJECT_ID, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subject);

		    putCycle("subject");
		    System.out.println("subject init");

		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("subject sta");
			setState(280);
			subject_service();
			setState(281);
			match(POINT);
			setState(282);
			user_organization_name();
			setState(283);
			match(POINT);
			setState(284);
			match(SUBJECT_ID);
			System.out.println("subject end");
			}
			_ctx.stop = _input.LT(-1);

			    popCycle();
			    System.out.println("subject afte");

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

	public static class AccountContext extends ParserRuleContext {
		public TerminalNode ACCOUNT_NUMBER() { return getToken(UserPolicyParser.ACCOUNT_NUMBER, 0); }
		public AccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterAccount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitAccount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitAccount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccountContext account() throws RecognitionException {
		AccountContext _localctx = new AccountContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_account);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ACCOUNT_NUMBER);
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

	public static class User_organization_nameContext extends ParserRuleContext {
		public TerminalNode UOID() { return getToken(UserPolicyParser.UOID, 0); }
		public User_organization_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_organization_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).enterUser_organization_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserPolicyListener ) ((UserPolicyListener)listener).exitUser_organization_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserPolicyVisitor ) return ((UserPolicyVisitor<? extends T>)visitor).visitUser_organization_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_organization_nameContext user_organization_name() throws RecognitionException {
		User_organization_nameContext _localctx = new User_organization_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_user_organization_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(UOID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0126\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\5\2O\n\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5\\\n\5\r\5\16\5]\3\6\3\6\3\7\6\7c\n\7\r"+
		"\7\16\7d\3\b\5\bh\n\b\3\b\3\b\3\b\6\bm\n\b\r\b\16\bn\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u008c\n\16\f\16\16\16\u008f\13\16"+
		"\3\17\3\17\3\20\6\20\u0094\n\20\r\20\16\20\u0095\3\20\3\20\3\21\3\21\5"+
		"\21\u009c\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u00a3\n\22\f\22\16\22\u00a6"+
		"\13\22\7\22\u00a8\n\22\f\22\16\22\u00ab\13\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00b6\n\23\f\23\16\23\u00b9\13\23\7\23\u00bb"+
		"\n\23\f\23\16\23\u00be\13\23\3\23\3\23\3\24\3\24\5\24\u00c4\n\24\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u00cb\n\26\f\26\16\26\u00ce\13\26\3\27\3\27"+
		"\3\27\7\27\u00d3\n\27\f\27\16\27\u00d6\13\27\3\30\3\30\3\30\7\30\u00db"+
		"\n\30\f\30\16\30\u00de\13\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e6"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u00ed\n\32\f\32\16\32\u00f0\13\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00fe"+
		"\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\7!\u010f"+
		"\n!\f!\16!\u0112\13!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJ\2\6\3\2\b\t\3\2#$\3\2%&\4\2--//\2\u0121\2L\3\2\2\2\4"+
		"S\3\2\2\2\6V\3\2\2\2\b[\3\2\2\2\n_\3\2\2\2\fb\3\2\2\2\16g\3\2\2\2\20w"+
		"\3\2\2\2\22y\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0080\3\2\2\2\32\u0088"+
		"\3\2\2\2\34\u0090\3\2\2\2\36\u0093\3\2\2\2 \u009b\3\2\2\2\"\u009d\3\2"+
		"\2\2$\u00b0\3\2\2\2&\u00c3\3\2\2\2(\u00c5\3\2\2\2*\u00c7\3\2\2\2,\u00cf"+
		"\3\2\2\2.\u00d7\3\2\2\2\60\u00e5\3\2\2\2\62\u00e7\3\2\2\2\64\u00f3\3\2"+
		"\2\2\66\u00fd\3\2\2\28\u00ff\3\2\2\2:\u0101\3\2\2\2<\u0103\3\2\2\2>\u0105"+
		"\3\2\2\2@\u0110\3\2\2\2B\u0115\3\2\2\2D\u0117\3\2\2\2F\u0119\3\2\2\2H"+
		"\u0121\3\2\2\2J\u0123\3\2\2\2LN\5\4\3\2MO\5\b\5\2NM\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PQ\5\f\7\2QR\7\2\2\3R\3\3\2\2\2ST\7\24\2\2TU\5\6\4\2U\5\3\2"+
		"\2\2VW\7\3\2\2WX\7\22\2\2XY\5F$\2Y\7\3\2\2\2Z\\\5\n\6\2[Z\3\2\2\2\\]\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_`\5\"\22\2`\13\3\2\2\2ac\5\16\b"+
		"\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fh\5\24\13\2gf\3"+
		"\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\22\n\2jl\7\4\2\2km\5\20\t\2lk\3\2\2\2m"+
		"n\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pq\7\5\2\2qr\7\6\2\2rs\5\22\n"+
		"\2st\7\7\2\2tu\5\30\r\2ux\3\2\2\2vx\7\13\2\2wp\3\2\2\2wv\3\2\2\2x\21\3"+
		"\2\2\2yz\7\37\2\2z\23\3\2\2\2{|\t\2\2\2|\25\3\2\2\2}~\5F$\2~\177\b\f\1"+
		"\2\177\27\3\2\2\2\u0080\u0083\7\20\2\2\u0081\u0082\7+\2\2\u0082\u0084"+
		"\5\32\16\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\7+\2\2\u0086\u0087\5\34\17\2\u0087\31\3\2\2\2\u0088\u008d"+
		"\7\37\2\2\u0089\u008a\7+\2\2\u008a\u008c\7\37\2\2\u008b\u0089\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\33"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\37\2\2\u0091\35\3\2\2\2\u0092"+
		"\u0094\5*\26\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\2\2\3\u0098"+
		"\37\3\2\2\2\u0099\u009c\5$\23\2\u009a\u009c\5*\26\2\u009b\u0099\3\2\2"+
		"\2\u009b\u009a\3\2\2\2\u009c!\3\2\2\2\u009d\u009e\5(\25\2\u009e\u00a9"+
		"\7!\2\2\u009f\u00a4\7\37\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a3\7\37\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7)\2\2\u00ae"+
		"\u00af\5*\26\2\u00af#\3\2\2\2\u00b0\u00b1\5(\25\2\u00b1\u00bc\7!\2\2\u00b2"+
		"\u00b7\5&\24\2\u00b3\u00b4\7*\2\2\u00b4\u00b6\5&\24\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b2\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7\"\2\2\u00c0%\3\2\2\2\u00c1\u00c4\7\30\2\2"+
		"\u00c2\u00c4\5> \2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\'\3\2"+
		"\2\2\u00c5\u00c6\7\37\2\2\u00c6)\3\2\2\2\u00c7\u00cc\5,\27\2\u00c8\u00c9"+
		"\t\3\2\2\u00c9\u00cb\5,\27\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd+\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d4\5.\30\2\u00d0\u00d1\t\4\2\2\u00d1\u00d3\5.\30\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"-\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\5\60\31\2\u00d8\u00d9\7,\2\2"+
		"\u00d9\u00db\5\60\31\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd/\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7#\2\2\u00e0\u00e6\5\60\31\2\u00e1\u00e2\7$\2\2\u00e2\u00e6\5\60"+
		"\31\2\u00e3\u00e6\5\62\32\2\u00e4\u00e6\5\66\34\2\u00e5\u00df\3\2\2\2"+
		"\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\61"+
		"\3\2\2\2\u00e7\u00e8\5\64\33\2\u00e8\u00e9\7!\2\2\u00e9\u00ee\5*\26\2"+
		"\u00ea\u00eb\7*\2\2\u00eb\u00ed\5*\26\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7\"\2\2\u00f2\63\3\2\2\2\u00f3\u00f4\7\60\2"+
		"\2\u00f4\65\3\2\2\2\u00f5\u00fe\58\35\2\u00f6\u00fe\5:\36\2\u00f7\u00f8"+
		"\7!\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\7\"\2\2\u00fa\u00fe\3\2\2\2\u00fb"+
		"\u00fe\7\30\2\2\u00fc\u00fe\5<\37\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3"+
		"\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\67\3\2\2\2\u00ff\u0100\7.\2\2\u01009\3\2\2\2\u0101\u0102\t\5\2\2\u0102"+
		";\3\2\2\2\u0103\u0104\7\37\2\2\u0104=\3\2\2\2\u0105\u0106\7\37\2\2\u0106"+
		"?\3\2\2\2\u0107\u010f\5B\"\2\u0108\u010f\5D#\2\u0109\u010f\5F$\2\u010a"+
		"\u010f\5\30\r\2\u010b\u010f\5\2\2\2\u010c\u010f\5H%\2\u010d\u010f\5J&"+
		"\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a"+
		"\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\2\2\3\u0114A\3\2\2\2\u0115\u0116"+
		"\7\17\2\2\u0116C\3\2\2\2\u0117\u0118\7\20\2\2\u0118E\3\2\2\2\u0119\u011a"+
		"\b$\1\2\u011a\u011b\5B\"\2\u011b\u011c\7+\2\2\u011c\u011d\5J&\2\u011d"+
		"\u011e\7+\2\2\u011e\u011f\7\f\2\2\u011f\u0120\b$\1\2\u0120G\3\2\2\2\u0121"+
		"\u0122\7\16\2\2\u0122I\3\2\2\2\u0123\u0124\7\r\2\2\u0124K\3\2\2\2\31N"+
		"]dgnw\u0083\u008d\u0095\u009b\u00a4\u00a9\u00b7\u00bc\u00c3\u00cc\u00d4"+
		"\u00dc\u00e5\u00ee\u00fd\u010e\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}