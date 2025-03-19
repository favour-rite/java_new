import java.util.Scanner;

public class Arithmetic1{
public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);
		
		System.out.println("enter first number ");
		double number1 = userInput.nextInt();

		System.out.println(" enter second number ");
		double number2 = userInput.nextInt();

		int squareOfFirst = number1 * number1 ;
		int squareOfSecond = number2 * number2;

		int sumOfSquares = squareOfFirst + squareOfSecond;

		int differenceOfSquare = squareOfFirst - squareOfSecond;

	System.out.println(" The square of first number " + squareOfFirst);
	System.out.println(" The square of second number " + squareOfSecond);
	System.out.println(" The sum of the square is " + sumOfSquare);
	System.out.println(" The diffrence ofthe square is" + differenceOfSquares);

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        try {
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}