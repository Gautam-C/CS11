/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] r1 = new String[]{"A", "B", "C"};
		String[] r2 = new String[]{"D", "E", "F"};
		String[] r3 = new String[]{"G", "H", "I"};

		String[] s1 = new String[]{"Allo", "Ball", "Cal"};
		String[] s2 = new String[]{"Am", "Bm"};
		String[] s3 = new String[]{"All", "Bom", "Cared", "Defunkt"};

		int[] v1 = new int[]{1, 2, 3};
		int[] v2 = new int[]{4, 5, 6};
		int[] v3 = new int[]{7, 8, 9};

		Deck d1 = new Deck(r1, s1, v1);
		Deck d2 = new Deck(r2, s2, v2);
		Deck d3 = new Deck(r3, s3, v3);

		System.out.println(d1.deal());
		System.out.println(d2.deal());
		System.out.println(d3.deal());

		System.out.println(d1.isEmpty());
		System.out.println(d2.isEmpty());
		System.out.println(d3.isEmpty());

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
