package com.rm.framework;

public abstract class ShopFactory {

	// getNewPrimeAcc Method
	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accName, float charges, boolean isPrime);

	// getNewNormalAcc Method
	public abstract NormalAcc getNewNormalAcc(int accNo, String accName, float charges, float delieveryCharges);
}
