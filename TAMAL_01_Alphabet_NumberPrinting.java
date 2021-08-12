import java.util.Scanner;
public class TAMAL_01_Alphabet_NumberPrinting {
    public static void main(String[] args) {
         Scanner cc=new Scanner(System.in);
        //user input
         System.out.print("given number of rows:");
         int num=cc.nextInt();
        //First Pattern
         for(int i=1;i<=num;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(j+"\t");
             }
             System.out.print("\n");
         }
        //Second Pattern
         System.out.println("second pattern:\n");
         for(int i=1;i<=num;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(i+"\t");
             }
             System.out.print("\n");
         }
        //Third Pattern
         System.out.println("third pattern:\n");
         int c=1;
         for(int i=1;i<=num;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(c+"\t");
                 c++;
             }
             System.out.print("\n");
         }
        //fourth pattern
         System.out.println("fourth pattern:\n");
        int d=1;
        for(int i=1;i<=num;i++)
        {
            for(int k=i;k<num;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(d+"\t");
                d++;
            }
            System.out.print("\n");
        }
        //Fifth pattern #Number pattern -1
        System.out.print("Number  pattern part 4:\n");
        int e=1;
        for(int i=1;i<=num;i++)
        {
            for(int k=i;k<num;k++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(e+"\t");
                e++;
            }
            int d1=e;
            for(int k=1;k<i;k++){
            System.out.print(d1-2+"\t");
            d1--;
            }
            System.out.print("\n");
        }
        //Sixth Pattern # Alphabet Pattern
        System.out.print("alphabet pattern:");
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%c\t",64+j);
            }
            System.out.print("\n");
        }
        //Sevent Pattern #Alphabet pattern
        System.out.print("Alphabet pattern:\n");
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.printf("%c\t",64+j);
            }
            System.out.print("\n");
        }
        //Eight Pattern #Alphabet pattern 
        System.out.print("Alphabet Pattern,\n part2:\n");
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%c\t",64+j);
            }
            System.out.print("\n");
        }
        //Ninth pattern # Alphabet pattern
        System.out.print("alphabet pattern\n part 3:\n");
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%c\t",64+i);
            }
            System.out.print("\n");
        }
        System.out.print("Alphabet pattern:\n");
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.printf("%c\t",64+i);
            }
            System.out.print("\n");
        }
    }
}
