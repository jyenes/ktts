package org.jyenes.ktts;


public class RomanNumerals {

	public String conver(int dec) {

		StringBuilder result = null;
		int rest = dec;
		result = new StringBuilder();
		rest = appendRoman(result, rest, 10, "X");
		rest = appendRoman(result, rest, 9, "IX");
		rest = appendRoman(result, rest, 5, "V");
		rest = appendRoman(result, rest, 4, "IV");

		for (int i = 0; i < rest; i++) {
			result.append("I");
		}
		return result.toString();

	}

	private int appendRoman(StringBuilder builder, int rest, int val,  String roman) {
		int result = rest;
		if (result >= val) {
			result -= val;
			builder.append(roman);
		}
		return result;
	}

}
