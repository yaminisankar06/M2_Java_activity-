import java.util.Scanner;

public class Cricket
{
    public static void main(String arg[])
    {
      for(int a=0;a<2;i++)
      {
      CricketData D[]=new CricketData[20];
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the team name ");
      String tename=sc.nextLine();
      System.out.println("Enter session ");
      String aname=sc.nextLine();
      System.out.println("Enter runs ");
      int r=sc.nextInt();
      D[a]=new CricketData(tename,aname,r);
      
      
      if(aname.equals("first"))
      { 
        System.out.println("Name: " +D[a].teamname);
        System.out.println("Scored: "+D[a].runs);
        r=r+1;
        System.out.println("need "+ r +" to win");
      }
      else{
        System.out.println("Name: "+D[a].teamname);
        System.out.println("Scored: "+D[a].runs);
        System.out.println("match ended");
      }
    
    }
  }
}