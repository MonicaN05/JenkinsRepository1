package com.adactin.runner;

import org.pom.pack.PojoClass;

public class PojoRunner {

	public static void main(String[] args) {
		PojoClass ob = new PojoClass();
		System.out.println(ob.getMethod());
		ob.setMethod(30);
		System.out.println(ob.getMethod());
		
		int arr[]=ob.getA();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		ob.setA(0, 5);
		System.out.println("New values");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
