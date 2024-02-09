package com.arun.main;

public class Product implements ProductPrototype{
	
	private String name;
	
	private String id;
	
	

	public Product(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public ProductPrototype Clone() {
		
		return new Product(this.name,this.id);
	}

}
