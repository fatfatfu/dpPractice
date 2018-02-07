package org.myProj.dpPractice.CompositePattern;

public abstract class Company {
	protected String name;
	public Company(String name) {
		this.name = name;
	}
	
	public abstract void add(Company c);
	public abstract void remove(Company c);
	public abstract void display(int depthc);
	public abstract void lineDuties();
	
	
}
