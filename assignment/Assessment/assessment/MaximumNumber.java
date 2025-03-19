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
	
       
        int maximum = number1;

        if (number2 > maximum) {
            maximum = number2;
        }

        if (number3 > maximum) {
            maximum = number3;
        }

        System.out.println("Maximum number: " + maximum);
    



}
}
