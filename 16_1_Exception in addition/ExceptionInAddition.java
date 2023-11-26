import java.util.Scanner;
import java.util.*;

public class ExceptionInAddition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber = 0, secondNumber = 0, result;
        boolean inputCorrect = true;

		// ask number
		
		try {
			System.out.print("Type in the first number: ");
			firstNumber = reader.nextInt();
			System.out.print("Type in the second number: ");
			secondNumber = reader.nextInt();
			
		} catch (java.util.InputMismatchException p) {
			inputCorrect = false;
			
		} 
		
		// calculate

        if(inputCorrect == true) {
            result = firstNumber + secondNumber;
            System.out.println("Result: " + result);
        } else {
            System.out.println("You did not type in an integer!");
        } 
    }
}
