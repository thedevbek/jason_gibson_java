public class App {
    public static void main(String[] args) {
        char character;

        // character = 'r';
        // System.out.println(character); output is r
        // character++; increases
        // System.out.println(character);
        // character--; decreases
        // System.out.println(character);
        int i;
        for(i = 30; i <= 126; i++){
            character = (char) i;
            System.out.println("Code: " + i + " Corresponds to: " + character);
        }
        
    }
}