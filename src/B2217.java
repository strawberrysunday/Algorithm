import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2217{

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {

            ropes[i] = Integer.parseInt(br.readLine());


        }


        Arrays.sort(ropes);
        int max_value = 0;
        for (int i = 0; i < N; i++) {
            max_value = Math.max(max_value, ropes[i] * (N - i));
        }


        System.out.println(max_value);
    }

}
