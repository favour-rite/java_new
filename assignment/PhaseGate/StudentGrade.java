import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
	
		int students = studentsDetails1(userInput);
		int subjects = studentsDetails2(userInput);
		

	

		int[][] spreadSheet = new int[students][subjects];
		
		System.out.println(" Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>\n  Saved successfully  ");
	
		studentScores(userInput,students,subjects,spreadSheet);

		tabularForm(subjects,students,spreadSheet);
	}
	

	public static int studentsDetails1(Scanner userInput){

			System.out.println(" ~~~ STUDENTGRADEAPP )SG( ~~~ ");

			System.out.println("================================= ");		
			System.out.println(" How many students do you have: ");
			int students = userInput.nextInt();
			
			return students;
		
	}
	public static int studentsDetails2(Scanner userInput){

			System.out.println("How many subject do they offer: ");
			int subjects = userInput.nextInt();		
			System.out.println(" ================================= ");

			return subjects;
	}		

	public static void studentScores(Scanner userInput,int students, int subjects, int[][] spreadSheet){
	
			for(int row = 0; row < students; row++ ){
				for(int column = 0; column < subjects; column++){
					System.out.println("Enter score for student " + (row + 1) + " score for subject " + (column + 1) + ": ");
					spreadSheet[row][column] = userInput.nextInt();
				
					while(spreadSheet[row][column] < 0 || spreadSheet[row][column] > 100){
						System.out.println("Invalid inpuy!!!!\nTry AGAIN");
					spreadSheet[row][column] = userInput.nextInt();
					}

				}
			}
		}

	public static void tabularForm(int subjects, int students, int[][] spreadSheet){
		int totalScore = 0;
		System.out.println(" ======================================================================================================================= ");
		System.out.print("STUDENT\t\t ");
			for(int counterOne = 1; counterOne <= subjects; counterOne++){
				System.out.print("SUB" + counterOne + "\t" );
			}
		System.out.println("TOTAL\tAVERAGE\tPOSITION\t");
		System.out.println(" ======================================================================================================================= ");
					for(int count = 1; count <= subjects; count++){
						System.out.print("Student" + count + "\t");

						for(int counter = 0; counter < subjects; counter++){
							System.out.print(spreadSheet[count-1][counter] + "\t");
							totalScore+= spreadSheet[count-1][counter];	
						}
					
					System.out.print(totalScore + "\t");
					double average = totalScore / subjects;
					System.out.printf(" %.2f \t ", average);

					System.out.println("");

					}
		System.out.println(" ======================================================================================================================= ");

		System.out.println();
		System.out.println(" ======================================================================================================================= ");
		}
		
		//int[][] position = array.sort(spreadSheet);
		//for(int index = 0; index <= ; index++){

		}	
	
}





       
		