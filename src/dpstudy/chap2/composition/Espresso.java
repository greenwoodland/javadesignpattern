/**
 * File Name: Espresso.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 29
 */
package dpstudy.chap2.composition;

/**
 * <p/>
 * @since 2020. 7. 29
 * @author Hyungjun, Jeon
 * <PRE>
 * ------------------------------------------------
 * Modified List
 * 2020. 7. 29 Hyungjun, Jeon
 * </PRE>
 */
public class Espresso {

	private String name = "Espresso";
	/**
	 * 
	 */
	public Espresso() {

		super();
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Espresso";
	}
}
