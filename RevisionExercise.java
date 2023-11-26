import java.util.*;

public class RevisionExercise {
    public static void main(String[] args) {
      
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
       
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
      
        setArray(realArray);
        
        printArray(realArray);
    }

	private static int askInfo(int[] tempArray){
		Scanner reader = new Scanner(System.in);
		int n;
		int i = 0;
		do{
			System.out.print(i + 1 +". number: ");
			n = reader.nextInt();
			tempArray[i] = n;
			i++;
		}while(n != 0);
        reader.close();
		return i-1;

	}
			

	private static int[] copyInfo(int[] realArray, int[] tempArray){
		for (int i=0; i < realArray.length; ++i) {
			realArray[i] = tempArray[i];
		}
		return realArray;
	}

	
	private static void setArray(int[] realArray){
		for (int i = 0; i < realArray.length-1; ++i) {
			for (int j=i+1; j < realArray.length; ++j) {
				if (realArray[i] < realArray[j]) {
					int tmp = realArray[i];
					realArray[i] = realArray[j];
					realArray[j] = tmp;
				}
			}
		}
	}

    public static void printArray(int[] realArray ) {
        System.out.println("\nOrdered array: ");
        for(int i = 0; i < realArray .length; i++) {
            System.out.println(realArray [i]);
        }
    }
}