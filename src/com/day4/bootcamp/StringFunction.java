package com.day4.bootcamp;

public class StringFunction {

	static boolean Anagram(String str1, String str2) {
		int count = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {
					if (str1.toLowerCase().charAt(i) == str2.toLowerCase().charAt(j)) {
						count++;
					}
				}
			}
			if (str1.length() <= count) {
				return true;
			}
		}

		return false;
	}

	static boolean IsPalindrome(String str1) {
		// int len = str1.length();
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		if (str2.equals(str1)) {
			return true;
		}
		return false;
	}

	static void IterativeString(String string, int i, int n) {
		if (i == n) {
			System.out.println(string);
		} else {
			for (int j = 1; j <= n; j++) {
				string = swap(string, i, j);
				IterativeString(string, i + 1, n);
				string = swap(string, i, j);
			}
		}
	}

	static String swap(String string, int i, int j) {

		char temp;
		char charArray[] = string.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void permutation(String input) {
		permutation("", input);
	}
	
	private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);

        } else {
            for (int i = 0; i< word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abc";
		//int n = string.length();
		permutation(string);
		/*
		 * boolean result = Anagram("earth", "heart"); System.out.println(result);
		 * boolean reverse = IsPalindrome("nitin"); System.out.println(reverse);
		 */

		//IterativeString(string, 0, n - 1);
	}

}
