//package lec6_lists3;

public class SLListLauncher {
	public static void main(String[] args) {
		/**
		 * Write out desired type during declaration
		 * Use the empty diamond operator <> during instantiation
		 * When declaring or instantiating your data structure,
		 * use the reference type:
		 *   int: Integer
		 *   double: Double
		 *   char: Character
		 *   boolean: Boolean
		 *   long: Long
		 */
		SLList<String> s1 = new SLList<>("bone");
		s1.addFirst("thugs");
	}
} 