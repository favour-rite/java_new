public class SumNumberUsingWhileLoop {


    public static int sumUsingWhileLoop(int[] numbers) {
        int sum = 0;
        int index = 0;

        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumUsingWhileLoop(numbers));
    }

}

