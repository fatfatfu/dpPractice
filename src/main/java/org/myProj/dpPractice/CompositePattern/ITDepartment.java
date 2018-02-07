package org.myProj.dpPractice.CompositePattern;


public class ITDepartment extends Company {

	public ITDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {
		StringBuffer tmSB = new StringBuffer();
		for (int i =0 ; i<depth;i++){
			tmSB.append('-');
		}
		tmSB.append(name);
		System.out.println(tmSB.toString());
	}

	@Override
	public void lineDuties() {
		System.out.println("IT work at :"+name);
	}

}
