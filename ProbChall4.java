import java.util.Scanner;

public class ProbChall4 {
    public static void main (String[] args){
        //int vars for the 3 exams
        int exam1, exam2, exam3;
        //double var for average
        double avg;
        //char var for grade
        char grade;

        Scanner keyboard = new Scanner(System.in);

        //get user input for each exam
        System.out.print("Enter Exam 1 score: ");
        exam1 = keyboard.nextInt();
        System.out.print("Enter Exam 2 score: ");
        exam2 = keyboard.nextInt();
        System.out.print("Enter Exam 3 score: ");
        exam3 = keyboard.nextInt();

        //cast the numerator to a double so we do not get integer division
        avg = (double)(exam1 + exam2 + exam3) / 3;

        //multibranch if-else if sets the letter grade (uses the unrounded average)
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else if (avg >= 60)
            grade = 'D';
        else
            grade = 'F';

        ////console output: %.1f gives 1 decimal place, %c is the char, %n is a new line
        System.out.printf("With an avg score of %.1f%nYour grade is: %c%n", avg, grade);
    }
}