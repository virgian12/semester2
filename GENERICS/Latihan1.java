import java.util.*;

 interface UnaryPredicate<T> { 
 public boolean test(T obj); 
} 
class PrimePredicate implements UnaryPredicate<Integer> { 
 public boolean test(Integer i) { 
        //program hitung bilangan prima di colection
    int a; 
        int count=0;
        for (a=1; a<=i; a++) 
            {
                if (i%a==0)
                {
                    count = count+1;
                }
            }
                if (count==2)
                {
                return true;
                } else
                    return false;
                // end program hitung bilangn prima di collection
    } 
}
final class Algorithm { 
public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) { 
 int count = 0; 
 for (T elem : c) 
 if (p.test(elem)) 
 ++count; 
 return count; 
 } 
} 

public class Latihan1 { 
 public static void main(String[] args) { 
 Collection<Integer> ci = Arrays.asList(3,5,7,9,12,15,19); 
 int count = Algorithm.countIf(ci, new PrimePredicate()); 
 System.out.println("Terdapat  bilangan prima = " + count); 
 } 
} 