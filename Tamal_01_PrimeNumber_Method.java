import java.util.Scanner;
public class Tamal_01_PrimeNumber_Method {
    static void checkPrime(int num){
        int i,m=0,flag=0;
        m=num/2;
        if(num==0||num==1)
        {
            System.out.println(num+"is not a prime number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
               if(num%i==0)
               {
                   System.out.println("the number :"+num+"\nis not a prime number!");
                   flag=1;
                   break;
               }
            }
             if(flag==0)
        {
            System.out.println(num+"is a prime number");
        }
        }
    }

    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        short k=1;
        while(k!=0)
        {
            System.out.println("the number is:");
            int number=cc.nextInt();
            checkPrime(number);
            System.out.println("\n\n\n do you wants to continue if yes press any key except zero");
            k= cc.nextShort();
            if(k!=0)
                System.out.println("continue");
            else
                System.out.println("discontinue");

        }
    }
}
