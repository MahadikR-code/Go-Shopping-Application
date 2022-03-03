package com.rm.entry;

import com.rm.application.GSNormalAcc;
import com.rm.application.GSPrimeAcc;
import com.rm.application.GSShopFactory;
import com.rm.framework.NormalAcc;
import com.rm.framework.PrimeAcc;
import com.rm.framework.ShopFactory;

public class Main {
	public static void main(String[] args) {

		// Instantiation of GSShopFactory by using reference of ShopFactory
		ShopFactory obj = new GSShopFactory();

		// Instantiation of GSPrimeAcc by referring PrimeACC
		PrimeAcc obj2 = new GSPrimeAcc(1, "john", 0.0f, true);

		// Instantiation of AccNormalAcc by referring NormalAcc
		NormalAcc obj3 = new GSNormalAcc(2, "shawn", 100, 100.0f);
		obj3.bookProduct(1000);
		obj2.bookProduct(1000);

		System.out.println(obj3);
		System.out.println(obj2);

		// Invoking toString Method
		obj.toString();
	}
}
