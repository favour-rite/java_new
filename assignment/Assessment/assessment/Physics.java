import java.util.Scanner; 
  public class Physics{
  public static void main(String[] args) {

Scanner input= new Scanner(System.in);

System.out.print("enter v0 ");
  float v0=input.nextFloat();

System.out.print("enter v1 ");
  float v1=input.nextFloat();

System.out.print("enter timespan ");
  float timeSpan=input.nextFloat();

  float acceleration= (v1-v0)/timeSpan;

System.out.print(acceleration);



}




}