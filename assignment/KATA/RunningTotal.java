public class RunningTotal{
	public static void main(String[] args) {
        	int[] number = {1,2,3,4,5};
        	computeRunningTotal(number);
    	}

	public static int runningtotal(int[] number){
       		int runningTotal = 0;
        	for (int count = 0; count < number.size(); count++) {
        	    runningTotal += number.get(count);
        	System.out.println("Running total after adding " + number.get(count) + ": " + runningTotal);
       		}
    
}

