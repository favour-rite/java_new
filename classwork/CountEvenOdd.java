
public class CountEvenOdd {
	public static void main(String[] args) { 
		number();
		number2();
	}


		public static void number(){

			int[] numbers = {1, 2, 3, 6,8,10}; 

			int evenCount = 0; 
			int oddCount = 0; 
		
			for (int number : numbers) { 
	
				if (number % 2 == 0) { 

					evenCount++; 
				} else { 
					oddCount++; 

				}
 			}

	 
			System.out.println("Even numbers: " + evenCount); 				System.out.println("Odd numbers: " + oddCount); 
		}
		public static void number2(){
			int [] numbers ={5,3,7,9,2,8};

			int evenCount = 0;
			int oddCount = 0;

			for(int number :  numbers){
				if (number % 2 == 0) { 

					evenCount++; 
				} else { 
					oddCount++; 

				}
 			}

	 
			System.out.println("Even numbers: " + evenCount); 				System.out.println("Odd numbers: " + oddCount); 
		}

			

		


	
}