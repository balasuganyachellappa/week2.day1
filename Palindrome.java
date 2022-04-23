package week2.day1;

public class Palindrome {
	public static void main(String[] args) {

		String name = "malayalam"; // a) Declare A String value as"madam"
		String rev = ""; // b) Declare another String rev value as ""
		for (int i = 0; i < name.length(); i++) // c) Iterate over the String in reverse order
		{
			char ch = name.charAt(i);

			rev = ch + rev; // d) Add the char into rev
		}

		System.out.println(rev);

		if (name.equals(rev)) // e) Compare the original String with the reversed String, if it is same then
			// print palinDrome

			System.out.println("the string is a palindrome");
	}

	

}
