package com.Abstract.Abstract;

public class Uber extends Availability{
	int car;
	int moto;
	
	public Uber() {
		this.car=0;
		this.moto=0;
	}
	
	@Override
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car=car;
	}
	
	@Override
	public int getMoto() {
		return moto;
	}
	public void setMoto(int moto) {
		this.moto=moto;
	}
	public Uber(int car, int moto) {
		this.car=car;
		this.moto=moto;
	}

	@Override
	public void availability() {
		System.out.println("Total Uber car available : "+getCar());
		System.out.println("Total Uber bike available : "+getMoto());
		
	}
}
