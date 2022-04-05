import java.util.TreeMap;
import java.util.SortedMap;

@SuppressWarnings("unchecked")
public class percobaan21 {
  public static void main(String[] args) {
    //Create treeMap object
    TreeMap treeMap = new TreeMap<>();

    //add key value pairs to TreeMap
    treeMap.put("1","One");
    treeMap.put("2","Two");
    treeMap.put("3","Three");
    treeMap.put("5","Five");
    treeMap.put("4","Four");

    SortedMap sortedMap = treeMap.subMap("2", "S");
    System.out.println("SortedMap Contains : " + sortedMap);
  }
}
