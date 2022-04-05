import java.util.SortedMap;
import java.util.TreeMap;

public class Latihan8 {
    public static void main(String[] args){
        TreeMap<String,TreeMap<String,String>>pulau = new TreeMap<>();
        TreeMap<String,String>provinsi = new TreeMap<>();

        pulau.put("Sumatera", new TreeMap<String, String>());
        TreeMap<String, String> sumatera = pulau.get("Sumatera");
        sumatera.put("NAD ", " Banda Aceh");
        sumatera.put("Sumatera Utara "," Medan" );
        sumatera.put("Riau "," Pekan Baru");
        sumatera.put("Sumatera Barat "," Padang");
        sumatera.put("Kepulauan Riau "," Tanjung Pinang");
        sumatera.put("Lampung "," Bandar Lampung");
        sumatera.put("Bengkulu "," Bengkulu");
        System.out.println("Ibukota provinsi di Sumatera : ");
        System.out.println(toStringWrapper(pulau.get("Sumatera")));

        pulau.put("Jawa", new TreeMap<String, String>());
        TreeMap<String,String>jawa = pulau.get("Jawa");
        jawa.put("Banten "," Serang");
        jawa.put("DKI Jakarta "," Jakarta");
        jawa.put("Jawa Timur "," Surabaya");
        jawa.put("Jawa Tengah "," Semarang");
        jawa.put("DI Yogyakarta "," Yogyakarta");
        System.out.println("\nIbukota provinsi di Jawa : ");
        System.out.println(toStringWrapper(pulau.get("Jawa")));

        pulau.put("Sulawesi", new TreeMap<String,String>());
        TreeMap<String,String>sulawesi = pulau.get("Sulawesi");
        sulawesi.put("Gorontalo "," Gorontalo");
        sulawesi.put("Sulawesi Utara "," Manado");
        sulawesi.put("Sulawesi Tengah "," Palu");
        sulawesi.put("Sulawesi Barat "," Kota Mamuju");
        sulawesi.put("Sulawesi Tenggara "," Kendari");
        sulawesi.put("Sulawesi Selatan "," Makassar");
        System.out.println("\nIbukota provinsi yang berawalan S : ");
        for (TreeMap<String ,String> a:pulau.values()){
            SortedMap<String ,String> b = a.tailMap("S");
            System.out.println(b.size()<=0?(" "):toStringWrapper(b));
        }
    }

    private static String toStringWrapper(Object objek) {
        return (objek.toString().replace("{",
                "\t").replace("}",
                " ").replace(",",
                "\n\t").replace(" = ",
                " = "));
    }
}