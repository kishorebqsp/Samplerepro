package test;

import org.junit.Assert;
import org.junit.Test;

import app.Electricityapp;


public class Testelectricity {
	@Test
	public void testOne()
	{
		Electricityapp a=new Electricityapp();
		int expected = 60;
		int actual =a.costelectricity(20, "Home");
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testTwo()
	{
		Electricityapp a=new Electricityapp();
		int expected = 100;
		int actual =a.costelectricity(20, "Comm");
		Assert.assertEquals(expected, actual);
		
	}

}
