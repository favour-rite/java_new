import java.util.Scanner;
public class NokiaExample{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
		System.out.print("""
			Can i greet? ? ?
			Please choose one option:
			1 English
			2 Yoruba
			3 Igbo

			 """);

		int greet = input.nextInt();
			

		switch(greet){

		case 1: 	System.out.print (" Greet \n 1. morning \n 2. Afternoon \n  3. Evening "); 
				int english = input.nextInt();

				switch (english){

				case 1: System.out.print("Bonjour"); break;
				case 2: System.out.print("Bon après-midi"); break;
				case 3: System.out.print("Bonsoir"); break;

				}
					break;
			
		case 2: 	System.out.print(" Greet 1. morning \n 2. Afternoon \n 3. Evening "); 
 
				int yoruba = input.nextInt();
				
				switch(yoruba){

				case 1: System.out.print(" eka "); break;
				case 2: System.out.print(" welldone "); break;
				case 3: System.out.print("good job "); break;

				}
					break;
		

		case 3: 	System.out.print(" Greet 1.\n morning \n 2. Afternoon \n 3. Evening "); 
  
				int german = input.nextInt();

 				switch(german){
				
				case 1: System.out.print(" good day  "); break;
				case 2: System.out.print(" good night "); break;
				case 3: System.out.print("good evening "); break;

				}
			

						
}

		

	}



}