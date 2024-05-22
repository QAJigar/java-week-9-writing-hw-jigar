package homework_week_9.Programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Please first number :"); //input wizard
            int a = scanner.nextInt();
            System.out.print("Please second number :");//input wizard
            int b = scanner.nextInt();
            System.out.print("Please enter symbol +,-,*,/ :");//input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new  Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation Please enter ''Y'' or ''N'' : ");
            answer=scanner.next().toLowerCase(Locale.ROOT);
        }while (answer.startsWith("y"));
        //Scanner close
        scanner.close();
    }
}
