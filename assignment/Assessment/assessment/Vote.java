import java.util.Scanner;
public class Vote{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter userage: ");
		int usersage = input.nextInt();
		
		if (userage >= 18){
			System.out.println(" vote ");
		}

		else if (userage >= 16){
			System.out.println(" drive ");
		}

		else if (userage > 21){
			System.out.println(" drink ");
		}



}
}

