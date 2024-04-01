import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.min;

public class B1463 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        int N = Integer.parseInt(br.readLine());

        int[] d = new int[N+1];


    for (int i = 2; i < d.length; i++) {


        d[i] = d[i - 1] + 1;

        if (i % 2 == 0) {
            d[i] = min(d[i], d[i / 2] + 1);
        }

        //이거를 else if라 쓰면 왜 안될까
        if (i % 3 == 0) {
            d[i] = min(d[i], d[i / 3] + 1);
        }

        }

        System.out.println(d[N]);


    }
}
