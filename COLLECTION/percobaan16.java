import java.util.HashMap;

@SuppressWarnings("unchecked")
public class percobaan16 {
  public static void main(String[] args) {
    //create HashMap object
    HashMap hMap = new HashMap<>();

    //add key value pairs to HashMap
    hMap.put("1", "One");
    hMap.put("2", "Two");
    hMap.put("3", "Three");

    boolean blnExist = hMap.containsValue("Two");

    System.out.println("Two exists in HashMap ? : " + blnExist);

  }
}
