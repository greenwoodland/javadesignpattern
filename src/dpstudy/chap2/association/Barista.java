/**
 * File Name: Barista.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 29
 */
package dpstudy.chap2.association;

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
public class Barista {
	
	private EspressoMachine espressoMachine;

	/**
	 * 
	 */
	public Barista() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param espressoMachine the espressoMachine to set
	 */
	public void setEspressoMachine(EspressoMachine espressoMachine) {
		this.espressoMachine = espressoMachine;
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
		return espressoMachine.makeEspresso();
	}
}
