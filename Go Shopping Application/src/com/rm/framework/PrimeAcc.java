package com.rm.framework;

public abstract class PrimeAcc extends ShopAcc {
	// Fields
	private static boolean isPrime;
	private static final float deliveryCharges = 0.0f;

	// Constructor
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		PrimeAcc.isPrime = isPrime;

	}

	public static boolean getisPrime() {
		return isPrime;
	}

	public static float getDeliverycharges() {
		return deliveryCharges;
	}

	// bookProduct Method
	public abstract void bookProduct(float charges);

	// toString method
	@Override
	public String toString() {
		return "PrimeAcc [getCharges()=" + getCharges() + ",toString()=" + super.toString() + getDeliverycharges()
				+ "]";
	}

}
