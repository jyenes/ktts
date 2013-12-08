package org.jyenes.ktts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RomanNumerals {

	private static final int[] decimals = {10,9,5,4};
	private static final String[] romans = {"X", "IX", "V", "IV"};

	public String conver(int dec) {

		
		StringBuilder result = null;
		int rest = dec;
		result = new StringBuilder();
		for(int i = 0; i< decimals.length; i++){
			rest = appendRoman(result, rest, decimals[i], romans[i]);
			
		}


		for (int i = 0; i < rest; i++) {
			result.append("I");
		}
		return result.toString();

	}

	private int appendRoman(StringBuilder builder, int rest, int val, String roman) {
		
		int result = rest;
		if (result >= val) {
			result -= val;
			builder.append(roman);
		}
		return result;
	}

}
