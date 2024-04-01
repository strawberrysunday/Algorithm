import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2748 {


    static int fib(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int result = fib(N);

        System.out.println(result);




    }
}
