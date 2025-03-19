import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.println(" ~~Your Period Your Safety");
        System.out.println(" Track Your Menstrual Cycle, Ovulation Dates ");

        System.out.print(" ~~~Enter Your Name: ");
        String name = userInput.next();

       
            System.out.println(" Enter age: ");
            int age = userInput.nextInt();

            if (age < 13) {
                System.out.print(" Obinrin: UNDERAGE!!!... ");
               	System.exit(0);
            } else if (age > 50) {
                System.out.print(" Go and rest or see ur Doctor ");
		System.exit(0);
            } 
		
		
	System.out.println(" Menstrual length ranges between 21 to 35 ");
	System.out.println("Enter your last period length");
	int length = userInput.nextInt();
		
                if (length < 21) {
                    System.out.print("go and see your doctor");
                   System.exit(0);
                } else if (length > 35) {
                    System.out.print("go and see your doctor");
                   System.exit(0);
                }
	
		
        System.out.println(" Enter your last menstrual period (format: yyy-month-day)");
        String lastMenstrualPeriod = userInput.next();

        LocalDate lastPeriod = LocalDate.parse(lastMenstrualPeriod);
        LocalDate nextPeriod = lastPeriod.plusDays(length);
        System.out.println("Your next menstrual cycle is  " + nextPeriod);
	

	System.out.print(" enter your ovulation length: 10-12 days ");
	int cycle = userInput.nextInt();

	System.out.println(" Enter  your last ovulation period (format: yyy-month-day) ");
 	String startDate = userInput.next();

	LocalDate ovul = LocalDate.parse(startDate);
	LocalDate nextOvul = ovul.plusDays(cycle);
	System.out.println(" Your next ovulation period is " + nextOvul);

	
	System.out.print("Enter day of your last period:(format: yyy-month-day) ");
	String flowDate = userInput.next();

	LocalDate lastFlowDate = LocalDate.parse(flowDate);
	LocalDate firstFlowDate = lastFlowDate.plusDays(1);
	LocalDate firstFlowDate = lastSafeDays.plusDays(1);
	


	System.out.println("Your first flow date is: " + firstFlowDate);
	
	System.out.println("Enter length of Your menstrual period ");
	int lengthofCycle = userInput.nextInt();
	int averagelength = cycle/lengthofCycle;
	int result = cycle - averagelength;

	LocalDate safePeriod = firstFlowDate.plusDays(result);	
	System.out.println("Safe period starts from: " + safePeriod);

	System.out.print("Notice: Any other day that doesnt fall between the ovulation(fertile), menstural period is ur safe Cycle (whatever safe means to you omo genzs) ");	

	System.out.println("===========================================");
	System.out.println(" Thanks for Your Patronage ");
	System.out.println(" Sign up for more details ");
	System.out.println("===========================================");
	}
}
