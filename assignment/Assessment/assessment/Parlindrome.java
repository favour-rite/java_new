import java.util.Scanner;
public class Parlindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter three digit ");
		int number = scan.nextInt();

		int  num= number / 100;
		int secondnum = number / 100;
		int remainder = number/10;
		int lastnum = remainder % 10; 
		
		if  (lastnum == num){
		System.out.println(" is a parlindrome" );
		}
		else{
		System.out.println("is not a parlindrome " );
		}
		
		
		}

}