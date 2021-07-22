import java.util.Scanner;
class Test{
    void sum(float a,float b,float c)
    {
       float sum=(a*10+b*12+c*21);
       System.out.println("THE sum is:"+sum);
    }
    int fact(float a){
        int b=(int)a;
      if(b==0||b==1)
        {
            return 1;
        }
        else{
            return b*fact(b-1);
        }
    }
}
public class PracticeMethods {
    int honey(float c,float d){
        int e=(int)((c+d)%2);
        System.out.println(e);
        System.out.println("Total honey is:"+e);
        return e;
    }
    float jock(float x,float y,float z)
    {
        float c;
        if(x>y&&x>z)
        {
            c=x+y+z;
        }
         else if(x>y&&x<z)
        {
            c=x+y-z;
        }
         else if (y>x&&y>z)
        {
            c=x*y*z;
        }
         else if(y>x&&y<z)
        {
            c=x*y+z;
        }
         else if(z>x&&z>y)
        {
            c=x/y*z;
        }
         else if(z>x&&z<y)
        {
            c=x*y%z;
        }
         else
        {
            c=x%y+z;
        }
         System.out.println("The result is:\t\t"+c);
         return c;
    }
    //constructors
    static class Abs
    {
        public Abs()
        {
            System.out.println("hi!");
        }
        public Abs(int k)
        {
            System.out.println("hi\t no "+k+"folks");
        }
        public Abs(int k,double l)
        {
            System.out.println(k+"   "+l);
        }
    }
    static class Bcd{
        Bcd(int k){
           System.out.println(k*k*k);
        }
    }
    static class Employ{
        int num;
        float b;
        String name;
        short c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           System.out.println("The first number is:");
           float a=sc.nextFloat();
           System.out.println("The second number is:");
           float b= sc.nextFloat();
           System.out.println("The third number is:");
           float c= sc.nextFloat();
           PracticeMethods obj= new PracticeMethods();
           obj.jock(a,b,c);
           obj.honey(b,c);
           Test obj1=new Test();
           obj1.sum(a,b,c);
           System.out.println("The factorial of number :"+a+"is:\t"+obj1.fact(a));
           System.out.println("The factorial of number :"+b +"is\t"+obj1.fact(b));
           System.out.println("The factorial of number:"+c+"is\t"+obj1.fact(c));
           Abs obj2= new Abs();
           Abs obj3=new Abs(2);
           Abs obj4=new Abs(4,5.5);
           Bcd obj5=new Bcd(5);
           Employ id=new Employ();
           id.num=6;
           id.name= "Ishita";
           id.b=89.56f;
           System.out.println(id.b);
           System.out.println(id.name);
           System.out.println(id.num);
           id.c=sc.nextShort();
           System.out.println(id.c);

    }
}
