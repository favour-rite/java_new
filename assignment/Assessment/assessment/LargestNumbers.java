import java.util.Scanner;
public class LargestNumber{

	public static void main(String [] args){
	Scanner input = new Scanner(Sysetm.out);

	int counter = 0;
	int number = 0;
	int largest = 0;
	int secondLargest = 0;


	while (number <= 10 ){
		System.out.print("Enter 10 integer ");
		number = input.nextInt();

		counter++;

		if(number > largest){
			largest = number;
		}
		else if(number > secondLargest && secondLargest < largest){
			secondLargest = number;
		}
	}

		System.out.print(largest)


	}




}


