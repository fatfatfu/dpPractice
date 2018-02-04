package org.myProj.dpPractice.AbstractFactoryPattern;

public class MacOSXWidgetFactory implements AbstractWidgetFactory{

	@Override
	public Window createWindow() {
		MacOsWindow mac = new MacOsWindow();
		return mac;
	}

}
