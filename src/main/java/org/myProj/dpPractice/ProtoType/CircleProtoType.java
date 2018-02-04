package org.myProj.dpPractice.ProtoType;

public class CircleProtoType extends ShapeProtoType{
	public CircleProtoType() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");		
	}
}
