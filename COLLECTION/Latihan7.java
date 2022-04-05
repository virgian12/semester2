import java.util.*;

public class Latihan7 {
    public static void main(String[] args) {
        String benda;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("masukan benda : ");
            benda = input.nextLine();
        }
        System.out.println("hasil : ");
        TreeMap<String,Integer>jumlah= new TreeMap<>();
        for(String benda1:benda.split(" ")){
            if(jumlah.containsKey(benda1)){
                jumlah.put (benda1,jumlah.get(benda1).intValue()+1);
            }
            else{
                jumlah.put(benda1,1);
            }
        }
        class latihan7Comparator implements Comparator<Map.Entry<String,Integer>>{
            public int compare(Map.Entry<String, Integer>aa,Map.Entry<String,Integer>bb){
                return aa.getValue().compareTo(bb.getValue());
            }
        }
        System.out.println("Nilai terendah : " + Collections.min(jumlah.entrySet(),new latihan7Comparator()));
        System.out.println("Nilai tertinggi : " + Collections.max(jumlah.entrySet(),new latihan7Comparator()));
        System.out.println("Dengan awalan m : " + jumlah.tailMap("m"));
    }
}