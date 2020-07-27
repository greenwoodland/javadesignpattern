/**
 * File Name: RectangleShape1.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 27
 */
package com.jhj.object.interface1;

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
public class RectangleShape1 extends AbstractBoundingShape implements IShape {

	/**
	 * 
	 */
	public RectangleShape1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public RectangleShape1(int x, int y, int width, int height) {
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
		System.out.println("draw Rectangle");
	}

}
