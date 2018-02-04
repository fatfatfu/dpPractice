package org.myProj.dpPractice.BuilderPattern;

public class MealBuilder {
	public Meal prepareMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
