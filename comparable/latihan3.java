import java.util.*;

class comperable implements Comparable<comperable> {
    public String buah;
    int stock;
    public comperable(String buah, int stock) {
        this.buah=buah;
        this.stock=stock;
    }
    public String getbuah() {
        return buah;
    }
    public void setNama(String buah) {
        this.buah=buah;
    }
    public int getstock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock=stock;
    }
    public String toString() {
        return("Buah : " + buah + "\t Stock : " + stock + "kg\n");
    }
    @Override
    public int compareTo(comperable k) {
        return this.buah.compareTo(k.getbuah());
    }
}

public class latihan3 {
    public static void main(String[] args) {
    List <comperable> penjual = new ArrayList<comperable>();
    penjual.add(new comperable ("Apel", 25));
    penjual.add(new comperable ("Pisang", 30));
    penjual.add(new comperable ("Semangka", 15));
    penjual.add(new comperable ("Kurma", 10));
    List <comperable> pembeli = new ArrayList<comperable>();
    pembeli.add(new comperable ("Apel", 10));
    pembeli.add(new comperable ("Pisang", 20));
    pembeli.add(new comperable ("Semangka", 5)); 

    System.out.println("Sebelum di urutkan penjual");
    System.out.println("data \n" + penjual);
    System.out.println("Setelah di urutkan penjual");
    Collections.sort(penjual);
    System.out.println("data \n" + penjual);
    System.out.println("Sebelum di urutkan pembeli");;
    System.out.println("data \n" + pembeli);
    System.out.println("Sebelum di urutkan penjual");
    Collections.sort(pembeli);
    System.out.println("data \n" + pembeli);
    }
}