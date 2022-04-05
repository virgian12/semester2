import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
class Latihan4 {

    public static void main(String[] args) {
        List color = new ArrayList();
        color.add("Magenta");
        color.add("Red");
        color.add("White");
        color.add("Blue");
        color.add("Cyan");

        List removed = new ArrayList();
        removed.add("Red");
        removed.add("White");
        removed.add("Blue");
        System.out.println("Warna : " + color);
        System.out.println("Warna Dihapus : " + removed);
        color.removeAll(removed);
        System.out.println("Warna sekarang : " + color);
    }
}