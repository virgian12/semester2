import java.util.*;
public class Percobaan3 {
    public static void main(String[] args) {
        HashSet<String> s1=new HashSet<String>();
        s1.add("Australia");
        s1.add("Sweden");
        s1.add("Germany");

        HashSet<String> s2=new HashSet<String>();
        s2.add("Sweden");
        s2.add("France");

        TreeSet<String> union=new TreeSet<String>(s1);
        union.addAll(s2); // gabungan dari s1 dan s2
        print("Union", union);
       
        TreeSet<String> intersect=new TreeSet<String>(s1);
        intersect.retainAll(s2); //irisan dari s1 dan s2 
        print("Intersection", intersect);
    }
    protected static void print(String label, Collection c){
        System.out.println("-------------"+ label +"------------");
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


 