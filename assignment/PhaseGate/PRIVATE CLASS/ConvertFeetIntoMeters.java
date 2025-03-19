import java.util.Scanner;
	public class ConvertFeetIntoMeters
	{
		public static void main(String [] args)
		{
		Scanner userInput = new Scanner(System.in);

		System.out.println("enter value for feet");
		double feet = userInput.nextDouble();
		
		double oneFoot = 0.305; 
		double meters = feet * oneFoot;

		System.out.print(feet + " feet is " + meters + " meters ");
	}
}