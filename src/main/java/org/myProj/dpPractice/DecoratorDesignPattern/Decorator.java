package org.myProj.dpPractice.DecoratorDesignPattern;

public abstract class Decorator implements Shape {
	protected Shape decoratedShape;

	public Decorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}
