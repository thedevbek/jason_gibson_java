public class App {public static void main(String[] args) {
    // Was a review about scope and how the {} are how Java determines scope. 
    int count = 0;

    for(count = 0; count <= 8; count++){
        int bek = 5;
        System.out.println("Beginning of loop Bek = " + bek);
        bek = -25;
        System.out.println("End of loop Bek = " + bek + "\n");
    }
}
}
