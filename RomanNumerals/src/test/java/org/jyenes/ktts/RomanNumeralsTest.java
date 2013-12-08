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
		assertEquals( "VII",romanNumerals.conver(7));
		assertEquals( "VIII",romanNumerals.conver(8));
	}
	
	@Test
	public void nineTest() {
		assertEquals( "IX",romanNumerals.conver(9));
	}
	@Test
	public void tenTest() {
		assertEquals( "X",romanNumerals.conver(10));
	}

}
