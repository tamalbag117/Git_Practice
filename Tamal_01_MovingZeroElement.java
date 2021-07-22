import java.util.Scanner;
public class Tamal_01_MovingZeroElement {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("size of the array is:");
        int s = cc.nextInt();
        int[] arr = new int[s];
        System.out.println("enter the new array element:");
        for (int i = 0; i < s; i++) {
            arr[i] = cc.nextInt();
        }
        System.out.println("after moving zero to the end of the array\n now the array elements are:");
        int count = 0;
        for (int i = 0; i < s; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + "\n");
            } else if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(0+"\n");
        }
    }
}