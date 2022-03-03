package com.rm.framework;

public abstract class NormalAcc extends ShopAcc {
	// Fields
	private static float deliveryCharges;

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}

	// Constructor
	public NormalAcc(int accNo, String accName, float charges, float deliveryCharges) {
		super(accNo, accName, charges);
		NormalAcc.deliveryCharges = deliveryCharges;
	}

	// bookProduct method
	@Override
	public abstract void bookProduct(float charges);

	@Override
	public String toString() {
		return "NormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + "getCharges()=" + getCharges() + "]";
	}

}
