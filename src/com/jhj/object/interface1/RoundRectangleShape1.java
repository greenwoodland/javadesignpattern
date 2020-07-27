/**
 * File Name: RoundRectangleShape1.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 27
 */
package com.jhj.object.interface1;

import com.jhj.object.abstractclass01.AbstractBoundingShape;

/**
 * <p/>
 * @since 2020. 7. 27
 * @author Hyungjun, Jeon
 * <PRE>
 * ------------------------------------------------
 * Modified List
 * 2020. 7. 27 Hyungjun, Jeon
 * </PRE>
 */
public class RoundRectangleShape1 extends AbstractBoundingShape implements IShape {

	private float arcWidth;
	private float arcHeight;

	/**
	 * 
	 */
	public RoundRectangleShape1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public RoundRectangleShape1(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void draw() {
		System.out.println("draw RoundRectangle");
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

}
