package org.jyenes.ktts;



public class RomanNumerals {

	private static final int[] decimals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private static final String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public String conver(int dec) {

		StringBuilder result = null;
		int rest = dec;
		result = new StringBuilder();
		for(int i = 0; i< decimals.length; i++){
			rest = appendRoman(result, rest, decimals[i], romans[i]);
		}
		return result.toString();

	}

	private int appendRoman(StringBuilder builder, int rest, int val, String roman) {
		
		int result = rest;
		while (result >= val) {
			builder.append(roman);
			result -= val;
		}
		return result;
	}

}
