import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac Kilo ? : ");
        armutKilo = input.nextDouble();
        System.out.print("Elma Kac Kilo ? : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates Kac Kilo ? : ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz Kac Kilo ? : ");
        muzKilo = input.nextDouble();
        System.out.print("Patlican Kac Kilo ? : ");
        patlicanKilo = input.nextDouble();

        toplam = (armutKilo*armutFiyat) + (elmaKilo*elmaFiyat) + (domatesKilo*domatesFiyat)
                + (muzKilo*muzFiyat) + (patlicanKilo*patlicanFiyat);
        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
