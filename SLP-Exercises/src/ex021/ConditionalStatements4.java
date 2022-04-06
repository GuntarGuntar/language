package ex021;
/*
 * Changing a verb in English to a corresponding adverb is fairly straight forward in English.
 * 
 * There are three rules to follow:
 * -In most cases, we do this by simply adding -ly to the end of the adjective
 * -When the adjective you want to make into an adverb ends in -y, you must change the y to an i, then add -ly.
 * -When the adjective ends in -le, remove the e and replace it with a y.
 * 
 * Create a method makeAdjective which does exactly this.
*/
public class ConditionalStatements4 {

	public static Object makeAdjective(String adjective) {
		// TODO Auto-generated method stub
		int n = adjective.length(); 
		char ending = adjective.charAt(n - 1);
		
		if (ending == 'e') {
			String adverb = adjective.substring(0, adjective.length() - 1);
			return adverb + "y";
		}
		else if (ending == 'y') {
			String adverb = adjective.substring(0, adjective.length() - 1);
			return adverb + "ily";
		}
		else {
			return adjective + "ly";
		}
	}

}
