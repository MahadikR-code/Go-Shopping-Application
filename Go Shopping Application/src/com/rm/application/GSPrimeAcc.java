package com.rm.application;

import com.rm.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	private static float charges;

	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);
		GSPrimeAcc.charges = charges;
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("For Prime Account Delivery charges are: " + PrimeAcc.getDeliverycharges() + "\n");
	}

	public static float getcharges() {
		return GSPrimeAcc.charges;
	}

	@Override
	public void items(float items_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getCharges()=" + getCharges() + "]";
	}

}
