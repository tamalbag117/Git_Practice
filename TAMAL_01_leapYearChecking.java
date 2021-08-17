//leap year checking//
/* Algorithm:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days).
5. The year is not a leap year (it has 365 days).
Time Complexity of this Program :
O(n)
*/
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

