import java.util.Scanner;
import java.util.Arrays;
public class SumValues{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	int sum = 0;

	int [] number = {23,4,5,5,12,34,23};

	for (int index = 0; index < number.length; index++){
		sum+=number[index];

	
	}
	System.out.print(Arrays.toString(sum));
	}

}