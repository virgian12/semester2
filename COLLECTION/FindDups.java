import java.util.*; // ditambah dengan library ini agar jalan
public class FindDups {
    public static void main (String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
        if (!s.add(a))
        System.out.println("Duplicate detected: java FindDups i came i saw i left" + a);

        System.out.println(s.size() + " distinct words: " + s); // ditambah kalimat java FindDups i came i saw i left
    }
} 