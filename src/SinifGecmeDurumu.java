import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        double avg = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = input.nextInt();
        if(matematik<100 && matematik>0)
            avg += matematik;

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if(fizik<100 && fizik>0)
            avg += fizik;

        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if(turkce<100 && turkce>0)
            avg += turkce;

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (kimya<100 && kimya>0)
            avg += kimya;

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if (muzik<100 && muzik>0)
            avg += muzik;

        avg = avg / 5;
        System.out.println("Ortalamaniz : " + avg);

        if (avg>55)
            System.out.println("Sinifi Gectiniz!");
        else
            System.out.println("Basarisiz!");
    }
}
