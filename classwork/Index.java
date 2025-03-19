import java.util.Scanner;
public class Index{
	public static void main(String args){
	
	Scanner userInput = new Scanner(System.in);
	int numbers[] = { 12,17,24,32,14 };

	System.out.print("enter number above ");
	int number = userInput.nextInt();


	for(int index = 0; index < numbers.length-1; index--){
		if (number == numbers[index]){
			System.out.print(" The index is " + index);
		}else{
			System.out.println(" this is not available ");
		
		}
	}

	
	}

}