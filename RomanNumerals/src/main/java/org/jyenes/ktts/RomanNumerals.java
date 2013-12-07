package org.jyenes.ktts;


public class RomanNumerals {

	public String conver(int dec) {

		StringBuilder result = null;
		int rest = dec;
		result = new StringBuilder();
		if (dec == 9){
			return "IX";
		}
		if (rest >=5){
			rest -= 5;
			result.append("V");
		}
		
		if (rest == 4) {
			rest -=4;
			result.append("IV");
		}

		for (int i = 0; i < rest; i++) {
			result.append("I");
		}
		return result.toString();

	}

}
