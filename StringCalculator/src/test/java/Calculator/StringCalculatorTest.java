package Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Calculator.StringCalculator;



/**
 * TDD Kt string calculator
 * @author yenesj
 *
 */
public class StringCalculatorTest {
	StringCalculator stringCalculator;
	
	@Before	
	public void setUp(){
		stringCalculator = new StringCalculator();
		
	}
	
	@Test
	public void testAddEmpty() {
		assertEquals( "",stringCalculator.add(""));
	}
	
	@Test
	public void testAddOneNumber() {
		assertEquals("1", stringCalculator.add("1"));
		assertEquals("2", stringCalculator.add("2"));
		assertEquals("3", stringCalculator.add("3"));
	}
	
	@Test
	public void testAddTwoNumbers() {
		assertEquals( "3", stringCalculator.add("1,2"));
		assertEquals( "2010", stringCalculator.add("10,2000"));
		assertEquals( "1", stringCalculator.add("10,-9"));
	}
	
	@Test
	public void testAddMoreThanTwoNumbers() {
		assertEquals( "6", stringCalculator.add("1,2,3"));
		assertEquals( "243", stringCalculator.add("10,200,33"));
		assertEquals( "0", stringCalculator.add("1,2,-3"));
		
	}

	@Test
	public void testAddAllowingNewLines() {
		assertEquals( "6", stringCalculator.add("1\n2,3"));
		assertEquals( "1", stringCalculator.add("1,\n"));
		assertEquals( "2000001", stringCalculator.add("1,\n2000000"));
	}
	
	@Test
	public void testAddAllowingAnyDelimiter() {
		assertEquals( "3", stringCalculator.add("//;\n1;2"));
	}
	
	@Test
	public void testAddHandleNoNumbers() {
		assertEquals( "0", stringCalculator.add(";"));
		assertEquals( "0", stringCalculator.add(";;"));
		assertEquals( "0", stringCalculator.add(";\\n;"));
	}
}
