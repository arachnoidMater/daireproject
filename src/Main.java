import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,alfa;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz:");
        r=inp.nextInt();

        System.out.print("Merkez açısını giriniz:");
        alfa=inp.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;
        double diliminAlani=(alan*alfa)/360;

        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+cevre);
        System.out.println("Daire diliminin alanı:"+diliminAlani);

    }
}