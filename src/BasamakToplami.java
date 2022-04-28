import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        int sayi,k,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        sayi = input.nextInt();

        //Basamaklari Bulma

        while(sayi>0){
            k = sayi%10;
            toplam = toplam + k;
            sayi = sayi/10;
        }
        System.out.print("Basamaklar Toplami : " + toplam);

    }
}
