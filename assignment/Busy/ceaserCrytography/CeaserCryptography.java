import java.util.Scanner;

public class CeaserCryptography {

	public static String CipherEncryptedMsg(String message, int number){
		StringBuilder encryptedText = new StringBuilder();

		for (int count = 0; count < message.length(); count++) {
			char index = message.charAt(count);

			if (Character.isUpperCase(index)) {
				index = (char) (((index - 'A' + number) % 26) + 'A');
			} else if (Character.isLowerCase(index)) {
				index = (char) (((index - 'a' + number) % 26) + 'a');
			}
				encryptedText.append(index);
			}
				return encryptedText.toString();
		}

	public static String CipherDecryptedMsg(String encryptedText, int number) {
		return CipherEncryptedMsg(encryptedText, 26 - number);
	}


	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("Choose an option:");
            System.out.println("1. Encrypt a message");
            System.out.println("2. Decrypt a message");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();  

            switch (choice) {
                case 1:
                   
                    System.out.print("Enter a text message: ");
                    String messageToEncrypt = input.nextLine();
                    System.out.print("Enter a number between 0 and 26: ");
                    int encryptShift = input.nextInt();
                    String encryptedMessage = CipherEncryptedMsg(messageToEncrypt, encryptShift);
                    System.out.println("Encrypted message: " + encryptedMessage);
                    break;

                case 2:
                   
                    System.out.print("Enter the encrypted message: ");
                    String encryptedMessageToDecrypt = input.nextLine();
                    System.out.print("Enter a number between 0 and 26: ");
                    int decryptShift = input.nextInt();
                    String decryptedMessage = CipherDecryptedMsg(encryptedMessageToDecrypt, decryptShift);
                    System.out.println("Decrypted message: " + decryptedMessage);
                    break;

                case 3:
                    
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);  
    }
}