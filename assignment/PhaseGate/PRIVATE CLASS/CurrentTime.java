public class CurrentTime{

	public static void main(String[] args){


	long totalMilliseconds = System.currentTimeMillis();

	long totalSeconds  = totalMilliseconds/1000;
	long currentSecond = totalSeconds % 60;

	long totalMinutes  = totalSeconds/60;
	long currentMinute = totalMinutes % 60;
	long totalHours = totalMinutes / 60;

	long currentHour = totalHours % 24;
	long totalDays =  totalHours / 24;

	long currentDay = totalDays % 30;
	System.out.println(currentHour +":"+ currentMinute +":"+ currentSecond); 



public static void Hangman(){

		String[] words = {"level","gerald","victor","jesse","akerele"};

		Random input = new Random();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter in the word");
		String name = input.nextLine();

		String name = input.next();

		String[] randomWord = words;
			System.out.print(randomWord); 
	}


