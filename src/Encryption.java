import java.util.Scanner;

public class Encryption {

	String dataToEncrypt;
	Scanner sc = new Scanner(System.in);

	String getdata() {
		String dataToEncrypt;
		System.out.print("Enter a Word :-");
		dataToEncrypt = sc.nextLine();
		return dataToEncrypt;
	}

	String swapends(String value) {
		char[] encrypt = value.toCharArray();
		for (int i = 0; i < encrypt.length; i++) {
			int k = i;
			while (i < encrypt.length && encrypt[i] != ' ')
				i++;

			char temp = encrypt[k];
			encrypt[k] = encrypt[i - 1];
			encrypt[i - 1] = temp;

		}
		return new String(encrypt);
	}

	public String encrypt(String pt, int sk) // pt=plain text sk=shiftkey
	{
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		pt = pt.toLowerCase();
		String cipher = "";
		char[] encrypt = pt.toCharArray();
		for (int i = 0; i < pt.length(); i++) {
			if (i != 0) {
				if (encrypt[i] == ' ') {
					for (int j = i; j <= i; j++) {
						int cp = ALPHABET.indexOf(cipher.charAt(j - 1));
						cipher = cipher.substring(0, j - 1);
						int keyval = (cp - sk) % 26;
						if (keyval < 0) {
							keyval = ALPHABET.length() + keyval;

						}
						char rv = ALPHABET.charAt(keyval);
						cipher += rv;
						cipher += " ";
						cipher += pt.charAt(j + 1);
					}
					i = i + 1;

				} else {

					if (i == pt.length() - 1) {
						cipher += pt.charAt(i);
						break;
					}
					// 1
					int charp = ALPHABET.indexOf(pt.charAt(i));
					int keyVal = (sk + charp) % 26;
					char replaceVal = ALPHABET.charAt(keyVal);
					cipher += replaceVal;
				}
			} else {
				// 14 //n
				int charp = ALPHABET.indexOf(pt.charAt(i));
				char replaceVal = ALPHABET.charAt(charp);
				cipher += replaceVal;

			}

		}
		return cipher;
	}

	public static void main(String args[]) {
		Encryption e = new Encryption();
		String value = e.getdata();
		value = value.toLowerCase();
		String swappedData = e.swapends(value);
		System.out.println("Entered Value: - " + value);
		System.out.println("half Output Value: - " + swappedData);
		String output = e.encrypt(swappedData, 2);
		System.out.print("Final output: " + output);

	}

}
