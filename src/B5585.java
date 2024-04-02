import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        N =1000-N ;

        int count =0;

        while (N >= 0) {

            if (N == 0) {
            break;
            }
                if (N >= 500) {

                    N = N - 500;
                    count += 1;
                } else if (N >= 100) {
                    N = N - 100;
                    count += 1;
                } else if (N >= 50) {
                    N = N - 50;
                    count += 1;
                } else if (N >= 10) {
                    N = N - 10;
                    count += 1;
                } else if (N >= 5) {
                    N = N - 5;
                    count += 1;
                } else {
                    count += N;
                    N = 0;
                }
            }
        System.out.println(count);
    }



    }

