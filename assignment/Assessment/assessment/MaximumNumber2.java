import java.util.Scanner;
	public class MaximumNumber2{
		public static void main (String [] args){
		Scanner input = new Scanner(System.in);





		System.out.println("Enter  integers: ");
		int integer1 = input.nextInt();
		System.out.println("Enter  integers: ");
		int integer2 = input.nextInt();
		System.out.println("Enter  integers: ");
		int integer3 = input.nextInt();

		int maximumNumber = 0;


		if (integer1 < integer2){
			maximumNumber = integer2;
		}

		 if (integer3 > integer2){
			maximumNumber = integer3;
		}
		
		System.out.print( maximumNumber );

	}
}