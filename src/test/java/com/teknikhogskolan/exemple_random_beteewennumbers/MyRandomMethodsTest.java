package com.teknikhogskolan.exemple_random_beteewennumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {
	MyRandomMethods mrm = new MyRandomMethods ();
	@Test
	public void testBeteewen1And10() {
		int result = mrm.randomBeteewen1And10();
		assertTrue((result >= 1) && (result <= 10)); 
	}
	@Test 
	public void testBeteewen11And20() {
		int result = mrm.randomBeteewen11And20();
		assertTrue((result >= 11) && (result <= 20)); 
	}
	@Test
	public void testBeteewen21And130() {
		int result = mrm.randomBeteewen21And30();
		assertTrue((result >= 21) && (result <= 30)); 
	}
	@Test
	public void testBeteewen31And40() {
		int result = mrm.randomBeteewen31And40();
		assertTrue((result >= 31) && (result <= 40)); 
	}
	@Test
	public void testBeteewen41And50() {
		int result = mrm.randomBeteewen41And50();
		assertTrue((result >= 41) && (result <= 50)); 
	}

}
