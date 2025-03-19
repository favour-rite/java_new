import java.util.Scanner;

public class  WeekendName{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number to get the weekday : ");
			int number = input.nextInt();
		if(number == 1){
			System.out.print("Monday");
		}
		if (number == 2){
			System.out.print("Tuesday");
		}
		if (number == 3){
			System.out.print("Wednesday");
		}
		if (number == 4){
			System.out.print("Thursday");
		}
		if (number == 5){
			System.out.print("Friday");
		}
		if (number == 6){
			System.out.print("Saturday");
		}
		if (number == 7){
			System.out.print("Sunday");
		}
	}
}

