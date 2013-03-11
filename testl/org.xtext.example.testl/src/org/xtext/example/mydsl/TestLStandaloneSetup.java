
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TestLStandaloneSetup extends TestLStandaloneSetupGenerated{

	public static void doSetup() {
		new TestLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

