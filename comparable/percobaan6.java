import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings("unchecked")
public class percobaan6 {

 public static void main(String[] args) {

 //create an ArrayList object
 ArrayList arrayList = new ArrayList();

 //Add elements to Arraylist
 arrayList.add("A");
 arrayList.add("B");
 arrayList.add("C");
 arrayList.add("D");
 arrayList.add("E");
 Comparator comparator = Collections.reverseOrder(); 

 System.out.println("Before sorting ArrayList in descending order : " + arrayList);

 Collections.sort(arrayList,comparator);
 System.out.println("After sorting ArrayList in descending order : " + arrayList);
 }
} 
