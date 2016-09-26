package task1;
import static task1.Password.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordTest {

	@Test
	public void CheckPasswordUnderTenCharsShouldReturnFalse() {
		assertFalse(checkPassword("123456789"));   
		assertFalse(checkPassword("abcdefg"));  
		assertFalse(checkPassword("abc123"));  
		assertFalse(checkPassword("a"));
		assertFalse(checkPassword("")); 
	} 
	 
	@Test
	public void CheckLengthTenCharsPlusShouldReturnTrue() {
		assertTrue(checkLength("1234567890"));   
		assertTrue(checkLength("abcdefghij"));  
		assertTrue(checkLength("abcdef123456"));  
	} 
	   
	@Test 
	public void CheckPasswordWithSpecialCharsShouldReturnFalse() {
		assertFalse(checkPassword("*"));
		assertFalse(checkPassword("123bbbbSZ0bbb/"));
		assertFalse(checkPassword("123b-bbBbbbb"));
	}

	@Test
	public void checkPasswordWithoutAnyDigitsShouldReturnFalse() {
		assertFalse(checkPassword("abcdefghijklmn"));
		assertFalse(checkPassword("abcdEFHJijklMN"));
	}
	
	@Test
	public void CheckPasswordWithUnderThreeDigitsShouldReturnFalse() {
		assertFalse(checkPassword("abcdefghijklmn1"));
		assertFalse(checkPassword("abcdEFHJijklMN12"));
		assertFalse(checkPassword("abcdEFH12JijklMN"));
	}
	@Test
	public void checkPasswordWithValidInputShouldReturnTrue() {
		assertTrue(checkPassword("aBcDe12345"));
		assertTrue(checkPassword("aBcD12zzQQ3"));
		assertTrue(checkPassword("aB5cD1AZz0a"));

	}
	



}
