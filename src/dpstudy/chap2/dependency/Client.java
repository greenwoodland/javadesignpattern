/**
 * File Name: Client.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 29
 */
package dpstudy.chap2.dependency;

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
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 29
	 * @Method Name : main
	 * @return : void
	 * @param args
	 * @see
	 * 
	 */
	public static void main(String[] args) {

		Barista barista = new Barista();
		
		EspressoMachine espressoMachine = new EspressoMachine();
		
		barista.setEspressoMachine(espressoMachine);
		
		Espresso espresso = barista.makeEspresso();
		System.out.println(espresso);
		
		Cafelatte cafelatte = barista.makeCafelatte();
		
		cafelatte.display();

	}

}
