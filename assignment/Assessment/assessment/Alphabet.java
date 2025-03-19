import java.util.Scanner;

public class Alphabet{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a single character from alphabets: ");
		String alphabet = input.next();

		
		if (alphabet == "a" || alphabet == "e" || alphabet == "i" || alphabet == "o" || alphabet == "u" ){
			System.out.print("it is vowel: ");
		}else{
			System.out.print("it is consonant: ");
		}

	}
}
