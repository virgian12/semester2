import java.util.SortedMap;
import java.util.TreeMap;

@SuppressWarnings("unchecked")
public class percobaan22 {
  public static void main(String[] args) {
    //create TreeMap object
    TreeMap treeMap = new TreeMap<>();

    //add key value pairs to TreeMap
    treeMap.put("1", "One");
    treeMap.put("3", "Three");
    treeMap.put("2", "Two");
    treeMap.put("5", "Five");
    treeMap.put("4", "Four");

    SortedMap sortedMap=treeMap.headMap("3");
    System.out.println("Head Map Contains : " + sortedMap);
  }
}
