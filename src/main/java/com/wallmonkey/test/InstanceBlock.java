package com.wallmonkey.test;

public class InstanceBlock 
{

	String name;
	int id;
	{
	System.out.println("Inside the Instance blick");
	}
	void method()
	{
		System.out.println("Inside Method");
	}
	InstanceBlock (String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(name);
		System.out.println(id);
		
	}
	
	public static void main(String[] args)
	{
		InstanceBlock i1 = new InstanceBlock("Jogendra", 1);
		InstanceBlock i2 = new InstanceBlock("Vikash", 2);
	}
	static
	{
		System.out.println("Inside the Static Block");
	}
	
}
