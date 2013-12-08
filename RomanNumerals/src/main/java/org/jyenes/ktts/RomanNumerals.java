package org.jyenes.ktts;

import java.util.HashMap;
import java.util.Map;


public class RomanNumerals {

	Map<Integer,String> decToRoman;
	

	public String conver(int dec) {
		decToRoman = new HashMap<Integer,String>();
		decToRoman.put(10, "X");
		decToRoman.put(9, "IX");
		decToRoman.put(5, "V");
		decToRoman.put(4, "IV");
		
		StringBuilder result = null;
		int rest = dec;
		result = new StringBuilder();
		rest = appendRoman(result, rest, 10);
		rest = appendRoman(result, rest, 9);
		rest = appendRoman(result, rest, 5);
		rest = appendRoman(result, rest, 4);

		for (int i = 0; i < rest; i++) {
			result.append("I");
		}
		return result.toString();

	}

	private int appendRoman(StringBuilder builder, int rest, int val) {
		
		int result = rest;
		if (result >= val) {
			result -= val;
			builder.append(decToRoman.get(val));
		}
		return result;
	}

}
