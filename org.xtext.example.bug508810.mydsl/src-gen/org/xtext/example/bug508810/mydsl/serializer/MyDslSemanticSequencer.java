/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.bug508810.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStringToStringMapEntry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.bug508810.mydsl.myDsl.Greeting;
import org.xtext.example.bug508810.mydsl.myDsl.Model;
import org.xtext.example.bug508810.mydsl.myDsl.MyDslPackage;
import org.xtext.example.bug508810.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				sequence_Parameter(context, (EStringToStringMapEntry) semanticObject); 
				return; 
			}
		else if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.GREETING:
				sequence_Greeting(context, (Greeting) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Greeting returns Greeting
	 *
	 * Constraint:
	 *     (name=ID parameters+=Parameter*)
	 */
	protected void sequence_Greeting(ISerializationContext context, Greeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     greetings+=Greeting+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns EStringToStringMapEntry
	 *
	 * Constraint:
	 *     (key=ID value=ID)
	 */
	protected void sequence_Parameter(ISerializationContext context, EStringToStringMapEntry semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__KEY));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getKeyIDTerminalRuleCall_1_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getParameterAccess().getValueIDTerminalRuleCall_1_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}