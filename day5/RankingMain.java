import java.util.*;
import java.util.Scanner.*;

class Player implements Comparable {
    String name;
    int score;
    Player(String name, int age) {
       this.name = name;
       this.score = score;
    }
    @Override
    public int compareTo(Object o) {
       return this.score - ((Player) o).score;
    }
 }

public class RankingMain {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        List<String> str_list = new ArrayList<String>(); 
        List<Integer> score_list = new ArrayList<Integer>();

        System.out.println("Please provide number of players : "); 
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        System.out.println("Enter name of player "+ i +" : ");
        String name=sc.next();
        str_list.add(name); 
        System.out.println("Enter score of player "+ i +" : ");
        int score=sc.nextInt();
        score_list.add(score);
        }

        Collections.sort(str_list);  //collection sort
        Collections.sort(score_list);

        for (int i=1;i<=n;i++) 
        {
        System.out.println(i+" "+str_list.get(i)+" "+score_list.get(i));
        }
    }
}
