public class App {
     //* */ for(initialization; condition; iteration) statement;
     public static void main(String[] args){
        int counter;
        for(counter = 0; counter <= 10; counter++)//Goes to 10 because of equal sign
            System.out.println("The counter is at: " + counter);
        for(counter = 0; counter < 10; counter++)
            System.out.println("The counter is at: " + counter);//No equal sign means it will go up to the number but does not include the number of iterations.
    }

}