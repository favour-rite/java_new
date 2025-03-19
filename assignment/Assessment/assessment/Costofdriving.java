import java.util.Scanner;

   public class Costofdriving{
      public static void main(String[] args){

Scanner input= new Scanner(System.in);


System.out.print("enter driving distance ");
 float distance=input.nextFloat();

System.out.print("enter miles per gallon ");
 float miles=input.nextFloat();

System.out.print("enter price per gallon ");
 float price=input.nextFloat();

 float division=(distance/miles*price);

System.out.printf("%c%f",'$', division);


}

}