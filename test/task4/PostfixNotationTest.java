package task4;
import static task4.PostfixNotation.*;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PostfixNotationTest {
	private String input;
	private int expected;

	
	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", -1}, // Foreløpig returneres -1 for å markere feil input
			{"1", 1},
			{"1 1 +", 2},
			{"1 2 +", 3},
			{"1 2 + 2 /", 1},
			{"1 2 + 5 *", 15},
			{"30 10 - 2 *", 40},
			{"30 10 - 2 *", 40},
			{"30 10 / 2 *", 6},
			{"30 10 / 2 +", 5},			
		});
	}

	public PostfixNotationTest(String input, int expected) {
		this.input = input;
		this.expected = expected;
	}
	@Test
	public void test() {
		assertEquals(expected, evaluateExpression(input));
	}


}
