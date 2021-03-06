package Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TDD Kt string calculator
 * @author jyenes
 *
 */
public class StringCalculator {

	
	
	public String add(String numbers){
		String result = "0";
		if(numbers.compareTo("")!=0){
			Pattern pattern = Pattern.compile("-?\\d+");
			Matcher matcher = pattern.matcher(numbers);
			int sum =0 ;
	        while(matcher.find()){
	        	sum += Integer.valueOf(matcher.group());
	        }
	        result = sum + "";
		}
		
		return result;
	}
		
}
