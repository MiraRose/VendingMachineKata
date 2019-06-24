package com.techelevator.items;

public class Chip implements Item {

	private String key;
	private String name;
	private String sound = "Crunch Crunch, Yum!";
	private double price;
	private String type = "Chip";
	private int count;
	
	public Chip(String key, String name, double price, int count) {
		this.key = key;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Chip";
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String getKey() {
		return this.key;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String getSound() {
		return sound;
	}	
	
	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public int getCount() {
		return count;
	}
	
	@Override
	public void reduceCountByOne() {
		count = count - 1;
	}

}
