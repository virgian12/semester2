import java.util.*;
public class example {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.print("Elemen pada HashSet : ");
        System.out.println(set);
        TreeSet<String> sortSet=new TreeSet<String>(set);
        System.out.print("Elemen pada TreeSet : ");
       System.out.println(sortSet);
    }
}

