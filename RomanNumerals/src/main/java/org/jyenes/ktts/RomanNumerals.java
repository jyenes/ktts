package org.jyenes.ktts;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

	public String conver(int dec) {
		
		Map<Integer, String> romans = new HashMap<Integer,String>();
		romans.put(1, "I");
		romans.put(5, "V");
		romans.put(10, "X");
		romans.put(50, "L");
		romans.put(100, "C");
		romans.put(500, "D");
		romans.put(1000, "M");
		
		return romans.get(dec);
	}

}
