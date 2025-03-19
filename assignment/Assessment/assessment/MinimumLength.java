import java.util.Scanner;

public class MinimumLength {
	public static void main(String[] args){

		Scanner input= new Scanner(System.in);
	

		System.out.println("Enter Speed ");1
		double speed = input.nextDouble();

		System.out.println("Enter Acceleration: ");
		double acceleration = input.nextDouble();
 
		double length = (speed * speed); 
		double length2 = 2 * acceleration;
		double length3 = length / length2;

		System.out.print( length );



	}
}