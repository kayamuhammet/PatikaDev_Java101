import java.util.Scanner;

public class TamBolunebilme {
    public static void main(String[] args) {
        int sayi,toplam=0,frequency=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        while(sayi>0){
            if(sayi%3==0 && sayi%4==0)
            {
                System.out.println("3'e ve 4'e Tam Bolunebilen Sayilar : " + sayi);
                toplam = toplam + sayi;
                frequency++;
            }
            sayi--;
        }
        System.out.print("Tam Bolunebilen Sayilarin Ortalamasi :" + toplam/frequency);

    }
}
