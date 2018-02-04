package org.myProj.dpPractice.ProtoType;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, ShapeProtoType> shapeMap = new Hashtable<String, ShapeProtoType>();

	public static ShapeProtoType getShape(String shapeId) throws CloneNotSupportedException {
		ShapeProtoType cachedShape = shapeMap.get(shapeId);
		return (ShapeProtoType) cachedShape.clone();
	}

	/**
	 * for each shape run database query and create shape shapeMap.put(shapeKey,
	 * shape);
	 */
	public static void loadCache() {
		CircleProtoType circle = new CircleProtoType();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		SquareProtoType square = new SquareProtoType();
		square.setId("2");
		shapeMap.put(square.getId(), square);

	}
}
