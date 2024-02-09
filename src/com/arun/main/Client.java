package com.arun.main;

public class Client {
	
	public static void main(String args[])
	{
		ProductPrototype prototype=new Product("soap","1");
		
		ProductPrototype p1=prototype.Clone();
		
		ProductPrototype p2=prototype.Clone();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
