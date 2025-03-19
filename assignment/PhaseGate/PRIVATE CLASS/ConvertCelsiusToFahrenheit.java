import java.util.Scanner;
public class ConvertCelsiusToFahrenheit
	{
	public static void main(String [] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("enter a Celsius degree");
		double celsius = userInput.nextDouble();
	
		double fahrenheit = (9.0/5) * celsius + 32;

		System.out.print(celsius + " is " + fahrenheit + " Fahrenheit ");

	}
}