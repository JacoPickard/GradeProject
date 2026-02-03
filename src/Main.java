import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            numberGradeToLetterGrade(scanner);
            System.out.print("Do you want to enter another grade? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
        }
        while (choice == 'y');
        scanner.close();
        System.out.println("Program ended.");
    }
    public static void numberGradeToLetterGrade(Scanner scanner) {
        System.out.println("Grading Program");
        System.out.println("Provides letter grade given number grade.");
        System.out.print("Please input a number grade: ");
        double numberGrade = scanner.nextDouble();
        System.out.println("Number grade is " + numberGrade);
        if (numberGrade >= 90) {
            System.out.println("You get an A");
        }
        else if (numberGrade >= 80) {
            System.out.println("You get a B");
        }
        else if (numberGrade >= 70) {
            System.out.println("You get a C");
        }
        else if (numberGrade >= 60) {
            System.out.println("You get a D");
        }
        else if (numberGrade >= 0) {
            System.out.println("You get an F");
        }
        else {
            System.out.println("Invalid grade entered");
        }
    }
}