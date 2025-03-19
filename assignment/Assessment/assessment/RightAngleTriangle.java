import java.util.Scanner;
public class RightAngleTriangle{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter length of base ");
	int number = input.nextInt();

	for (int count = 0; count < number; count++ ){
		for(int space = 0; space < number; space ++){
			System.out.print(" ");
		}
		for(int counter = 0; counter < count; counter++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}


	
	