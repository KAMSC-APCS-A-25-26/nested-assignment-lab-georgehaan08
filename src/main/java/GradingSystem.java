import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score (0–100):");
        int grade = sc.nextInt();
        if(grade>=98)
        {
            System.out.println("The grade is: A+");
        }
        else if(grade>=94)
        {
            System.out.println("The grade is: A");
        }
        else if(grade>=90)
        {
            System.out.println("The grade is: A-");
        }
        else if(grade>=88)
        {
            System.out.println("The grade is: B+");
        }
        else if(grade>=84)
        {
            System.out.println("The grade is: B");
        }
        else if(grade>=80)
        {
            System.out.println("The grade is: B-");
        }
        else if(grade>=78)
        {
            System.out.println("The grade is: C+");
        }
        else if(grade>=74)
        {
            System.out.println("The grade is: C");
        }
        else if(grade>=70)
        {
            System.out.println("The grade is: C-");
        }
        else if(grade>=68)
        {
            System.out.println("The grade is: D+");
        }
        else if(grade>=64)
        {
            System.out.println("The grade is: D");
        }
        else if(grade>=60)
        {
            System.out.println("The grade is: D-");
        }
        else
        {
            System.out.println("The grade is: F");
        }







    }
}
