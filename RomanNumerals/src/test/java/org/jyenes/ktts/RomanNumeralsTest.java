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
	public void basicTest() {
		assertEquals( "I",romanNumerals.conver(1));
		assertEquals( "V",romanNumerals.conver(5));
		assertEquals( "X",romanNumerals.conver(10));
		assertEquals( "L",romanNumerals.conver(50));
		assertEquals( "C",romanNumerals.conver(100));
		assertEquals( "D",romanNumerals.conver(500));
		assertEquals( "M",romanNumerals.conver(1000));
	}
	
	@Test
	public void digitsUnder3Test() {
		assertEquals( "I",romanNumerals.conver(1));
		assertEquals( "II",romanNumerals.conver(2));
		assertEquals( "III",romanNumerals.conver(3));
	}

}
