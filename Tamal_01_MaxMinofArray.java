import java.util.Scanner;
public class Tamal_01_MaxMinofArray {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        int s;
        System.out.println("The array size are:");
        s=cc.nextInt();
        int []arr=new int[s];
        System.out.println("The array element,s are:");
        for(int i=0;i<s;i++)
        {
            arr[i]= cc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The maximum number in the array is:\n"+arr[0]);
        System.out.println("the second largest number is the array is:\n"+arr[1]);
        System.out.println("the smallest number in the array is:\n"+arr[s-1]);
        System.out.println("the second smallest number in the array is:\n"+arr[s-2]);
    }
}
