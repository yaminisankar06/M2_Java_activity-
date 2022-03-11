import java.util.*;
public class Main {
    public static void main(String[] args) {
        int firstIndex, secondIndex;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> intList = new ArrayList<>();


            intList.add("Sunrisers Hydrabad");
            intList.add("Delhi Capitals");
            intList.add("Royal Challengers Bangalore");
            intList.add("Kolkata Knight Riders");
            intList.add("Mumbai Indians");

        System.out.println("Enter the first index :");
        firstIndex = sc.nextInt();

        System.out.println("Enter the second index :");
        secondIndex = sc.nextInt();

        System.out.println("Before Swap :");
        System.out.println("\n");
        for (int i = 0; i <intList.size(); i++) 
        {
        System.out.println(intList.get(i));
        }

        Collections.swap(intList, firstIndex, secondIndex);
        
        System.out.println("\n");
        System.out.println("After Swap :"); 
        System.out.println("\n");
        for (int i = 0; i <intList.size(); i++) 
        {
        System.out.println(intList.get(i));
        }
    }
}

