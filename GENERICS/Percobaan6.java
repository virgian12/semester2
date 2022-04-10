import java.util.HashMap; //menambahkan fungsi ini agar HashMap dapat running

public class Percobaan6 { 
    public static void main(String args[]) { 
        
        HashMap<String,Integer> hm = new HashMap<String,Integer>(); 
        hm.put("apel", 20); 
        hm.put("anggur", 13); 
        hm.put("jeruk", 5); 
        System.out.println(hm); // memakai system.out.println(hm) untuk menampilkan generic tersebut
        
    } 
} 