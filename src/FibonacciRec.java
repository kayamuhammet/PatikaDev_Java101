public class FibonacciRec {
    static int fib(int n){
        if(n == 1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        // 1 1 2 3 5 8 11 19 30...
        System.out.println(fib(4)); // 4 => indis sayisi
    }
}
