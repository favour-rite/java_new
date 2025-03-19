import java.util.Scanner;
public class MultiplicationTables{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		for(int count = 1; count <= 12; count++){
		
			for(int counter = 12; counter > 0; counter--){
				int total = counter * count;

			System.out.print(counter + " * " + count + " = " + total+"\t");
			} 
			System.out.print(" ");
		}
	}
}