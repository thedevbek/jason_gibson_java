public class App {
    public static void main(String[] args) throws java.io.IOException {

        char input;

        System.out.println("Enter a single character from keyboard, then press ENTER: ");

        input = (char) System.in.read();//Intended to read a single character at a time

        //  System.out.println("The character you typed was: " + input);
        if(input == '1') System.out.println("You typed the number 1!");
        if(input != '1') System.out.println("You did not type in the number 1!");

    }
}

