
import java.util.Arrays;
public class SpecificValues{

	public static void main(String[] args){
	
		int [] number = {23,4,5,5,12,34,23};
		int target = 34;
		for (int count = 0; count < number.length; count++){
			if(number[count] == target){
				System.out.print(" yes ");
			}else{
				System.out.print(" no ");	
			}
		}
	}
}