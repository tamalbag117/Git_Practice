import java.util.Scanner;
class Sum{
    double Sum1(double []a,int s)
    {
        double sum=0;
        for (int i=0;i<s;i++)
        {
          sum=sum+a[i];
        }
        return sum;
    }
}
public class Math_StandardDeviation {
    public static void main(String[] args) {
        System.out.println("\n\n Measures of Dispersion\n\n  1. For Mean Deviation Calculator Press : 1(one)\n  2.For Standard Deviation Calculation press : 2(two)");
        System.out.println("3. For Covariance calculation press :3(three)\n4.For Mean Value calculation in Tabular From and Class Interval press:4(Four) ");
        System.out.println("5.For Normal or simple Arithmetic Mean press: 5(five)\n6.For Fitting Geometric Curve Table press: 6(six)");
        System.out.println("7.For Fitting Straight Line press :7(seven)\n8.For Fitting ParaBola press: 8(Eight)\n9.For Fitting Exponential curve press: 9 to grater than 9 any number(>9)");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number to continue....");
        int s1 = sc.nextInt();
        int s;
        Sum obj = new Sum();
        if (s1 == 1) {
            System.out.println("total number of input in mean deviation");
            s = sc.nextInt();
            double[] a = new double[s];
            double[] b = new double[s];
            System.out.println("Enter the inputs to calculate Mean Deviation ");
            for (int i = 0; i < s; i++) {
                System.out.print((i + 1) + "th Number:\t");
                a[i] = sc.nextDouble();
            }
            double v = obj.Sum1(a, s) / s;
            System.out.println(" value of mod X is:\t" + v);
            for (int i = 0; i < s; i++) {
                b[i] = Math.abs(a[i] - v);
            }
            double v1 = obj.Sum1(b, s) / s;
            System.out.println("\t\t\t Mean Deviation is:\t\t\t" + v1);
        } else if (s1 == 2) {
            System.out.println("\n\nStandard Deviation\n\n\ntotal number of input to calculate Standard deviation");
            s = sc.nextInt();
            double[] a = new double[s];
            double[] b = new double[s];
            double[] c = new double[s];
            System.out.println("Enter the inputs to calculate Standard Deviation ");
            for (int i = 0; i < s; i++) {
                System.out.print((i + 1) + "th Number:\t");
                a[i] = sc.nextDouble();
            }
            double v = obj.Sum1(a, s) / s;
            System.out.println(" value of mod X is:\t" + v);
            System.out.println(" value of mod X is:\t" + v);
            for (int i = 0; i < s; i++) {
                b[i] = (a[i] - v);
            }
            for (int i = 0; i < s; i++) {
                c[i] = Math.pow(b[i], 2);
            }
            double v1 = obj.Sum1(c, s) / s;
            System.out.println("\n\n The Standard Deviation is:\n\n\t\t s.d=" + Math.sqrt(v1));
        } else if (s1 == 3) {
            System.out.println("\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tClass interval and Mean Value calculation\n\n");
            System.out.println("Total number of class interval present in the equation:");
            s = sc.nextInt();
            double[] a = new double[s];
            double[] b = new double[s];
            double[] c = new double[s];
            double[] d = new double[s];
            double[] e = new double[s];
            double[] f = new double[s];
            double[] g = new double[s];
            double[] h = new double[s];
            System.out.println("Enter the Class Interval :one by one ");
            for (int i = 0; i < s; i++) {
                System.out.println("The value of Class interval for column no." + (i + 1));
                a[i] = sc.nextDouble();
                b[i] = sc.nextDouble();
                System.out.println("The frequency of The :" + a[i] + "-" + b[i] + " interval class is");
                f[i] = sc.nextDouble();
            }
            System.out.println("\n\nlet's find out the minvalue");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "The mid value (X)of " + a[i] + "-" + b[i] + " interval class is");
                c[i] = (b[i] + a[i]) / 2;
                System.out.println(c[i]);
            }
            double cc = c[s / 2];
            double dd = b[1] - a[1];
            System.out.println("Calculate the y for the table \t∵y=(x-c)/d\t");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "The  value y in " + a[i] + "-" + b[i] + " interval class is");
                d[i] = (c[i] - cc) / dd;
                System.out.println(d[i]);
            }
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "Fy=frequency*y in " + a[i] + "-" + b[i] + " interval class is");
                e[i] = d[i] * f[i];
                System.out.println(e[i]);
            }
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "F(y)^2=frequency*(y)^2 in " + a[i] + "-" + b[i] + " interval class is");
                g[i] = f[i] * Math.pow(d[i], 2);
                System.out.println(e[i]);
                h[i] = f[i] * c[i];
            }
            System.out.println("\n\n\nso the table is:\n\n\n");
            System.out.println("\t\t\t\t\t x\t\ty\t\tfrequency\t\tMid value\t\ty=(x"+cc+")/"+dd+"\t\tFrequency*y\t\tfrequency*y^2");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + f[i] + "\t\t" + c[i] + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t" + g[i] + "\t\t\n\n");
            }
            double aa = obj.Sum1(f, s);
            System.out.println("\n\nThe mean is:\t" + obj.Sum1(h, s) / obj.Sum1(f, s));
            double var = (obj.Sum1(g, s) / aa) - Math.pow(obj.Sum1(e, s) / aa, 2);
            System.out.println("\n\n Standard Deviation :\t\t" + Math.sqrt(var));
            System.out.println("\n\n σx(sigma x)=\t" + dd + "X" + Math.sqrt(var) + "\t=\t" + dd * Math.sqrt(var));
            System.out.println("\n\nnow Let's calculate covariance!\n\n covariance(C.V)=\t" +100* (dd * Math.sqrt(var)) / (obj.Sum1(h, s) / obj.Sum1(f, s)));
        } else if (s1 == 4) {
            System.out.println("\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tClass interval and Mean Value calculation\n\n");

            System.out.println("Total number of class interval present in the equation:");
            s = sc.nextInt();
            double[] a = new double[s];
            double[] b = new double[s];
            double[] c = new double[s];
            double[] d = new double[s];
            double[] e = new double[s];
            double[] f = new double[s];
            System.out.println("Enter the Class Interval :one by one ");
            for (int i = 0; i < s; i++) {
                System.out.println("The value of Class interval for column no." + (i + 1));
                a[i] = sc.nextDouble();
                b[i] = sc.nextDouble();
                System.out.println("The frequency of The :" + a[i] + "-" + b[i] + " interval class is");
                f[i] = sc.nextDouble();
            }
            System.out.println("\n\nlet's find out the minvalue");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "The mid value (X)of " + a[i] + "-" + b[i] + " interval class is");
                c[i] = (b[i] + a[i]) / 2;
                System.out.println(c[i]);
            }
            double cc = c[s / 2];
            double dd = b[1] - a[1];
            System.out.println("Calculate the y for the table \t∵y=(x-c)/d\t");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "The  value y in " + a[i] + "-" + b[i] + " interval class is");
                d[i] = (c[i] - cc) / dd;
                System.out.println(d[i]);
            }
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "Fy=frequency*y in " + a[i] + "-" + b[i] + " interval class is");
                e[i] = d[i] * f[i];
                System.out.println(e[i]);
            }
            System.out.println("\n\n\nso the table is:\n\n\n");
            System.out.println("\t\t\tclass interval\t\t\tfrequency\t\tmid value\t\ty\t\tfrequency*y\t\t");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + f[i] + "\t\t" + c[i] + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t\t\n\n");
            }
            System.out.println("\n\nsum of frequency is ∑f=\t" + obj.Sum1(f, s));
            System.out.println("\n\nsum of x is frequency*y=\t∑Fy=\t" + obj.Sum1(e, s));
            System.out.println("\n\ncalculation\n\n x bar =" + cc + "\t+" + dd + "*y bar");
            System.out.println("the value of y bar is:" + obj.Sum1(e, s) / obj.Sum1(f, s));
            System.out.println("x bar=" + cc + "+\t" + dd + "(" + obj.Sum1(e, s) / obj.Sum1(f, s) + ")");
            double x = cc + dd * obj.Sum1(e, s) / obj.Sum1(f, s);
            System.out.println("\n\n The answer is:\n\t\t\t" + x);
        } else if (s1 == 5) {
            System.out.println("\n\nTotal number of class  present in the Arithmetic Mean equation:");
            s = sc.nextInt();
            double[] a = new double[s];
            double[] b = new double[s];
            double[] f = new double[s];
            for (int i = 0; i < s; i++) {
                System.out.println("The  input value for Class  for column no." + (i + 1));
                a[i] = sc.nextDouble();
                System.out.println("The frequency of The :" + a[i] + " interval class is");
                f[i] = sc.nextDouble();
            }
            System.out.println("\n\n\n\t\t\t X \t\t\t\tfrequency");
            for (int i = 0; i < s; i++) {
                System.out.println("\t\t\t" + a[i] + "\t\t\t" + f[i]);
            }
            for (int i = 0; i < s; i++) {
                b[i] = a[i] * f[i];
            }
            System.out.println("N=∑Fi=\t" + obj.Sum1(f, s));
            System.out.println("The Arithmetic Mean is:  X bar=\t" + obj.Sum1(b, s) / obj.Sum1(f, s));
        } else if (s1 == 6) {
            System.out.println("\n\n\n\t\t\tFitting Geometric Curve Table\n\n\n");
            System.out.println("Total number of x and y present in the equation:");
            s=sc.nextInt();
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
                d[i]=Math.log10(a[i]);
                c[i]=Math.log10(b[i]);
                e[i]=Math.pow(d[i],2);
                f[i]=d[i]*Math.log10(b[i]);
            }
            System.out.println("\n\n\nso the table is:\n\n\n");
            System.out.println("\t\t\tx\t\ty\t\tlog x\t\tlog y\t\t(log x)^2\t\tlog x *log y\t\t");
            for (int i = 0; i < s; i++) {
                System.out.print("\n\tcolumn no."+(i+1)+"\t\t"+a[i]+"\t\t"+b[i]+"\t\t"+Math.log10(a[i])+"\t\t"+Math.log10(b[i])+"\t\t"+Math.pow(d[i],2)+"\t\t"+d[i]*Math.log10(b[i])+"\t\t\n\n");
            }
            System.out.println("The value of log y in column");
            System.out.println("\n\nsum of x is ∑x=\t"+obj.Sum1(a,s));
            System.out.println("\n\nsum of y is ∑y=\t"+obj.Sum1(b,s));
            System.out.println("\n\nsum of X=log x is ∑X=\t"+obj.Sum1(d,s));
            System.out.println("\n\nsum of Y=log y is ∑Y=\t"+obj.Sum1(c,s));
            System.out.println("\n\nsum of X^2=(log x)^2 is ∑X^2=\t"+obj.Sum1(e,s));
            System.out.println("\n\nsum of XY is :\t"+obj.Sum1(f,s));
        }
        else if(s1==7){
            System.out.println("\n\n\n\t\t\tFitting Straight Line Table\n\n\n");
            System.out.println("Total number of x and y present in the equation:");
            s=sc.nextInt();
            double[]a=new double[s];
            double[]b=new double[s];
            double[]c=new double[s];
            double[]d=new double[s];
            System.out.println("\n\nValues of x and y  in the given equation is:");
            for(int i=0;i<s;i++)
            {
                System.out.println("The value of x for column no."+(i+1));
                a[i]= sc.nextDouble();
                System.out.println(" the value of y for column no."+(i+1));
                b[i]=sc.nextDouble();
            }
            for(int i=0;i<s;i++)
            {
                c[i]=Math.pow(a[i],2);
                d[i]=a[i]*b[i];
            }
            System.out.println("\n\n\nso the table is:\n\n\n");
            System.out.println("\t\t\t\tx\t\ty\t\tx^2\t\tx*y\t\t");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i] + "\t\t\n\n");
            }
            System.out.println("\n\nsum of x is ∑x=\t"+obj.Sum1(a,s));
            System.out.println("\n\nsum of y is ∑y=\t"+obj.Sum1(b,s));
            System.out.println("\n\nsum of X=log x is ∑X^2=\t"+obj.Sum1(c,s));
            System.out.println("\n\nsum of Y=log y is ∑Y=\t"+obj.Sum1(d,s));
        }
        else if(s1==8)
        {
            System.out.println("\n\n\n\t\t\tFitting ParaBola\n\n\n");
            System.out.println("Total number of x and y present in the equation:");
            s=sc.nextInt();
            double[]a=new double[s];
            double[]b=new double[s];
            double[]c=new double[s];
            double[]d=new double[s];
            double[]e=new double[s];
            double[]f=new double[s];
            double[]g=new double[s];
            System.out.println("\n\nValues of x and y  in the given equation is:");
            for(int i=0;i<s;i++)
            {
                System.out.println("The value of x for column no."+(i+1));
                a[i]= sc.nextDouble();
                System.out.println(" the value of y for column no."+(i+1));
                b[i]=sc.nextDouble();
            }
            for(int i=0;i<s;i++)
            {
                c[i]=Math.pow(a[i],2);
                d[i]=Math.pow(a[i],3);
                e[i]=Math.pow(a[i],4);
                f[i]=a[i]*b[i];
                g[i]=Math.pow(a[i],2)*b[i];
            }
            System.out.println("\n\n\nso the table is:\n\n\n");
            System.out.println("\t\t\tx\t\ty\t\tx^2\t\tx^3\t\tx^4\t\tx*y\t\tx^2*y\t\t");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t"+f[i]+"\t\t"+g[i]+"\t\t\n\n");
            }
            System.out.println("\n\nsum of x is ∑x=\t"+obj.Sum1(a,s));
            System.out.println("\n\nsum of y is ∑y=\t"+obj.Sum1(b,s));
            System.out.println("\n\nsum of  ∑X^2=\t"+obj.Sum1(c,s));
            System.out.println("\n\nsum of  ∑X^3=\t"+obj.Sum1(d,s));
            System.out.println("\n\nsum of  ∑X^4=\t"+obj.Sum1(e,s));
            System.out.println("\n\nsum of  ∑X*Y=\t"+obj.Sum1(f,s));
            System.out.println("\n\nsum of  ∑(X^2)*Y=\t"+obj.Sum1(g,s));
        }
        else{
            System.out.println("\n\n\n\t\t\tFitting Exponential curve\n\n\n");
            System.out.println("Total number of x and y present in the equation:");
            s=sc.nextInt();
            double[]a=new double[s];
            double[]b=new double[s];
            double[]c=new double[s];
            double[]d=new double[s];
            double[]e=new double[s];
            System.out.println("\n\nValues of x and y  in the given equation is:");
            for(int i=0;i<s;i++)
            {
                System.out.println("The value of x for column no."+(i+1));
                a[i]= sc.nextDouble();
                System.out.println(" the value of y for column no."+(i+1));
                b[i]=sc.nextDouble();
            }
            for(int i=0;i<s;i++)
            {
                c[i]=Math.log10(b[i]);
                d[i]=Math.pow(a[i],2);
                e[i]=Math.log10(b[i])*a[i];
            }
            System.out.println("\n\n\nso the table is:\n\n\n");
            System.out.println("\t\t\tx\t\ty\t\tlog y\t\tx^2\t\tx*y");
            for (int i = 0; i < s; i++) {
                System.out.println(" in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t\t\n\n");
            }
            System.out.println("\n\nsum of x is ∑x=\t"+obj.Sum1(a,s));
            System.out.println("\n\nsum of y is ∑y=\t"+obj.Sum1(b,s));
            System.out.println("\n\nsum of  ∑Y=log y=\t"+obj.Sum1(c,s));
            System.out.println("\n\nsum of  ∑(X)^2=\t"+obj.Sum1(d,s));
            System.out.println("\n\nsum of  ∑X*log y=\t"+obj.Sum1(e,s));
        }
        System.out.println("\n\n\n\n\n\t\t\t\tThank You\t\t\t\t\n\n\n");
        }
    }

