import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double toplam=0;
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        sayi = input.nextInt();

        for(int n=1; n<=sayi; n++){
            toplam = toplam + (1.0/n);
        }
        System.out.println("Girilen Sayinin Harmonik Serisi : " + toplam);
    }
}
