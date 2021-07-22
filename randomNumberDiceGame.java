import java.lang.Math;
public class randomNumberDiceGame {
    public static void main(String[] args) {
        System.out.println(" let's make \n\tgame of Dice!");
        int min = 0;
        int max = 6;
        System.out.println("Random value  between " + min + " to " + max + ":");
        System.out.println(" let's make \n\tgame of Dice!");
        System.out.println("let's generate the Random number");
        //way one
        for (int i = 1; i <= 30; i++) {
            double a = Math.random() * (max - min + 1) + min;
            System.out.println("the" + i + "st number is:\t\t" + (int) a);
        }
        //way two
        System.out.println("Random number using Typecasting");
        for (int i = 1; i <= 30; i++) {
            int b = (int) Math.random() * (max - min + 1) + min;
            System.out.println(b);
        }
    }

}
