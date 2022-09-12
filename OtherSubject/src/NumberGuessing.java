import java.util.Scanner;

public class NumberGuessing {
    RandomNumber nr = new RandomNumber();
    boolean isNumber = true;
    int right = 5;
    int number,value=100;
    int startRight = 0;
    int correctAnswer = this.nr.random(this.value);

    void print(){
        Scanner input = new Scanner(System.in);

        while(this.isNumber && this.startRight < this.nr.right(5)){
            System.out.print("Guess a Number : ");
            this.number = input.nextInt();
            this.startRight++;

            if(number == correctAnswer) {
                System.out.print("Congratulations, you found the number. : ");
                this.isNumber = false;
            }
            else if(this.startRight == (this.nr.right(this.right))){
                System.out.println("You right is over!");
                System.out.println("Answer : " + correctAnswer);

            }
        }

    }
    void correctAnswer(){

    }

}
