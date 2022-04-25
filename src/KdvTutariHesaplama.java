import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double price,kdv,result,rate;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz : ");
        price = input.nextDouble();
        if(price >=0 && price<1000){
            rate = 0.18;
            kdv = price * rate;
            result = price + kdv;
            System.out.println("KDV orani : "+ rate);
            System.out.println("KDV'siz Urun Fiyati : "+price);
            System.out.println("KDV'li Urun Fiyati : "+result);
            System.out.println("KDV Tutari : "+kdv);
        }
        else if(price>1000){
            rate=0.08;
            kdv = price*rate;
            result=price+kdv;
            System.out.println("KDV oranı : "+rate);
            System.out.println("KDV'siz Ürün Fiyatı : "+price);
            System.out.println("KDV'li Ürün Fiyatı : "+result);
            System.out.println("KDV Tutarı : "+kdv);
        }

    }
}
