import java.util.Scanner;

public class ConvertPound{
public static void main(String[] args){

Scanner input= new Scanner(System.in);


System.out.print("enter number in pounds ");
double numPounds= input.nextDouble();

double onePounds=0.454;

double answer= numPounds * onePounds;
 System.out.print(answer);




}



}