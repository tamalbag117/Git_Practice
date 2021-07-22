import java.util.Scanner;
public class MathFittingGeometricCurveTable {
    void Sum(double []array, int s){
        double sum=0;
        for(int i=0;i<s;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("The Sum is :\t"+sum);
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n\t\t\tFitting Geometric Curve Table\n\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Total number of x and y present in the equation:");
        int s=sc.nextInt();
        double[]a=new double[s];
        double[]b=new double[s];
        double[]c=new double[s];
        double[]d=new double[s];
        double[]e=new double[s];
        double[]f=new double[s];
        System.out.println("\n\nValues of x are in the given equation:");
        for(int i=0;i<s;i++)
        {
            System.out.println("The value of x for column no."+(i+1));
            a[i]= sc.nextDouble();
        }
        System.out.println("\n\nValues of y are in the given equation:");
        for (int i=0;i<s;i++)
        {
            System.out.println("value of y for column no."+(i+1));
            b[i]=sc.nextDouble();
        }
        System.out.println("\n\n value of  x, y,X=log x ,Y=log y, X^2=(log x)^2; and x*y is :");
        for(int i=0;i<s;i++)
        {
            System.out.print("\ncolumn no."+(i+1)+"\t");
            System.out.print("\t"+a[i]+"\t");
            d[i]=Math.log10(a[i]);
            System.out.print(Math.log10(a[i])+"\t");
            c[i]=Math.log10(b[i]);
            System.out.print(Math.log10(b[i])+"\t");
            e[i]=Math.pow(d[i],2);
            System.out.println("\t"+Math.pow(d[i],2));
            f[i]=d[i]*Math.log10(b[i]);
            System.out.print("\t"+d[i]*Math.log10(b[i]));
        }
        System.out.println("The value of log y in column");
        MathFittingGeometricCurveTable obj=new MathFittingGeometricCurveTable();
        System.out.println("\n\nsum of x is ∑x=");
        obj.Sum(a,s);
        System.out.println("\n\nsum of y is ∑y=");
        obj.Sum(b,s);
        System.out.println("\n\nsum of X=log x is ∑X=");
        obj.Sum(d,s);
        System.out.println("\n\nsum of Y=log y is ∑Y=");
        obj.Sum(c,s);
        System.out.println("\n\nsum of X^2=(log x)^2 is ∑X^2=");
        obj.Sum(e,s);
        System.out.println("\n\nsum of XY is :");
        obj.Sum(f,s);
    }
}
