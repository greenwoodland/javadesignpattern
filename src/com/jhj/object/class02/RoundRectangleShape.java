/**
 * File Name: RoundRectangleShape.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 27
 */
package com.jhj.object.class02;

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
public class RoundRectangleShape extends RectangleShape {

	private float arcWidth;
	private float arcHeight;
	
	/**
	 * 
	 */
	public RoundRectangleShape() {
		// TODO Auto-generated constructor stub
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
