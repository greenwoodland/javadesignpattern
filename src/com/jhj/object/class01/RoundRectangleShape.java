/**
 * File Name: RoundRectangleShape.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 22
 */
package com.jhj.object.class01;

/**
 * <p/>
 * @since 2020. 7. 22
 * @author Hyungjun, Jeon
 * <PRE>
 * ------------------------------------------------
 * Modified List
 * 2020. 7. 22 Hyungjun, Jeon
 * </PRE>
 */
public class RoundRectangleShape {
	
	private static int shapeIdCounter = 0;

	private int x;
	private int y;
	
	private int width;
	private int height;
	
	private float arcWidth;
	private float arcHeight;
	

	/**
	 * @return the shapeIdCounter
	 */
	public static int getShapeIdCounter() {
		return shapeIdCounter++;
	}


	/**
	 * @param shapeIdCounter the shapeIdCounter to set
	 */
	public static void setShapeIdCounter(int shapeIdCounter) {
		RoundRectangleShape.shapeIdCounter = shapeIdCounter;
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}


	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}


	/**
	 * @return the arcWidth
	 */
	public float getArcWidth() {
		return arcWidth;
	}


	/**
	 * @param arcWidth the arcWidth to set
	 */
	public void setArcWidth(float arcWidth) {
		this.arcWidth = arcWidth;
	}


	/**
	 * @return the arcHeight
	 */
	public float getArcHeight() {
		return arcHeight;
	}


	/**
	 * @param arcHeight the arcHeight to set
	 */
	public void setArcHeight(float arcHeight) {
		this.arcHeight = arcHeight;
	}


	/**
	 * 
	 */
	public RoundRectangleShape() {
	}
	
	public void draw() {
		System.out.println("draw RoundRectangle");
	}

}
