/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.bug508810.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bug508810.mydsl.MyDsl.Model");
		private final Assignment cGreetingsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGreetingsGreetingParserRuleCall_0 = (RuleCall)cGreetingsAssignment.eContents().get(0);
		
		//Model:
		//	greetings+=Greeting*;
		@Override public ParserRule getRule() { return rule; }
		
		//greetings+=Greeting*
		public Assignment getGreetingsAssignment() { return cGreetingsAssignment; }
		
		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_0() { return cGreetingsGreetingParserRuleCall_0; }
	}
	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bug508810.mydsl.MyDsl.Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHelloKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParametersParameterParserRuleCall_3_0 = (RuleCall)cParametersAssignment_3.eContents().get(0);
		
		//Greeting:
		//	'Hello' name=ID '!'
		//	parameters+=Parameter*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Hello' name=ID '!' parameters+=Parameter*
		public Group getGroup() { return cGroup; }
		
		//'Hello'
		public Keyword getHelloKeyword_0() { return cHelloKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
		
		//parameters+=Parameter*
		public Assignment getParametersAssignment_3() { return cParametersAssignment_3; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0() { return cParametersParameterParserRuleCall_3_0; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bug508810.mydsl.MyDsl.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEStringToStringMapEntryAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cKeyAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cKeyIDTerminalRuleCall_1_0_0 = (RuleCall)cKeyAssignment_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cValueAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValueIDTerminalRuleCall_1_2_0 = (RuleCall)cValueAssignment_1_2.eContents().get(0);
		
		//Parameter ecore::EStringToStringMapEntry:
		//	{ecore::EStringToStringMapEntry} (key=ID '=' value=ID)
		@Override public ParserRule getRule() { return rule; }
		
		//{ecore::EStringToStringMapEntry} (key=ID '=' value=ID)
		public Group getGroup() { return cGroup; }
		
		//{ecore::EStringToStringMapEntry}
		public Action getEStringToStringMapEntryAction_0() { return cEStringToStringMapEntryAction_0; }
		
		//(key=ID '=' value=ID)
		public Group getGroup_1() { return cGroup_1; }
		
		//key=ID
		public Assignment getKeyAssignment_1_0() { return cKeyAssignment_1_0; }
		
		//ID
		public RuleCall getKeyIDTerminalRuleCall_1_0_0() { return cKeyIDTerminalRuleCall_1_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }
		
		//value=ID
		public Assignment getValueAssignment_1_2() { return cValueAssignment_1_2; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_1_2_0() { return cValueIDTerminalRuleCall_1_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final GreetingElements pGreeting;
	private final ParameterElements pParameter;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGreeting = new GreetingElements();
		this.pParameter = new ParameterElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.bug508810.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	greetings+=Greeting*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Greeting:
	//	'Hello' name=ID '!'
	//	parameters+=Parameter*;
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}
	
	//Parameter ecore::EStringToStringMapEntry:
	//	{ecore::EStringToStringMapEntry} (key=ID '=' value=ID)
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
