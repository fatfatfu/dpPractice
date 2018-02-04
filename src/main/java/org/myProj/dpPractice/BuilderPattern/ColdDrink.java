package org.myProj.dpPractice.BuilderPattern;

public abstract class ColdDrink implements Item{
	   @Override
	   public PackingMethod packing() {
	      return new Bottle();
	   }

	   @Override
	   public abstract float price();
}
