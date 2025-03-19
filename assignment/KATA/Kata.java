public class Kata{
	public static void main(String[] args){
		System.out.println(isEven(6));
		System.out.println(isPrime(4));	
		System.out.println(subtract(4,2));
		System.out.println(divide(4,2));
		System.out.println(factors(10));	
//		System.out.println(isSquare(25));
//		System.out.println(isParlindrome25));
//		System.out.println(factorial(7));
//		System.out.println(squareroot(25));
	}
	public static Boolean isEven(int number){
		if (number % 2 == 0){
			return true;
		}else{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,
			return false;
		}
	}
	public static Boolean isPrime(int number){
		int factors = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0){
				factors++;
			}
		}
		if(factors == 2){
			return true;
		}else{
			return false;
		}
	}
	
	public static Integer subtract(int number1,int number2){
		if (number1 > number2){
			return number1 - number2;
		}else{
			return number2 - number1;
		}
	}
	public static Float divide(int number1,int number2){
		int dividend = 25; 
		int divisor = 4;

   		 int quotient = dividend / divisor;
   		 int remainder = dividend % divisor;

    }

	public static Integer factors(int number){
		int count = 0;
        	for (int index = 1; index <= number; index++) {
           	 if (number % index == 0) {
                	count++;

	            }
		}
		return count;
	}
	

	
}