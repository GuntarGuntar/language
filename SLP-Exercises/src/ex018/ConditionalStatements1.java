package ex018;
/*
 * Write method isNumberEven that calculates whether an integer is even or odd:
*/
public class ConditionalStatements1 {

	public static Object isNumberEven(int i) {
		boolean number = i % 2 ==0;
		if (number == true) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	
}
