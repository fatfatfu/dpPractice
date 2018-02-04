package org.myProj.dpPractice.BuilderPattern;

public abstract class Burger implements Item{
	   @Override
	   public PackingMethod packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
}
