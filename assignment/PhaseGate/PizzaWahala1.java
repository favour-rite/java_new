import java.util.Scanner;
public class PizzaWahala1{
	public static void main (String [] args){

	Scanner userInput = new Scanner(System.in);
	
	System.out.println(" Iya Abimbola Pizza joint Yaba ");

	System.out.println("Enter number of guests at the birthday party: ");
	int orders = userInput.nextInt();

	System.out.println("""
	_________________________________________________________
	|pizza type 	|Number of Slices	|Price perbox 	|
	|_______________________________________________________|
	|sapa size	|	4		|	2,000   |
	|_______________________________________________________|
	|small money	|	6		|	2,400   |
	|_______________________________________________________|
	|big boys	|	8		|	3000    |
	|_______________________________________________________|
	|odogwu: 	|	12		|	4,200   |
	|_______________________________________________________|

		Enter pizza type you want to buy: 
	""");

		int pizzaSize = userInputInt();

		int number_of_slices = 0;
		int price_per_box = 0;

		if (pizzaSize == "Sapa size"){
			int number_of_slices1 = 4;
			int price_per_box = 2000;
		}else if (pizzaSize == "Small money"){
			int number_of_slices2 = 6;
			int price_per_box = 2400;
		}
		elseif (pizzaSize == "big boys"){
			int number_of_slices3 = 8;
			int price_per_box = 3000;
		}
		else if (pizzaSize == "Odogwu"){
			number_of_slices4 = 12;
			price_per_box = 4200;
		}

	number0fBboxes =(orders/ numberofslices);
	leftOver = (numberOfBoxes * numberofslices) - orders;
	totalPrices = numberOfBboxes * pricesperbox;
	

	System.out.println("Numbers of pizza to buy: " + numberOfBboxes + boxes);
	System.out.println("Numbers of leftOver: " + leftOver +  slices);
	System.out.println("Price: " + totalPrices);


	}
}