import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        double boy,kilo,vucutKitleEndeksi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lutfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        vucutKitleEndeksi = kilo/(boy*boy);
        System.out.print("Vucut Kitle Endeksiniz : " + vucutKitleEndeksi);

    }
}
