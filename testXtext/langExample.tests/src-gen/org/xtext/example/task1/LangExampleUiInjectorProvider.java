/*
* generated by Xtext
*/
package org.xtext.example.task1;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LangExampleUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.task1.ui.internal.LangExampleActivator.getInstance().getInjector("org.xtext.example.task1.LangExample");
	}
	
}