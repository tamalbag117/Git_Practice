//leap year checking//
import java.util.Scanner;
public class TAMAL_01_leapYearChecking {
    public static void main(String[] args) {
        int k=9;
        while(k!=0) {
            Scanner cc = new Scanner(System.in);
            System.out.println("THE YEAR IS:");
            int year = cc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("YES\n the year:" + year + "is a leap year");
                    } else {
                        System.out.println("NO\n the year :" + year + "is not a leap year");
                    }
                } else {
                    System.out.println("YES\n the year:" + year + "is a leap year");
                }
            } else {
                System.out.println("no\n the year:" + year + "is  not a leap year");
            }
            System.out.println("do you wants to check again?");
            k = cc.nextInt();
            if (k == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

