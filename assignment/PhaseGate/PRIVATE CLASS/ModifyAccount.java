import java.util.Scanner;
public class ModifyAccount{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);


		String name;
		double actualBalance;
		withdrawal();

		public accountDetails(String name, double actualBalance){

			this.name = name;
			double actualBalance = 15000;

		}			
		public static withdrawal(){

			System.out.println(" Enter the amount you want to withdraw ");
			double withdraw = userInput.nextDouble();

			actualBalance.withdrawal(withdraw);
			
			if (actualBalance > withdraw){
				actualBalance -= withdraw;
			}

			else if (withdraw < actualBalance){
				actualBalance -= withdraw;
				System.out.println("Withdrawal amount exceeded account balance.");
			}

			}
		public static getactualBalance(){

			return actualBalance;

			System.out.println(" Your actual balance: " + actualBalance );
			System.out.println($%.2f%n + name + " Your total amount: " + accountBalance);
		}


	}

}