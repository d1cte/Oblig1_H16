package task2;
import static task2.FormatInteger.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FormatIntegerTest {
	
	@Test
	public void FormatNegativeNumberShouldReturnNumber() {
		assertEquals("-12", format(-12, 5));   
	}
	
	@Test
	public void FormatWidthShorterThanNumberShouldReturnNumber() {
		assertEquals("12", format(12, 1));
		assertEquals("718", format(718, 2));
	}
	
	@Test
	public void FormatWidthEqualToLengthOfNumberShouldReturnNumber() {
		assertEquals("12", format(12, 2));
		assertEquals("5143", format(5143, 4)); 
	}
	
	@Test
	public void FormatWidthOneGreaterThanLenOfNumberShouldReturnOnePrefixZero() {
		assertEquals("012", format(12, 3));
		assertEquals("0123456", format(123456, 7));
	}
	
	@Test
	public void FormatWidthGreaterThanLenOfNumberShouldReturnPrefixZeros() {
		assertEquals("000012", format(12, 6));
		assertEquals("000000001", format(1, 9)); 
	}
}

