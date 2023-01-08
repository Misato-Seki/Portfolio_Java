public class Variables {
    public static void main (String[] args) {
        int integer = -25;
		char character = 'M';
		String string = "This is going great!";
		boolean truth = true;
		String start = "This is the start of the text ";
		String end = "and here is the end";
        String fullText = start + end;        
        
        System.out.println("Value of the integer variable is: " + integer);
        System.out.println("Value of the character variable is: " + character);
        System.out.println("Value of the character string variable is: " + string);
        System.out.println("Value of the concatenated character string is: " + fullText);
        System.out.println("Value of the truth variable is: " + truth);
    }
}
