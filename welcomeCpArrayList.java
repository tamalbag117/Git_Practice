import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class welcomeCpArrayList {
    public static void main(String[] args) {
       try {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        ArrayList<Integer>N=new ArrayList<Integer>(T);
        for (int i = 0; i <T; i++) {
            N.add(sc.nextInt());
          }
          sc.close();
          for (int i =0; i<T; i++) {
            int sum=0;
            int temp=N.get(i);
         while (N.get(i)!=0) {
          sum=sum+N.get(i)%10; 
          temp/=N.get(i)/10;
         }  
         System.out.println(sum); 
        }
       } catch (Exception e) {
         return;
       }
    }
}
