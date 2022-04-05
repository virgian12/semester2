import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class percobaan18 {
  public static void main(String[] args) {
      HashMap hMap = new HashMap();

      hMap.put("1","One");
      hMap.put("2","Two");
      hMap.put("3","Three");

      Hashtable ht = new Hashtable<>();

      ht.put("1","This value would be REPLACED!!");
      ht.put("4", "Four");

      System.out.println("Hashtable contents before copy");
      Enumeration e = ht.elements();
      while(e.hasMoreElements())
      System.out.println(e.nextElement());

      ht.putAll(hMap);

      System.out.println("Hashtable contents after copy");
      e=ht.elements();
      while(e.hasMoreElements())
      System.out.println(e.nextElement());
    }
}
