package works;

import java.io.*;

public class Cipher {
	static int key = 1101;
	public static void main(String[] args) throws IOException {
				
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		String plaintext = br.readLine();
		System.out.println(Cipher.encode(plaintext));
		System.out.println(Cipher.decode(
				Cipher.encode(plaintext)));
		fr.close();
	}
	public static String decode(String enc) {
		return encode(enc);
	}
	public static String encode(String enc) {
		StringBuilder encoded = new StringBuilder();
		for (char i : enc.toCharArray()) {
		     if (Character.isLetter(i)) {
		    	 encoded.append((char) (i^=key));
			} else {encoded.append(i);}
		}
		return encoded.toString();
	}
}
