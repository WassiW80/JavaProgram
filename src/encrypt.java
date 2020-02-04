
public class encrypt {
	static String count(String str) {
		// Create an equivalent char array
		// of given string
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			// k stores index of first character
			// and i is going to store index of last
			// character.
			int k = i;
			while (i < ch.length && ch[i] != ' ')
				i++;

			// Swapping
			char temp = ch[k];
			ch[k] = ch[i - 1];
			ch[i - 1] = temp;

			// We assume that there is only one space
			// between two words.
		}
		return new String(ch);
	}

	static void encode(String s, int k) {

		// changed string
		String newS = "";

		// iterate for every characters
		for (int i = 0; i < s.length(); ++i) {
			// ASCII value
			int val = s.charAt(i);
			// store the duplicate
			int dup = k;
			if (i == 0) {
				newS += (char) val;
			} else {
				// if k-th ahead character exceed 'z'
				if (val + k > 122) {
					k -= (122 - val);
					k = k % 26;

					newS += (char) (96 + k);
				} else {
					newS += (char) (val + k);
				}

				k = dup;
			}
		}
		// print the new string
		System.out.println(newS);
	}

	/*
	 * static void replace(String str) { int i = 0; while(i>=0) { while (i>=0 &&
	 * str.charAt(i)==' ') { i--; } int j=i; while (i>=0 && str.charAt(i)!= ' ') {
	 * i--; } if (j<0) { break; } int count=(j-1)+(i-1); System.out.println(count);
	 * } }
	 */
	public static void main(String[] args) {
		String str = "geeks for geeks";
		// System.out.println(count(str));
		String str1 = count(str);
		System.out.println(str1);
		encode(str1, 2);
	}

}
