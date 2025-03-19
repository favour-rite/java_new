import java.time.LocalDate;
import java.util.Scanner;

public class Period{

	}
	public static void main(String [] args){
		cycleLength();



	}


	Scanner userInput = new Scanner(System.in);
	
	System.out.println(" ~~~Your Period Your Safety~~~");
	System.out.println("do u want to know about your menstrual cycle: ");
	String answer = userInput.next();

	
	System.out.print(" ~~~Enter Your Name: ");
	String name = userInput.next();

	System.out.println();

	System.out.println(" Enter age: ");
	int age = userInput.nextInt();


	
	if (age < 13){
		System.out.println(" PIKIN wetin u dey find ");
		System.out.print(" Obinrin: UNDERAGE!!!... DANGER ");
	}else if (age > 50){

		System.out.println(" Go Rest You Don Old ");
	}


i
	public static void cycleLength(){

		System.out.print("Cycle length is from the FIRST DAY of your period to "THE DAY BEFORE YOUR NEXT PERIOD START...the days in between is your cycle length ");

		System.out.println(" Enter your average cycle length (in days): ");
       		int cycleLength = userInput.nextInt();
		call = cycleLength - ovulatingPeriod;
	}

	public static void fertileWindow(){
		System.out.print("Your Ovulation starts 14days before your next period
");		

		beforeOvulating = 2;
		afterOvulatng = 2;
		ovulatingPeriod = 14;
		ovulation = cycleLength - ovulating;
		fertileWindow = ovulation + beforeOvulating + afterOvulating;
	}



	








