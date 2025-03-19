import java.util.Scanner;
import java.util.Arrays;
public class AverageValues{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	int average= 0;

	int [] number = {23,4,5,5,12,34,23};

	for (int count = 0; count < number.length; count++){
		sum+=number[count];
	
	}
		average = sum / count;
	System.out.print(Arrays.toString(average));
	}

}