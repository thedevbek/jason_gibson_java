/*
 *Scanner is an object. KeyboardInput is a variable name object class Scanner. Which is getting read in by (System.in)

 nextInt();
 nextDouble();

 hasNextInt();
 hasNextDouble();
 */


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner keyboardInput  = new Scanner(System.in); 

        int integerNumber = 0;
        double doubleNumber = 0;

        System.out.println("Enter any integer: ");
        if(keyboardInput.hasNextInt() == true) integerNumber = keyboardInput.nextInt();
        System.out.println("You entered the integer number: " + integerNumber);
        
        

        System.out.println("\n\nEnter any decimal number: ");
        if(keyboardInput.hasNextDouble() == true)doubleNumber = keyboardInput.nextDouble();
        System.out.println("You entered the  decimal number: " + doubleNumber);
        
    }
    
}
