import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        int acilis = 10;
        double kmBasina = 2.20, km, tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Gidilen Mesafeyi(KM cinsinden) Yaziniz : ");
        km = input.nextDouble();

        tutar = acilis + (km * kmBasina);

        if (tutar<20){
            System.out.println("Odenecek Tutar : " + 20 + " TL");
        }else{
            System.out.println("Odenecek Tutar : " + tutar + " TL");
        }

    }
}
