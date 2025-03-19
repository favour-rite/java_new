import java.util.Scanner;
public class Temperaure1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		
		System.out.println("Enter amount of water ");
		double amount = input.nextDouble();

		System.out.println("Enter finalTemperature ");
		double finalTemperature = input.nextDouble();
		
		System.out.println("Enter initial  ");
		double initial = input.nextDouble();

		double result = amount * ( finalTemperature - initial ) * 4184;
		
	
		System.out.println(result);
}




}





































