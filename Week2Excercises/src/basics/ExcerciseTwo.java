package basics;

public class ExcerciseTwo {
	public static void main(String[] args) {
		char[] array = new char[26]; //http://bcbutler.com/Java_Tuts/fill_array_with_alphabet.php
		
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			array[ch-'a'] = ch;
		}
		
		System.out.print(array);
		
		System.out.println("\n");
		
		char[] alphabet = new char[26];
		char currentLetter = 'a';
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = currentLetter;
			currentLetter++;
		}
		System.out.print(alphabet);
	}
}
