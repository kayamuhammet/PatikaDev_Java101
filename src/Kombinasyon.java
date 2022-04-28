import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,fn=1,fr=1,ftr=1;
        int fakt;
        Scanner input = new Scanner(System.in);

        System.out.print("N Eleman Sayisini Giriniz : ");
        n = input.nextInt();
        // Faktoriyel Hesaplama
        while(n>=1){
            fn = fn * n;
            n--;
        }
        System.out.print("Fakt: " + fn);



        System.out.print("\nr Eleman Sayisini Giriniz : ");
        r = input.nextInt();
        // Faktoriyel Hesaplama
        while(r>=1){
            fr = fr * r;
            r--;
        }
        System.out.println("Fakt: " + fr);



        // Faktoriyel Hesaplama (n-r)!
        fakt = n-r;
        while(fakt>=1){
            ftr = ftr * fakt;
            fakt--;
        }

       System.out.println("C(n,r) : " +  fn / (fr * ftr));



    }
}
