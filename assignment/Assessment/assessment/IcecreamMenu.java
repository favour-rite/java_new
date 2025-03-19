import java.util.Scanner;
public class IcecreamMenu{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please Your Order!!! \n Ice-cream Menu \n 1. ice-cream \n 2. sundae \n 3.shake ");
		int dessert = input.nextInt();

		switch(dessert){
		
		case 1: 
			System.out.print(" Ice-cream ");
			Scanner gothrough = new Scanner(System.in);

			System.out.print(" Input number ");
			int icecream = gothrough.nextInt();
			
			switch(icecream){

			case 1:
				System.out.print(" Chocolate ");
					break;

			case 2:
				System.out.print(" Vanila ");
					break;

			case 3:
				System.out.print(" Strawberry ");
					break;
		}	break;



		case 2: 
			System.out.print(" Sundae ");
			Scanner scan = new Scanner(System.in);

			System.out.print("\n Input number: ");
			int sundae = scan.nextInt();
			
			switch(sundae){

			case 1:
				System.out.print(" Chocolate ");
					break;

			case 2:
				System.out.print(" Vanila");
					break;

			case 3:
				System.out.print(" Strawberry ");
					break;

		}  	break;



		case 3: 
			System.out.print(" Shake ");
			Scanner connect = new Scanner(System.in);

			System.out.print(" Input number ");
			int shake = connect.nextInt();
			
			switch(shake){

			case 1:
				System.out.print(" Chocolate ");
					break;

			case 2:
				System.out.print(" Vanila ");
					break;
			case 3:
				System.out.print(" Strawberry ");
					break;
}break;

		}
	
	}




}