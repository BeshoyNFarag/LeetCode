import java.util.ArrayList;

public class Fibo {
    private long [] memorization;
    public long fib(int n) {


        long [] memorization = new long [n + 1];
        if (n <= 1){
            return n;
        }

        if(memorization[n] != 0){
            return memorization[n];
        }


        memorization[n] = (fib(n-1) + fib(n-2));
        return  memorization[n];


    }


    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        System.out.println(fibo.fib(20));
    }
}
