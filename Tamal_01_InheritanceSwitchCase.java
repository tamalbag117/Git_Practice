import java.util.Scanner;
public class Tamal_01_InheritanceSwitchCase {
    public static void main(String[] args) {
        System.out.println("inheritance switch case in java!");
        Scanner cc=new Scanner(System.in);
        System.out.print(" Rajopriyo :who's term it is?");
        System.out.print("oh!it's you:");
        String var= cc.nextLine();
        switch (var){
            case "Anirban"->System.out.println("welcome back!\n Sujoy Da ");
            case "Rangan"->System.out.println("hey Nibba whats app!\n sleep well");
            case "Chirantan"->System.out.println("whatsapp bro? \n watched Lucifer session 5?");
            case "Miko"->System.out.println("hi soumik.\n want to eat some honey?");
            case "Basudha"->System.out.println("oho Basudha Das here \n Pritwish grab her!\n it's an order");
            default ->System.out.println("Welcome back! Be_naughty miss you :))");
        }

    }
}
