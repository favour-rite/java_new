import java.util.Scanner;
public class Conversion{
	public static void main (String[] args){

		Scanner input= new Scanner(System.in);


		System.out.print("enter a value for feet ");
		double value= input.nextDouble();

		double foot=0.305;
		double meter=(value* foot);
 		System.out.print(meter);








	}



}