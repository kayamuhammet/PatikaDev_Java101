import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        double k1,k2,k3,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Birinici Kenari Giriniz : ");
        k1 = input.nextInt();
        System.out.print("Lutfen Ikinci Kenari Giriniz : ");
        k2 = input.nextInt();
        System.out.print("Lutfen Ucuncu Kenari Giriniz : ");
        k3 = input.nextInt();

        u = (k1+k2+k3) / 2;
        alan =Math.sqrt(u * (u-k1) * (u-k2) * (u-k3));
        System.out.println("Ucgenin Alani : " + alan);


    }
}
