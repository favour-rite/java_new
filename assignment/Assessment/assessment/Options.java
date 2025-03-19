import java.util.Scanner;
public class Options{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

	

		System.out.print("Enter menu\n 1. Add \n 2. View \n 3. Delect \n 4. Quit");
		int options = input.nextInt();
		switch(options){
		
		case 1 : 
			System.out.print("Add");
			break;
		case 2:
			System.out.print(" View ");
			break;
		case 3:
			System.out.print("Delect");
			break;
		case 4: 
			System.out.print("Quit");
			break;
		default: System.out.println("Invalid");
		
	

		
		}
	
		
		






















}

}