import  java.util.Scanner;
public class Multiples {
         public static void main (String[] agrs) {
                   Scanner input = new Scanner(System.in);
                 
                   System.out.print("enter first number.  ");
                   int firstNum= input.nextInt();

                   System.out.print("enter second number. ");
                    int secondNum=input.nextInt();

		int result1=  firstNum * firstNum * firstNum;

		int result2= secondNum * secondNum;

		 if (result2 % result1 == 0) {
			System.out.printf("True");
		}

		else {
			System.out.print("false");
		}

	}

}