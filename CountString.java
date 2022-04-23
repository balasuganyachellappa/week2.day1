package week2.day1;

public class CountString {
	public static void main(String[] args) {

		String str = "welcome to chennai";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char str1 = str.charAt(i);
			if (str1 == 'e')
				count = count + 1;
		}
		System.out.println("e =" + count);

	}
}
