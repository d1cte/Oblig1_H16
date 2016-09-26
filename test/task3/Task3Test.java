package task3;
import static org.hamcrest.CoreMatchers.*;
import static task3.Task3.*;
import static task3.Circle.*;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Task3Test {
	
	@Test
	public void MinWithOneElementShouldReturnElement() {
		Integer[] intArray = {3};
		String[] stringArray = {"Hello"};
		Circle[] circleArray = {new Circle(10.0)}; 
		
		assertThat(min(intArray), is(3)); 
		assertThat(min(stringArray), is("Hello"));
		assertThat(min(circleArray), is(circleArray[0]));
	}
	
	@Test
	public void MinWithMultipleElementsShouldReturnMinElement() {
		Integer[] intArray = {60, -3, 7, -11}; 
		String[] stringArray = {"Hello", "Hi", "Goodbye"};
		Circle[] circleArray = {new Circle(10.0), new Circle(4.1), new Circle()};

		assertThat(min(intArray), is(-11));
		assertThat(min(stringArray), is("Goodbye")); 
		assertThat(min(circleArray), is(circleArray[2])); 
		// Jeg har tolket oppgaven slik at det er elementet
		// som skal returneres og ikke radius til sirkelen.
	}  
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void MinWithNullArrayShouldThrowException() throws IllegalArgumentException {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("List is null");
		String[] stringArray = null;
		min(stringArray); 

	}  
	
	@Test
	public void MinWithArrayLenZeroShouldThrowException() throws IllegalArgumentException {	
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("List is empty");
		String[] stringArray = new String[0];
		min(stringArray);   
	}
	
	@Test
	public void MinWithNoElementsInitializedShouldReturnNull() {
		// Var usikker på hva denne skulle returnere,
		// men valgte å la den returnere null
		String[] stringArray = new String[4];
		Circle[] circleArray = new Circle[3];
		assertNull(min(stringArray)); 
		assertNull(min(circleArray)); 
	}  
	
	@Test
	public void MinWithSomeNullElementsShouldReturnMinElement() {
		Integer[] intArray = {2, 11, null, 6, 10, 1};
		Circle[] circleArray = {null, new Circle(10.0), null, new Circle(4.1), new Circle(-10.3)};
		assertThat(min(intArray), is(1));
		assertThat(min(circleArray), is(circleArray[4]));
	} 

  
	
	
	
}
