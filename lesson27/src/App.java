/*
 #if you have only a simple if/else statement you don't need the {} You can get away without it. 
 */

public class App {
    public static void main(String[] args) {
        int score = 95;
       
        if(score >= 90){
            System.out.println("You scored a " + score +" on the exam.");
            System.out.println("You are a genius!");
        }
        else{
            System.out.println("You scored a" + score +" on the exam.");
            System.out.println("You are a dumb ass...work harder. I know you smart!!");
        }
    }
}

