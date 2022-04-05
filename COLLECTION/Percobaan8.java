import java.util.*;

public class Percobaan8 {
public static void main(String[] args) {

    // create a Vector object
    Vector<String> v = new Vector<String> ();

    // add elements to Vector
    v.add("A");
    v.add("B");
    v.add("C");
    v.add("D");
    v.add("E");
    v.add("F");
    System.out.println(" Vector contains : " + v);

    // Get Enumeration over Vector
    Enumeration<String> e = v.elements();
    // Create ArrayList from Enumeration of Vector
    ArrayList aList = Collections.list(e);
    System.out.println("Arraylist contains : " + aList);
    }
}