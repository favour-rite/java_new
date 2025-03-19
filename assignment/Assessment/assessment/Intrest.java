import java.util.Scanner;
   
public class Intrest{
public static void main(String[] args){


Scanner input= new Scanner(System.in);

System.out.print("Enter balance ");
float balance=input.nextFloat();

System.out.print("Enter interest rate ");
float interestRate=input.nextFloat();

float financialApplication= balance*(interestRate)/1200;

System.out.print(financialApplication);


}


}