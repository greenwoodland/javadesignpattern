/**
 * File Name: Cafelatte.java
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
public class Cafelatte {

	private String name = "Cafelatte";
	
	private Espresso espresso = new Espresso();
	private Milk milk = new Milk();
	
	/**
	 * 
	 */
	public Cafelatte() {
		// TODO Auto-generated constructor stub
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

	
	/**
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 29
	 * @Method Name : display
	 * @return : void
	 * @see
	 * 
	 */
	public void display() {
		System.out.println(this.name + " ("+ this.espresso + "+" + this.milk +")");
	}

	public String toString() {
		return "Cafelatte";
	}
	
}
