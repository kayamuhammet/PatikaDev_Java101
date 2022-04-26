import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        double r, a, pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dairenin yaricapini giriniz : ");
        r = input.nextDouble();

        System.out.print("Lutfen dairenin merkez acisini giriniz : ");
        a = input.nextDouble();

        System.out.println("Daire Diliminin Alani : " + (pi * (r*r) * a) / 360);
    }
}
