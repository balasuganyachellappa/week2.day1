package week2.day1;

import java.util.Arrays;

import lombok.EqualsAndHashCode;

public class Anagram {
	public static void main(String[] args) {

		// *Declare a String
		String text1 = "stops";
		// *Declare another String
		String text2 = "potss";
		if (text1.length() == text2.length()) // * a) Check length of the strings are same then (Use A Condition)
		{
			for (int i = 0; i < text1.length(); i++) {
				char ch[] = text1.toCharArray();
				char ch2[] = text2.toCharArray(); // * b) Convert both Strings in to characters
				// System.out.print(ch[i]);
				// System.out.print(ch2[i]);      // * c) Sort Both the arrays
				Arrays.sort(ch);
				Arrays.sort(ch2);
				// System.out.println(new String(ch));
				// System.out.println(new String(ch2));
				if (ch[i] == ch2[i]) {           // d) Check both the arrays has same value
					System.out.println("both arrays have same value---"+ch[i]+ "---"+ch2[i]);
				}

			}

		}
	}
}
