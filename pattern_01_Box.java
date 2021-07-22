import java.util.Scanner;
public class pattern_01_Box {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("how many row do you want's to print");
        int s=cc.nextInt();
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s;j++)
            {
                if(i==1||i==s||j==1||j==s)
                {
                    System.out.print("\t*");
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
