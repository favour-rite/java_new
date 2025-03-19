import java.util.Scanner;
	public class  VolumeOfCylinder
	{
		public static void main(String [] args)
	{
			Scanner userInput = new Scanner(System.in);

			System.out.println("enter radius");
			double radius = userInput.nextDouble();
			System.out.println("enter length");
			double length = userInput.nextDouble();
			
			double pi = 3.165;
			
			double area = radius * radius * pi;
			double volume = area * length;
			System.out.println("The area is " + area);
			System.out.println("The volume is " + volume);



	}
}