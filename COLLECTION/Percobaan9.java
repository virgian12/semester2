import java.util.ArrayList;
import java.util.Collections;
import java.util. Vector;

public class Percobaan9 {
    public static void main (String[] args) {
       
        // create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String> ();

        // Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("2");
        arrayList.add("5");
        arrayList.add("3");

        //create a Vector object
        Vector<String> v = new Vector<String> ();

        // Add elements to Vector 
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("F");
        v.add("G");
        v.add("H");

        System.out.println("Before copy, Vector Contains : " + v);

        //copy all elements of ArrayList to Vector using copy method of Collections class

        Collections.copy(v,arrayList);

        System.out.println("After Copy, Vector Contains : " + v);
    }
}