import java.util.Scanner;
	public class ConvertPoundsIntoKilograms
	{

		public static void main(String [] args);
		{
			Scanner userInput = new Scanner(System.in);

			System.out.println("enter number in pounds");
			double pounds = userInput.nextDoubl();

			double onePounds = 0.454;

			double kilograms = pounds * onePounds;
			System.out.println(pounds + " pounds is " + kilograms + "kilograms");









	}
}