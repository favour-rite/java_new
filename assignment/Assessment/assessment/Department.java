import java.util.Scanner;
public class Department{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		
	System.out.print("Enter your departmnt  \n 1. IT \n 2. HR \n 3. FINANCE \n ");
		int department = input.nextInt();

	switch(department){

case 1:
	System.out.print(" IT \n 1. Manager \n 2. Analyst \n 3. Imtern ");		

	Scanner it = new Scanner(System.in);
	System.out.print(" Input a number ");
	int iT = it.nextInt();

	switch(iT){

	case 1:
		System.out.print(" Manager ");
		break;
	case 2: 
		System.out.print(" Analyst ");
		break;
	case 3:
		System.out.print(" Intern ");
		break;
}break;


case 2:
	System.out.print(" HR  \n 1. Manager \n 2. Analyst \n 3. Imtern ");	
	Scanner head = new Scanner(System.in);
	System.out.print(" Input a number ");

	int hR = head.nextInt();
	switch(hR){


	case 1:
		System.out.print(" Manager ");
		break;

	case 2:System.out.print(" Analyst ");
		break;

	case 3:System.out.print(" Intern ");
		break;
}break;


case 3:
	System.out.print(" Finance  \n  1. Manager \n 2. Analyst \n 3. Imtern ");
	Scanner scan= new Scanner(System.in);

	System.out.print("\n Input a number ");
	int finance = scan.nextInt();

	switch(finance){

	case 1:
		System.out.print(" Manager ");
		break;
	case 2:
		System.out.print(" Analyst ");
		break;
	case 3:System.out.print("Intern ");
		break;
	}
				

		



		}
		

	}
	

}