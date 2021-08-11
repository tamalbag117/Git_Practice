/*The game of billiards involves two players knocking 3 balls around on a green baize table.
Well, there is more to it, but for our purposes this is sufficient.
The game consists of several rounds and in each round both players obtain a score,
based on how well they played. Once all the rounds have been played,
the total score of each player is determined by adding up the scores in all the rounds
and the player with the higher total score is declared the winner.
The Siruseri Sports Club organises an annual billiards game 
where the top two players of Siruseri play against each other.
The Manager of Siruseri Sports Club decided to add his own twist
to the game by changing the rules for determining the winner. 
In his version, at the end of each round, 
the cumulative score for each player is calculated,
and the leader and her current lead are found.
Once all the rounds are over the player 
who had the maximum lead at the end of any round in
the game is declared the winner.*/

import java.util.ArrayList;
import java.util.Scanner;

public class TheLeadingGame {
    public static void main(String[] args)throws java.lang.Exception {
      try {
          Scanner sc =new Scanner(System.in);
          int T=sc.nextInt();
          ArrayList<Integer>sum=new ArrayList<Integer>(T);
          ArrayList<Integer>s=new ArrayList<Integer>(T);
          for (int i = 0; i < T; i++) {
          int s1=sc.nextInt();
          int s2=sc.nextInt();
          sum.add(i,(s1-s2));
          s.add(i,(int)Math.abs(sum.get(i)));
          }
          //Find largest number;
          int max = s.get(0);
          int index = 0;
          for (int i = 0; i <T; i++) 
          {
            if (max < s.get(i)) 
            {
              max = s.get(i);
              index = i;
            }
          }
          if (sum.get(index)>0) {
              System.out.println("1 "+s.get(index));
          } else {
              System.out.println("2 "+s.get(index));
          }
          sc.close();
      } catch (Exception e) {
          return;
      }  
    }
}
