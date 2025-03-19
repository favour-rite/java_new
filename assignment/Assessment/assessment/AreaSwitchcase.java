import java.util.Scanner;
public class AreaSwitchcase{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Area of different shapes you want to calculate \n 1. Circle \n 2. Rectangle \n 3. Triangle ");
		int area = input.nextInt();
		
		switch(area){
			case 1: 
				System.out.println(" Cicle\n  1. Radius ");
				Scanner scann = new Scanner(System.in);

				System.out.print(" Input number ");
				int circle = scann.nextInt();

				switch(circle){
					case 1:
 						System.out.print(" Enter radius ");
						int radius = scann.nextInt();

				double pi = 3.42;

				double areaofcircle =  pi * radius * radius;

				System.out.print(areaofcircle);
			} break;
				
				

			case 2: 
				System.out.print(" Rectangle ");
				Scanner scan = new Scanner(System.in);

				System.out.print(" Input number ");
				int rectangle = scan.nextInt();

			switch(rectangle){
			
				case 1: 
					System.out.print(" Enter length ");
					int length1 = scan.nextInt();
						
					System.out.print(" Enter breadth ");
					int breadth = scan.nextInt();

					double areaofrectangle2 =  length1 * breadth;

					System.out.print( areaofrectangle2  );
			} break;

			case 3:
				System.out.print(" Triangle ");
				Scanner gothrough = new Scanner(System.in);

				System.out.print(" Input number ");
				int Triangle = gothrough.nextInt();

			switch(Triangle){
			

				case 1: 
					System.out.print(" Enter Breath");
						int breath = gothrough.nextInt();
			
					System.out.print(" Enter height ");
						int height = gothrough.nextInt();
					
					double half = 0.5;

					double areaoftriangle3 = half * breath * height;

					System.out.print(areaoftriangle3);

					}
				
				







		}




	}



}