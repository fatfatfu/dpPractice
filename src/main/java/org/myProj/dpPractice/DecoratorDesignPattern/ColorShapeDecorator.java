package org.myProj.dpPractice.DecoratorDesignPattern;

public class ColorShapeDecorator extends Decorator{

	public ColorShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setColor(decoratedShape);
	}
	
	public void setColor(Shape decoratedShape) {
		System.out.println("Color = BLUE");
	}

}
