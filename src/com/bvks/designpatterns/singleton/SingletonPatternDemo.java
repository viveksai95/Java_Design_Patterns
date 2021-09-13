package com.bvks.designpatterns.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		EarlyInstantiationObject dbConnForProducts = EarlyInstantiationObject.getEarlyInstantiationObject();

		dbConnForProducts.printHashCode();

		EarlyInstantiationObject dbConnForAccounts = EarlyInstantiationObject.getEarlyInstantiationObject();

		dbConnForAccounts.printHashCode();

	}

}
