import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {
        double toplamUcret; // km basina 0.10TL
        int secim;
        Scanner input = new Scanner(System.in);

        double km;
        System.out.println("Mesafeyi km turunden giriniz : ");
        km = input.nextDouble();

        int yas;
        System.out.println("Yasinizi Giriniz : ");
        yas = input.nextInt();

        // Indirimsiz Fiyat
        toplamUcret = 0.10*km;
        System.out.println("Indirimsiz Toplam Fiyat : " + toplamUcret + " TL\n");

        System.out.println("Bir secim yapiniz: \n1->Tek Yon\n2->Cift Yon");
        secim = input.nextInt();


        switch (secim){
            case 1:
                if(yas < 0 || km < 0){
                    System.out.println("Hatali Giris Yaptiniz!");
                }
                else{
                    if(yas<12){
                        toplamUcret = toplamUcret / 0.5;
                    }
                    if(yas<24 && yas>12){
                        toplamUcret = toplamUcret * 0.9;
                    }
                    if(yas>65){
                        toplamUcret = toplamUcret * 0.7;
                    }
                }
                System.out.println("Toplam Fiyat : " + toplamUcret + " TL\n");
                break;
            case 2:
                toplamUcret = toplamUcret * 0.8;
                System.out.println("Toplam Tutar : " + toplamUcret * 2 + " TL");
                break;
            default:
                System.out.println("Hatali Veri Girdiniz!");
                break;
        }
    }
}
