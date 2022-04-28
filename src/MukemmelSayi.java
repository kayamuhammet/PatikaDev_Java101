import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = input.nextInt();
        int i=1;
        while (sayi>i){
            if(sayi%i==0){
                toplam = toplam + i;
            }
            i++;
        }
        if (toplam == sayi) {
            System.out.println(sayi + " : Mukemmel Bir Sayidir.");
        }else{
            System.out.println(sayi + " : Mukemmel Bir Sayi Degildir.");
        }
    }
}
