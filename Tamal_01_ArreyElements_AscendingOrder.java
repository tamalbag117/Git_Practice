import java.util.Scanner;
public class Tamal_01_ArreyElements_AscendingOrder {
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
        System.out.println("THE Array Element in Ascending order is:");
        for(int i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
