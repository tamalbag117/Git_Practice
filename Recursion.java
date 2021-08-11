/*Power of a number using recursion
callrecursion use as recursive function here 
example like :2 toi the power 4=16;
4 to the power 3 = 64 etc */



import java.util.Scanner;
class Practice{
    public int callrecursion(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return (x * callrecursion(x, n - 1));
        }
        else
        {
            return (x*callrecursion(x,n+1));
        }

    }

}
  public class Recursion {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("the number is:");
          int num= sc.nextInt();
          System.out.println("The power of the number is:");
          int pow= sc.nextInt();
          Practice obj = new Practice();
          int power = obj.callrecursion(pow, num);
          System.out.println(power);
      }

  }


