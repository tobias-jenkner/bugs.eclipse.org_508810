/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.bug508810.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.example.bug508810.mydsl.ui.internal.MydslActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("org.xtext.example.bug508810.mydsl.MyDsl");
	}

}
