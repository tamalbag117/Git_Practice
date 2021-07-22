import java.util.Scanner;
public class AsciiValue_01_Java {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        int c= cc.nextInt();
        for( int i=0;i<c;i++)
        {
            System.out.println((char)i);
        }
    }
}
