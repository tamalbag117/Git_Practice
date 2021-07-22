import java.util.Scanner;
public class Tamal_01_GradationSwitchIfElse {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int k = 9;
        while(k!=0)
        {
        System.out.println("enter the marks student obtained");
        int marks = cc.nextInt();
        System.out.println("check the grade using if-else statement");
        if (marks <= 100 && marks >= 90) {
            System.out.println(" your grade is O");
        } else if (marks < 90 && marks >= 80) {
            System.out.println(" your grade is E");
        } else if (marks < 80 && marks >= 70) {
            System.out.println(" your grade is A");
        } else if (marks < 70 && marks >= 60) {
            System.out.println(" your grade is B");
        } else if (marks < 60 && marks >= 50) {
            System.out.println(" your grade is C");
        } else if (marks < 50 && marks >= 40) {
            System.out.println(" your grade is D");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("failed");
        } else {
            System.out.println("invalid input");
        }
        System.out.println("checking gradation using switch case statement ");
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("your grade is o");
                break;
            case 8:
                System.out.println("your grade is E");
                break;
            case 7:
                System.out.println("Your grade is A");
                break;
            case 6:
                System.out.println("your grade is B");
                break;
            case 5:
                System.out.println("your grade is C");
                break;
            case 4:
                System.out.println("your grade is D");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Failed");
                break;
            default:
                System.out.println("invalid input");
        }
        System.out.println("do you wants to check another student's marks");
        k = cc.nextInt();
        if (k != 0) {
            System.out.println("yes , i want to check");
        } else {
            System.out.println("no thanks");
        }
    }
    }
}
