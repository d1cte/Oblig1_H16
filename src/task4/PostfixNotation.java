package task4;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class PostfixNotation {
	private static ArrayDeque<Integer> operands = new ArrayDeque<Integer>();
	static StringTokenizer tokens;

	public static int evaluateExpression(String expression) {
		expression = expression.trim();
		if(expression.length() > 0) {
			tokens = new StringTokenizer(expression, " +-/*%", true);
			scanAndProcessTokens();
			return operands.pop();
		}
		else
			return -1; // Foreløpig satt for å markere feil input
	}
	
	private static void scanAndProcessTokens() {
		while(tokens.hasMoreTokens()) {
			String token = tokens.nextToken().trim();
			if(token.length() == 0)
				continue;
			
			else if("+-/*%".contains(token)) {
				calculate(token.charAt(0));
			}
			else
				operands.push(Integer.parseInt(token.trim()));
		}
	}

	private static void calculate(char operator) {
		int result = 0;
		int operand1 = operands.pop();
		int operand2 = operands.pop();

		switch(operator) {
		case '+': 
			result = operand2 + operand1;
			break;
		case '-': 
			result = operand2 - operand1;
			break;
		case '*': 
			result = operand2 * operand1;
			break;
		case '/':
			result = operand2 / operand1;
		}
		operands.push(result);	

		

	}
}
