package ex017;
/*
 * Write method maximumOfThree that calculates the maximum of three integer values.
 * 
 * You do not need to use conditional statements for this exercise; the java.Math class will
 * have methods that can help!
*/
public class Maximum{

	public static Integer maximumOfThree(int intOne, int intTwo, int intThree) {
		// TODO Auto-generated method stub
		return Math.max(Math.max(intOne,intTwo), intThree);
	}

}
