package ex019;
/*
 * Write method getSignum that calculates whether an integer is positive, negative, or zero:
*/
public class ConditionalStatements2 {

	public static Object getSignum(int i) {
		if (i > 0) {
			return "positive";
		}
		else if (i < 0) {
			return "negative";
		}
		else {
			return "zero";
		}
	}

}
