import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class percobaan14{
  public static void main(String[] args) {
    //create HashMap object
    HashMap hMap = new HashMap<>();

    //add key value pairs to HashMap
    hMap.put("1","One");
    hMap.put("2","Two");
    hMap.put("3","Three");
    Collection c = hMap.values();
    //obtain an Iterator for Collection
    Iterator itr = c.iterator();

    //iterate through HashMap values iterator
    while(itr.hasNext())
    System.out.println(itr.next());
  }
}