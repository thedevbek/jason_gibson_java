public class App {
    public static void main(String[] args){
        int i;
        int square;

        for(i = 1; i <= 10; i++){
            square = i * i;
            System.out.println("i is equal to " + i + ", and i squared is equal to : " + square);
        }
        int a = 4;
        if(a == 4){
            a = a + 5;
            System.out.println("a was equal to 4, now it is equal to " + a);
        }

        if(a == 10){
            a = a + 10;
            System.out.println("a was equal to 10, now it is equal to " + a);
        }
    }

}
