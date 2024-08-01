package org.pom.pack;



public class PojoClass {
	private int b= 10;
	private int[] A = {1,2,3};
	
	public void setA(int index, int value)
	{
		this.A[index]=value;
	}
	
	public int[] getA()
	{
		return A;
		
	}	
	
	/*
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	*/
	
	
	public int getMethod()
	{
		return b;
	}
	
	public void setMethod(int i)
	{
		this.b=i;
	}
	
}
