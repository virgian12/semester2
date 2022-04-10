import java.util.ArrayList;
import java.util.*;

@SuppressWarnings("unchecked")

public class Percobaan7 { 
    public static void main(String args[]) { 
        ArrayList<String> data = new ArrayList<String>();    
        Gen<String> gen1 = new Gen("abc"); 
        Gen<String> gen2 = new Gen("abc"); // <Object> diganti <String> karena Gen<String> tidak bisa diconverted menjadi Gen<Object>
        
        gen2 = gen1 ; //error pada saat dikompile
        
        System.out.println(gen1());
        System.out.println(gen2());
    } 
} 