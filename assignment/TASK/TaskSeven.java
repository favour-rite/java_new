public class TaskSeven{
	public static void main(String [] args){

	int count = 4;
	for (; count <= 1024; count*=4){ 
			System.out.println( count );
		}
		int counter = 8;
	for (; counter <= 32768; counter*=4){ 
			System.out.println( counter );
	}



	int sum = count + counter;

	System.out.print(sum);
}
}