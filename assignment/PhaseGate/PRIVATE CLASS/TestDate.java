import java.util.Scanner;
public class TestDate {

public static void main(String args[]){

		Date date = new Date(0,0,0);

		Scanner input = new Scanner(System.in);


		System.out.println("Enter hour");
		int hour=input.nextInt();
	
		System.out.println("Enter minute ");
		int minute = input.nextInt();
		
		System.out.println("Enter seconds");
		int seconds=input.nextInt();

		date.setseconds(second);
		date.setDay(minute);
		date.setMonth(month);

		date.displayDate();


}

