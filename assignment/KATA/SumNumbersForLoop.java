

public class SumNumbersForLoop{

    public static int sumUsingForLoop(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumUsingForLoop(numbers));
    }
}





















	


