
package org.xtext.example.task1;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LangExampleStandaloneSetup extends LangExampleStandaloneSetupGenerated{

	public static void doSetup() {
		new LangExampleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

