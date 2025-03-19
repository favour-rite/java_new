import java.util.Scanner;
public class CompareNumbers{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	
		boolean condition = true;
		int smallestnumber= 0;
		int largestnumber=0;

		while (condition){
		System.out.println("Enter a number ");
		int number = input.nextInt(); 
		
		if (number < largest number){
			largest = number;
		}
		else  (number < smallest number){
			smallest = number;
		}
System.out.println (if you want to quit operation, press 0 to stop, press 1 to continue);
		int select = input.nextInt();
		if (select == 1 ){
			condition = false;
		}
		
		else if (select == 0){
			condition == true;
		}	
		else{
			System.out.print("cancel");
		}
		

		}
	

		}
	}
}