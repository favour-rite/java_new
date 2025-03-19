import java.util.Scanner;
public class MaximumNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
	System.out.print("Enter number: ");
	int number1 = input.nextInt();

	System.out.print("Enter number: ");
	int number2 = input.nextInt();
				
	System.out.print("Enter number: ");
	int number3 = input.nextInt();
		int count= 0;
	
       
        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        System.out.println("Largest number: " + largest);
    



}
}
