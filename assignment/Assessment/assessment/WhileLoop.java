
import java.util.Scanner;

public class WhileLoop{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
	
		int sentinel = 0;	

	
		while( sentinel != -1){



		System.out.print(" Enter score ");
		int score = scan.nextInt();

		if (score < 50){
		System.out.print("D");
		}

		else if   (score >= 50 && score <= 60){
		System.out.println("A");
		}else if  (score > 75 && score <= 85){
		System.out.println("B");
		}
		System.out.println("enter -1 to stop 0 to continue");
		sentinel = scan.nextInt();



		
		} 

	
		 

				
	}
}	





