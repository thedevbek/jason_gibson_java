import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade = -20;
        System.out.println("What grade did you earn on the exam?");

        if(grade >= 90)
            System.out.println("You earned an A on the exam!");
        else if((grade >= 80) && (grade <= 90))
            System.out.println("You earned a B on the exam!");
        else if((grade >= 70) && (grade <= 80))
        System.out.println("You earned a C on the exam!");
        else if((grade >= 60) && (grade <= 70))
            System.out.println("You earned a D on the exam!");
        else 
            System.out.println("You earned a F on the exam!");
        
    }
}
