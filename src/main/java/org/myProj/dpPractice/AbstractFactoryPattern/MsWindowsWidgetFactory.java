package org.myProj.dpPractice.AbstractFactoryPattern;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory{

	@Override
	public Window createWindow() {
		MSWindow win  = new MSWindow();
		return win;
	}

}
