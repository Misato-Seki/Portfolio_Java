import java.util.Scanner;
import java.util.*;

public class ExceptionInArray {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int elementNumber = 0;
        boolean inputCorrect = true;
        int[] array = {4,5,8,9,1,32,5,8,32,7,9,5};
        
        System.out.print("Which element to print? ");

        // ask which element the user wants to print
        // print the value of the given element. 
        // print  You did not type in an integer
        // If index number is incorrect, Invalid index is printed
        try {
            elementNumber = reader.nextInt();
            inputCorrect = true;
            
        } catch (java.util.InputMismatchException p) {
            inputCorrect = false;
            
        } 

        if(inputCorrect == true) {
            if(elementNumber >=0 && elementNumber <= array.length - 1){
                System.out.println(array[elementNumber - 1]);
            }
            else{
                System.out.println("Invalid index!");
            }
        }
        else{
            System.out.println("You did not type in an integer!");
        }

    }
}