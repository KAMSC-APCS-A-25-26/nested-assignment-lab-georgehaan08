import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // TODO: Step 1 - Get input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:  ");
        int year = sc.nextInt();
        // TODO: Step 2 - Implement nested if logic for leap year
        boolean isLeap = false;

        if(year%4==0){
            isLeap = true;
            if(year%100==0){
                if(year%400==0){
                    isLeap = true;
                }
                else{
                isLeap = false;
                }
            }
        }
        // TODO: Step 3 - Display the result
        if(isLeap){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is NOT a leap year.");
        }

    }
}