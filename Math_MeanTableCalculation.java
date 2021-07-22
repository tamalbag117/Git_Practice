import java.util.Scanner;
class SumOfNumber {
    double Sum(double[] array, int s) {
        double sum = 0;
        for (int i = 0; i < s; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
public class Math_MeanTableCalculation {
    public static void main(String[] args) {
        System.out.println("\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tClass interval and Mean Value calculation\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Total number of class interval present in the equation:");
        int s=sc.nextInt();
        double[]a=new double[s];
        double[]b=new double[s];
        double[]c=new double[s];
        double[]d=new double[s];
        double[]e=new double[s];
        double[]f=new double[s];
        System.out.println("Enter the Class Interval :one by one ");
        for(int i=0;i<s;i++)
        {
            System.out.println("The value of Class interval for column no."+(i+1));
            a[i]=sc.nextDouble();
            b[i]=sc.nextDouble();
            System.out.println("The frequency of The :"+a[i]+"-"+b[i]+" interval class is");
            f[i]=sc.nextDouble();
        }
        System.out.println("\n\nlet's find out the minvalue");
        for(int i=0;i<s;i++){
            System.out.println(" in column no."+(i+1)+"The mid value (X)of "+a[i]+"-"+b[i]+" interval class is");
            c[i]=(b[i]+a[i])/2;
            System.out.println(c[i]);
        }
        double cc=c[s/2];
        double dd=b[1]-a[1];
        System.out.println("Calculate the y for the table \t∵y=(x-c)/d\t");
        for(int i=0;i<s;i++){
            System.out.println(" in column no."+(i+1)+"The  value y in "+a[i]+"-"+b[i]+" interval class is");
            d[i]=(c[i]-cc)/dd;
            System.out.println(d[i]);
        }
        for(int i=0;i<s;i++){
            System.out.println(" in column no."+(i+1)+"Fy=frequency*y in "+a[i]+"-"+b[i]+" interval class is");
            e[i]=d[i]*f[i];
            System.out.println(e[i]);
        }
        System.out.println("\n\n\nso the table is:\n\n\n");
        for(int i=0;i<s;i++){
            System.out.println(" in column no."+(i+1)+"\t"+a[i]+"\t-\t"+b[i]+"\t\t"+f[i]+"\t\t"+c[i]+"\t\t"+d[i]+"\t\t"+e[i]+"\t\t");
        }
        SumOfNumber obj=new SumOfNumber();
        System.out.println("\n\nsum of frequency is ∑f=\t"+obj.Sum(f,s));
        System.out.println("\n\nsum of x is frequency*y=\t∑Fy=\t"+ obj.Sum(e,s));
        System.out.println("\n\ncalculation\n\n x bar ="+cc+"\t+"+dd+"*y bar");
        System.out.println("the value of y bar is:"+obj.Sum(e,s)/obj.Sum(f,s));
        System.out.println("x bar="+cc+"+\t"+dd+"("+obj.Sum(e,s)/obj.Sum(f,s)+")");
        double x=cc+dd*obj.Sum(e,s)/obj.Sum(f,s);
        System.out.println("\n\n The answer is:\n\t\t\t"+x);
    }
}
