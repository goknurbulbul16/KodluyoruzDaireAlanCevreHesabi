import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a ;
        double pi = 3.14, alan, cevre, dilimAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Dairenin Açı Değerini giriniz: ");
        a = input.nextInt();

        cevre = 2*pi*r;
        System.out.println("Dairenin Çevresi: " +cevre);

        alan = pi*r*r;
        System.out.println("Dairenin Alanı: " +alan);

        dilimAlani = (alan * a) / 360;
        System.out.print("Dairenin Dilim Alani: " +dilimAlani);

    }
}