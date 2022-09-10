public class OrtalamaBulma {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double sum=0.0;
        for(int i=0; i<numbers.length; i++){
            sum = sum + 1.0/numbers[i];
        }
        System.out.println("Harmonic Average : " + numbers.length / sum);
    }
}
