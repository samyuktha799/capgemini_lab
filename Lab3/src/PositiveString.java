/*
 *  A string is considered a positive string, if on 
 *  moving from left to right each character in the 
 *  String comes after the previous characters in the Alphabetical order.
 *  
 */

import java.util.*;

public class PositiveString {

	public static boolean positiveString(String string1) {

		for (int index = 0; index < string1.length()-1; index++) {
			if (((string1.charAt(index))) > ((string1.charAt(index + 1)))) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String....");
		String string1 = sc.next();
		System.out.println(positiveString(string1));
		sc.close();

	}

}