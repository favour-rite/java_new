import java.util.Scanner;
public class ChosenCourse{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

System.out.print(" Enter your choice subject \n 1. Math \n 2. Science \n 3. History ");
int course = input.nextInt();


		switch(course){
case 1:
	System.out.print("Math \n 1.Freshman \n 2.Sophomore \n 3.Jenior  \n 4. Senior");
	Scanner math = new Scanner(System.in);

	System.out.print("\n Input a number ");
	int number1 = math.nextInt();

	switch(maths){

	case 1:
		System.out.print(" Freshman ");
		break;
	case 2:
		System.out.print(" Sophomore ");
		break;
	case 3:
		System.out.print(" Junior ");
		break;
	case 4:
		System.out.print(" Senior ");
		break;
}break;


case 2:
	System.out.print(" Science \n 1.Freshman \n 2.Sophomore  \n 3.Junior  \n 4. Senior ");	
	Scanner scan = new Scanner(System.in);

	System.out.print("\n Input a number ");
	int science = scan.nextInt();

	switch(science){


	case 1:
		System.out.print(" Freshman ");
		break;

	case 2:System.out.print(" Sophomore ");
		break;

	case 3:System.out.print(" Junior ");
		break;
	case 4:
		System.out.print(" Senior ");
		break;

}break;


case 3:
	System.out.print("History  \n 1. Freshman \n 2. Sophomore \n 3.Junior \n 4.Senior  ");
	Scanner histories = new Scanner(System.in);

	System.out.print("\n Input a number ");
	int history = histories.nextInt();

	switch(history){

	case 1:
		System.out.print(" Freshman ");
		break;
	case 2:
		System.out.print(" Sophomore ");
		break;

	case 3:System.out.print(" Junior ");
		break;

	case 4:
		System.out.print(" Senior ");
		break;

	}
				

		



		}
		

	}
	

}