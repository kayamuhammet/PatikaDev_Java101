import java.util.Scanner;

public class EnBuyukSayiBulma {
    public static void main(String[] args) {
        int num, min=0, max =0, toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayi gireceksiniz : ");
        toplam = input.nextInt();

        if (toplam >= 2) {
            for (int i = 1; i <= toplam; i++) {
                System.out.print(i + ". sayi :");
                num = input.nextInt();

                if (i == 1) {
                    max = num;
                    min = num;
                } else {
                    if (num >= max)
                        max = num;
                    if (num <= min)
                        min = num;
                }
            }
            System.out.println("Min number is " + min);
            System.out.println("Max number is " + max);
        } else
            System.out.println("You have enter insufficient number");
    }
}