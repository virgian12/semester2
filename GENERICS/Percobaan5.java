import java.util.ArrayList; // menambahakan fungsi tersebut agar array berjalan
import java.util.Iterator; // menambhakan fungsi tersebut untuk menyambungkan ke iterator

public class Percobaan5 { 
    public static void main(String[] args) { 
        ArrayList<String> data = new ArrayList<String>(); 
        data.add("hello"); 
        data.add("goodbye"); 
 
    // data.add(new Date()); This won't compile! 
    
    Iterator<String> it = data.iterator();  
    while (it.hasNext()) { 
        String s = it.next(); 
        System.out.println(s); 
        } 
    }
}