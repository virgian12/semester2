import java.util.Arrays;

public class Latihan1 {
    public static void main(String[] args) {
        int i, ganji;
        float sum =0;
        float rata;
        int num[] ={23, 6, 47, 35, 2, 14,};
        int a = num.length;
        System.out.println("\n=====================\n");
        System.out.println("=> Data yang belum durutkan :");
        for (i= 0; i < a; i++) {
            System.out.print(" " + num[i]);
        }
        System.out.println(" ");
        System.out.println("=> Data yang sudah durutkan :");
            Arrays.sort(num);
            for (i = 0; i< a; i++) {
                System.out.print(" " + num[i]);
            }
            System.out.println(" ");
            System.out.println("\n=====================\n");
        for (i= 0; i < a; i++) {
             sum = sum + num[i];

        }
            rata = sum / a;
        System.out.println(" => Rata - Rata = " + rata);
        System.out.println("");
        System.out.println("\n => Data Maximum : ");
        System.out.println(" " + num[a - 1]);

        System.out.println("\n=====================\n");
        System.out.println(" => Bilangan Ganjil : " );
        for (i = 0; i < a; i++) {
            if (num[i] % 2 != 0){
                System.out.print(" " + num[i]);

            }
        }
        System.out.println(" ");
        System.out.println("\n=====================\n");
        System.out.println(" => Bilangan Prima" );

        for (i = 0; i < num.length; i++) {
            int ya = 0;
            for (int bagi = 1; bagi < num[i]; bagi++) {
                if (num[i] % bagi == 0) {
                    ya++;
                }
            }
            if (ya == 1) {
                System.out.print(" " + num[i]);
            }
        }
        System.out.println(" ");
        System.out.println("\n=====================\n");
    }
}
