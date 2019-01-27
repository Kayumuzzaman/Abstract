package com.Abstract.Abstract;

public abstract class Availability {
	public abstract int getCar();
	public abstract int getMoto();
	public abstract void availability();
	
	public int totalAvailable() {
		return getCar()+getMoto();
	}
}
             