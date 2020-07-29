/**
 * File Name: EspressoMachine.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 29
 */
package dpstudy.chap2.aggregation;

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
public class EspressoMachine {
	
	private int price = 300000;

	/**
	 * 
	 */
	public EspressoMachine() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 29
	 * @Method Name : makeEspresso
	 * @return : Espresso
	 * @return
	 * @see
	 * 
	 */
	public Espresso makeEspresso() {
		return new Espresso();
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}
