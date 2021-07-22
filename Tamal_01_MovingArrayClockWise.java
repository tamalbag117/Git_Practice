import java.util.Scanner;
public class Tamal_01_MovingArrayClockWise {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("size of the array is:");
        int s = cc.nextInt();
        int[] arr = new int[s];
        System.out.println("enter the new array element:");
        for (int i = 0; i < s; i++) {
            arr[i] = cc.nextInt();
        }
        System.out.println("we are going to moving array element clockwise!\n");
        int d= cc.nextInt();
        System.out.println("d="+d);
        System.out.println("\n the clockwise rotating Array is:\n");
        for(int i=d;i<s;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i<d;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
