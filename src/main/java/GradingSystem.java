import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        // TODO: Step 1 - Get the score from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a score (0–100):Enter a score (0–100):Enter a score (0–100):Enter a score (0–100):Enter a score (0–100): WORKK!!!!! ITS IN THERE!!! Enter a score (0–100): COME ON!!!!! AHHH");
        System.out.println("fine, lets try two Enter a score (0–100):");
        int score = sc.nextInt();

        // TODO: Step 2 - Implement nested if logic for letter grades
        String grade;

        if(score >= 90){ // A
            if(score >= 98){
                grade = "A+";
            }
            else if(score <= 93){
                grade = "A-";
            }
            else{
                grade = "A";
            }
        }
        else if(score >= 80){ // B
            if(score >= 88){
                grade = "B+";
            }
            else if(score <= 83){
                grade = "B-";
            }
            else {
                grade = "B";
            }
        }
        else if(score >= 70){ // C
            if(score >= 78){
                grade = "C+";
            }
            else if(score <= 73){
                grade = "C-";
            }
            else{
                grade = "C";
            }
        }
        else if(score >= 60){ // D
            if(score >= 68){
                grade = "D+";
            }
            else if(score <= 63){
                grade = "D-";
            }
            else{
                grade = "D";
            }
        }
        else{
            grade = "F";
        }
        // TODO: Step 3 - Display the result
        System.out.println("The grade is: " + grade);
    }
}