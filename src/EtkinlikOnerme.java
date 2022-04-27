import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik Giriniz :");
        heat = input.nextInt();
        if ( heat < 5 ){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if ( heat >=5 && heat < 15 ){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if ( heat >=15 && heat <25){
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
