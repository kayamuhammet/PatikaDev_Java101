public class PalindromSayilar {

    static void palind(int number){
        int temp = number, reverseNumber=0,lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber){
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Palindrom degil.");
        }

    }


    public static void main(String[] args) {
        palind(99);
    }

}
