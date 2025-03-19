public class SumUsingDoWhileLoop{


    public static int sumUsingDoWhileLoop(int[] numbers) {
        int sum = 0;
        int index = 0;

        do {
            sum += numbers[index];
            index++;
        } while (index < numbers.length);

        return sum;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumUsingDoWhileLoop(numbers));
    }
}
