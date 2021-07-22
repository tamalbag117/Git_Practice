import java.util.Scanner;
public class Tamal_01_pattern1 {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("the given range");
        int num= cc.nextInt();
        System.out.println("*\t");
        for(int i=2;i<=num-1;i++)
        {
          System.out.print("*\t");
          for (int j=1;j<=i-2;j++)
          {
              System.out.print("\t");
          }
          System.out.print("*\t");
          System.out.println();
        }
        for(int i=1;i<=num;i++)
        {
            System.out.print("*\t");
        }

    }
}
