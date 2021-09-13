package com.bvks.designpatterns.singleton;

public class EarlyInstantiationObject {
	private static EarlyInstantiationObject instance = new EarlyInstantiationObject();
	
	private EarlyInstantiationObject() {}
	
	public static EarlyInstantiationObject getEarlyInstantiationObject() {
		return instance;
	}
	
	public void printHashCode() {
		System.out.println(instance.hashCode());
	}
	
}
