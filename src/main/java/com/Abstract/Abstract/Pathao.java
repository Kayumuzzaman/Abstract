package com.Abstract.Abstract;

public class Pathao extends Availability{
	int car;
	int moto;
	
	public Pathao() {
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
	public Pathao(int car, int moto) {
		this.car=car;
		this.moto=moto;
	}

	@Override
	public void availability() {
		System.out.println("Total pathao car available : "+getCar());
		System.out.println("Total pathao bike available : "+getMoto());
		
	}
}
