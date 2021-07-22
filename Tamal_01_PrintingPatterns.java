import java.util.Scanner;
public class Tamal_01_PrintingPatterns {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("row size:");
        byte num= cc.nextByte();
        System.out.println("first problem");
        for(int i=1;i<=num;i++)
        {
            for (int j=1;j<=num;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println("next problem:\n");
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
        System.out.println("next problem:");
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println("next operation:");
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int k=i;k<=num;k++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println("next operation:");
        for(int i=1;i<=num;i++)
        {
            for(int k=i;k<num;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println("star pyramid");
        for (int i=1;i<=num;i++)
        {
            for(int k=i;k<num;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println("reverse pyramid");
        for(int i=num;i>=1;i--)
        {
            for(int k=num;k>i;k--)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println("Kazue' Barfi printing\n ");
        int num1=num-1;
        for (int i=1;i<=num;i++)
        {
            for(int k=i;k<num;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        for(int i=num1;i>=1;i--)
        {
            for(int k=num1;k>=i;k--)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }

    }
}
