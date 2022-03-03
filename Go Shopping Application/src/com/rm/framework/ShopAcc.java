package com.rm.framework;

public abstract class ShopAcc {

	// Fields
	private static int accNo;
	private static String accName;
	private static float charges;

	public ShopAcc(int accNo, String accName, float charges) {
		ShopAcc.accNo = accNo;
		ShopAcc.accName = accName;
		ShopAcc.charges = charges;
	}

	public abstract void bookProduct(float charges);

	public abstract void items(float charges);

	public static int getAccNo() {
		return accNo;
	}

	public static void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}

	public static String getAccName() {
		return accName;
	}

	public static void setAccName(String accName) {
		ShopAcc.accName = accName;
	}

	public static float getCharges() {
		return charges;
	}

	public static void setCharges(float charges) {
		ShopAcc.charges = charges;
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + ", super.toString()" + "]";
	}

}
