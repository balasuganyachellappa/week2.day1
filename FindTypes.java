package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] ch = test.toCharArray();
		int letter = 0, space = 0, num = 0, specialChar = 0;

		for (int i = 0; i < test.length(); i++) {

			boolean ch1;

			if (ch1 = Character.isLetter(ch[i]))
				letter = letter + 1;
			// System.out.println(ch1);

			else if (ch1 = Character.isDigit(ch[i]))
				num = num + 1;

			else if (ch1 = Character.isSpaceChar(ch[i]))
				space = space + 1;

			else
				specialChar = specialChar + 1;

		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacter: " + specialChar);
	}
}
