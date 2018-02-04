package org.myProj.dpPractice.ProtoType;

public class SquareProtoType extends ShapeProtoType{
	public SquareProtoType() {
		type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
