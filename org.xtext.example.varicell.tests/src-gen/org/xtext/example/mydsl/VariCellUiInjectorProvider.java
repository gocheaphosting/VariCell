/*
* generated by Xtext
*/
package org.xtext.example.mydsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VariCellUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.mydsl.ui.internal.VariCellActivator.getInstance().getInjector("org.xtext.example.mydsl.VariCell");
	}
	
}
