import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class latihan4 {
  public static void main(String[] args) {
    SortedSet<String> s =  new TreeSet<String>();
      for (String a : args)
      if (!s.add(a))
      System.out.println("Duplicate detected: " + a);
      System.out.println(s.size() + " distinct words: " + s); 
  }

  
  class Mahasiswa implements Comparator<String>{
    //@Override
      public int compare(String s1, String s2) {
          return s1.compareToIgnoreCase(s2);
      }
  }
}