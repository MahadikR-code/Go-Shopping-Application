package com.rm.application;

import com.rm.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accName, float charges, float deliveryCharges) {
		super(accNo, accName, charges, deliveryCharges);

	}

	@Override
	public void bookProduct(float charges) {
		float charge = charges + NormalAcc.getDeliveryCharges();
		System.out.println(" For Normal Account Delivery Charges are: " + NormalAcc.getDeliveryCharges() + "\n");

	}

	@Override
	public void items(float items_jd) {
		System.out.println();

	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getCharges()=" + getCharges() + ", hashCode()="
				+ hashCode() + "]";
	}

}
