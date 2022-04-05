import java.util.HashSet; //untuk  memanggil method HashSet (mengurutkan)
import java.util.Set; // 
public class FindsDups2 {
    public static void main (String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();

        for (String a : args)
        if (!uniques.add(a))
        dups.add(a);

        // Destructive set=difference
        uniques.removeAll(dups);

        System.out.println("Unique words: java FindDups i came i saw i left" + uniques);
        System.out.println("Duplicate words: java FindsDups i came i saw i left" + dups);
    }
}
