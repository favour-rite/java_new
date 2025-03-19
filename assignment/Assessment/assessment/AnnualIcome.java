import java.util.Scanner;
public class AnnualIncome{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual income: ");
		int tax = input.nextInt();

		if (tax <= 9875){
			System.out.print(" 10% ");
		} 
		if (tax <= 40125){
			System.out.print(" 12% ");
		} 
		if (tax <= 85525){
			System.out.print(" 22% ");
		} 
		if (tax < 85526 ){
			System.out.print(" 24% ");
		} 



}
}
