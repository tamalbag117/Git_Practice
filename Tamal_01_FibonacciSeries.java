import java.util.Scanner;
public class Tamal_01_FibonacciSeries {
    public static void main(String[] args) {
       Scanner cc=new Scanner(System.in);
       System.out.println("enter number of terms:");
       int num= cc.nextInt();
       int temp1=0;
       int temp2=1;
       int term =temp1+temp2;
       System.out.println("Fibonacci Series:");
       System.out.print(temp1+",\t"+temp2+"\t,");
       for(int i=1;i<=num;i++)
       {
           System.out.print(term+",\t");
           temp1=temp2;
           temp2=term;
           term=temp1+temp2;
       }
    }
}
