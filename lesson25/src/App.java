public class App {
    public static void main(String[] args) 
        throws java.io.IOException {
        
            char input;

            System.out.println("Press any key, then press ENTER: ");
            input = (char) System.in.read();
            System.out.println("You entered the key: " + input);

            input = (char) System.in.read(); //carriage return
            // input = (char) System.in.read(); //line feed

            System.out.println("Press any second key: ");
            input = (char) System.in.read();
            System.out.println("Your second key was: " + input);
    }
}