package org.myProj.dpPractice.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuffer tmSB = new StringBuffer();
		for (int i =0 ; i<depth;i++){
			tmSB.append('-');
		}
		tmSB.append(name);
		System.out.println(tmSB.toString());
		for(Company c:children){
			c.display(depth+2);
		}
	}

	@Override
	public void lineDuties() {
		for(Company c:children){
			c.lineDuties();
		}
	}

}
