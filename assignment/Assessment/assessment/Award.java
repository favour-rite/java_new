import java.util.Scanner;
public class Award{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a rank : ");
		int rank = input.nextInt();

		switch(rank){
		case 1:
			System.out.print( " Gold Medal ");
				break;
		case 2:
			System.out.print( " Silver Medal " );
				break;
		case 3:
			System.out.print( " Bronze Medal " );
				break;
		case 4:
			System.out.print( " Participat Ribbon " );
				break;
		}



	}



}
















	