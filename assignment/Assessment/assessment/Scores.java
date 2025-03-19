import java.util.Scanner;

public class Scores{
    public static void main(String args[]){
        
        
           Scanner input = new Scanner(System.in);


       		int count = 0;
		
		while (count <= 30 ){
		System.out.print("Enter number ");
		int math = input.nextInt();
		System.out.print("Enter number ");
		int french = input.nextInt();

		System.out.print("Enter number ");
		int music = input.nextInt();

		System.out.print("Enter number ");
		int art = input.nextInt();

		System.out.print("Enter number ");
		int science = input.nextInt();


			count++; 
}
                 

    		 if(score >= 80){
           		 System.out.print("A");
        	}else  
			System.out.println("f");

       		 if( score >= 60 && score < 80){
          		 System.out.print("B");

       		 } else  
			System.out.println("f");
			

      		 if(score >= 40 && score < 60){
          		  System.out.print("C");
			}
        	else 
			System.out.println("f");

		}

}
		 		
	
    }




