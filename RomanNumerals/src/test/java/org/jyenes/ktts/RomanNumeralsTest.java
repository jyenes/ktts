package org.jyenes.ktts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumerals romanNumerals;
	
	@Before
	public void setUp(){
		romanNumerals = new RomanNumerals();
	}
	
	@Test
	public void digitsUnder3Test() {
		assertEquals( "I",romanNumerals.conver(1));
		assertEquals( "II",romanNumerals.conver(2));
		assertEquals( "III",romanNumerals.conver(3));
	}
	
	@Test
	public void FourTest() {
		assertEquals( "IV",romanNumerals.conver(4));
	}
	
	@Test
	public void FiveTest() {
		assertEquals( "V",romanNumerals.conver(5));
	}
	
	@Test
	public void sixSevenEightTest() {
		assertEquals( "VI",romanNumerals.conver(6));
//		assertEquals( "VI",romanNumerals.conver(7));
//		assertEquals( "VI",romanNumerals.conver(8));
	}

}
