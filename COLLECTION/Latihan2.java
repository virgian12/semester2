import java.util.*;

public class Latihan2 {
    public static void main(String[] args){
        // create an array list

        ArrayList<String> lis=new ArrayList<String>();
        // add elements to the array list
        lis.add("dian");
        lis.add("dani");
        lis.add("lusi");
        lis.add("dinda");
        lis.add("lia");
        lis.add("rahma");
        // use iterator to display contents of lis
        System.out.println("Original contents of lis: " + lis);
        Collections.reverse(lis);
        System.out.println("Reverse Content : " + lis);
        Collections.shuffle(lis);
       System.out.println("Random Content : " + lis);
        Collections.sort(lis);
        System.out.println("Order Content : " + lis);
    }
}