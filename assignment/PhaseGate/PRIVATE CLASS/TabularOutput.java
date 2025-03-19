import java.util.Scanner;
public class TabularOutput{
	public static void main (String[] args){

	Scanner input = new Scanner(System.in);


	System.out.println(" number\t n2 \t n3\t n4 ");

	for(int number = 1; number <= 5; number++){

		int n2 = number * number;
		int n3 = number * number * number;
		int n4 = number * number * number * number;

		System.out.println(number +"\t"+ n2 +"\t"+ n3 +"\t"+ n4);

        }
	}
}
