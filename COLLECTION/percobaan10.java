import java.util.ArrayList;
import java.util.Vector;
import java.util.*;

//Note: Recompile with -Xlint:unchecked for details.
@SuppressWarnings("unchecked")
public class percobaan10 {
  public static void main(String[] args) {
    //create an ArrayList object
    ArrayList arrayList = new ArrayList();

    //Add elements to Arraylist
    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("3");

    //create a new Vector object
    Vector v = new Vector<String>();
    v.add("4");
    v.add("5");

    //append all elements of Vectors to ArraysList
    arrayList.addAll(v);

    //display elements of ArrayList

    System.out.println("After appending all elements of Vector, ArrayList contains..");

    for (int i= 0; i< arrayList.size(); i++){
      System.out.println(arrayList.get(i));
    }
  }  
}
