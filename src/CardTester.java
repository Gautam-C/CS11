/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

		Card lambda = new Card("none", "diamond", 13);
		Card stupe = new Card("none", "diamond", 13);
		Card you = new Card("none", "diamond", 13);

		System.out.println(lambda.suit());
		System.out.println(lambda.rank());
		System.out.println(lambda.pointValue());
		System.out.println(lambda);

		System.out.println(stupe.suit());
		System.out.println(stupe.rank());
		System.out.println(stupe.pointValue());
		System.out.println(stupe);

		System.out.println(you.suit());
		System.out.println(you.rank());
		System.out.println(you.pointValue());
		System.out.println(you);

		System.out.println(System.lineSeparator());

		System.out.println(lambda.matches(you));
	}
}
