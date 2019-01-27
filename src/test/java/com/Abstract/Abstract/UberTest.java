package com.Abstract.Abstract;

import static org.junit.Assert.*;

import org.junit.Test;

public class UberTest {

	@Test
	public void testGetCar() {
		Uber ub = new Uber();
		//Pathao pt = new Pathao();
		ub.setCar(10);
		ub.setMoto(20);
		//System.out.println(ub.totalAvailable());
		assertEquals(30,ub.totalAvailable());
	}

	@Test
	public void testGetMoto() {
		fail("Not yet implemented");
	}

}
