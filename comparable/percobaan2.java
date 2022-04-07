import java.util.ArrayList;
import java.util.Collections;

//Sortlist
@SuppressWarnings("unchecked")
public class percobaan2 {
 public static void main(String args[]){
 ArrayList insects = new ArrayList();
 insects.add("mosquito");
 insects.add("butterfly");
 insects.add("dragonfly");
 insects.add("fly");

 System.out.println("\nSEBELUM DISORTING");
 int size = insects.size();
 for (int i = 0; i < size; i++) {
 System.out.println("insect " + i + " : " + (String)
insects.get(i));
 }
 Collections.sort(insects); 
 
 System.out.println("\nSETELAH DISORTING");
 for (int i = 0; i < size; i++) {
 System.out.println("insect " + i + " : " + (String)
insects.get(i));
 }
 }
} 
