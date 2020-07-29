/**
 * File Name: Client.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 29
 */
package dpstudy.chap2.generalization;

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
public class Client {

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 29
	 * @Method Name : main
	 * @return : void
	 * @param args
	 * @see
	 * 
	 */
	public static void main(String[] args) {

		Coffee coffee = new Coffee();
		System.out.println(coffee.getName());
		
		coffee.display();
		
		Coffee espresso = new Espresso();
		espresso.setName("Espresso");
		
		System.out.println(espresso.getName());
		
		espresso.display();

	}

}
