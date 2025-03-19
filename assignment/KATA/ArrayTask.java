import java.util.Arrays;

public class ArrayFunctions{
	public static void main(String[] args){
	
	int [] number = {3,5,90,6,7,4};
	System.out.print(" The Largest number is : "+ largestElement(number));
	
	int[] numbers = {2,3,4,5,6,7};

		System.out.print("The reserve list: ");
		reverse(numbers);

	int target = 7;
	System.out.println("The occuring number is " + target );


	}

	public static int largestElement (int[] number){
	int largest = number[0];
	for (int count = 0; count < number.length; count++){
		if (number[count] > largest) 
		largest = number[count] ;
	}
	return largest;

	}
	public static void reverse(int[] number) {

		for (int count = number.length-1; count >= 0; count--) {
		
			System.out.println(number[count] + " ");
	}
	System.out.println();
	}

	public static void occuring(int[] numbers,int target){
	for(int count = 0; count < numbers.length; count++){
		if (numbers[count] == target){	
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	}
	}

	public static void oddposition(int[] number){
		 for (int count = 0; count < number.length; count++) {
          	  	if (number[count] % 2 != 0) {
              	 		System.out.println(number[count] + " ");
           	 	}
			}
		}
	public static void evenposition(int[] number){
		   
       		 for (int count = 0; count < number.length; count++) {
            		if (number[count] % 2 == 0) {
                		System.out.println(number[count] + " ");
           		 }
		}
	}
	public static void concatenates() {

		int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};
		int length = 0;
		for (int count = 0; count < array.length; count++) {
			length += array[count].length;
		}
		int[] concatenated = new int[length];
		int sum = 0;
		for (int count = 0;count < array.length; count++) {
			for (int counter = 0;counter < array[count].length;counter++) {
				concatenated[sum++] = array[count][counter];
			}
		}
		System.out.println(Arrays.toString(concatenated));
	}
	

}









