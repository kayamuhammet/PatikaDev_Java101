import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k,usN=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayisini Giriniz: ");
        n= input.nextInt();
        System.out.print("Kuvveti Giriniz: ");
        k= input.nextInt();
        for(int i=1; i<=k; i++ ){
            usN = usN * n;
        }
        System.out.print("Uslu Sayi : " + usN);
    }
}
