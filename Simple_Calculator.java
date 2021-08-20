/*here we are going to make a basic calculator problem that can solve 
     basci arithmatic operation like : *, -,+,% , / */

import java.util.*;
class Simple_Calculator{
  public static void main(String[] args) {
    try{
      Scanner sc = new Scanner(System.in);
      while(true){
        System.out.print("Enter operation Type :");
      String c =sc.next();
        System.out.print("Enter Number one :");
      double a =sc.nextInt();
        System.out.print("Enter Number two :");
        double b=sc.nextInt();
        if(c=="+")
          System.out.println("Ans :"+(a+b));
        else if(c=="-")
           System.out.println("Ans :"+(a-b));  
        else if(c=="*")
            System.out.println("Ans :"+(a*b));
        else if(c=="%")
            System.out.println("Ans :"+(a%b));
        else if(c=="/")
            System.out.println("Ans :"+(a/b));
        else
        {
          System.out.println("Wrong input");
          System.exit(0);
        }
      }
      sc.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
