import java.util.Scanner;
public class Account{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);


		private String name;
		private double actualBalance;

		public Account(String name,double actualBalance){

			this.name = name;
			double actualBalance = 15000;

		}

				
		public static void Withdrawal(){

			System.out.println(" %s actualBalance: $%.2f%n accountDetails.getName(), accountDetails.getActualBalance();

			System.out.println(" Enter the amount you want to withdraw ");
			double withdraw = userInput.nextDouble();

			actualBalance.withdrawal(withdraw);
			
			if (accountBalance > withdraw){
				actualBalance -= withdraw;
			}

			else if (withdraw < accountBalance){
				actualBalance -= withdraw;
				System.out.println("Withdrawal amount exceeded account balance.");
			}
			System.out.println(" Your actual balance: " + actualBalance );
			System.out.println(" Your total amount: " + accountBalance);
		}


			

		}










	}

}