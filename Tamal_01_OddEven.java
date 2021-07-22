import java.util.Scanner;
public class Tamal_01_OddEven {
    Scanner cc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("the array size is:");
        int s= cc.nextInt();
        int []arr=new int [s];
        System.out.println("the array element are:");
        for(int i=0;i<s;i++)
        {
            arr[i]= cc.nextInt();
        }
        int sumE=0,sumO=0,even=0,odd=0;
        for(int i=0;i<s;i++)
        {
            if(arr[i]%2==0)
            {
               sumE+=arr[i];
               even++;
            }
            else
            {
                sumO+=arr[i];
                odd++;
            }
        }
        System.out.println("the frequency of odd number is:\n"+odd);
        System.out.println("sum of the odd number is:\n"+sumO);
        System.out.println("the frequency of even number is:\n"+even);
        System.out.println("sum of the even number is:\n"+sumE);

    }
}
