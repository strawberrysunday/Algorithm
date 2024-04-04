import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] worth = new int[N];
        int count =0;
        for (int i = 0; i < N; i++) {

            worth[i]=Integer.parseInt(br.readLine());

        }


        while (true) {


            for (int i = N - 1; i >= 0; i--) {

                if(worth[i]>K) continue;
                int tmp = K / worth[i];
                count += tmp;
                K = K -worth[i]*tmp;

            }

            if (K == 0) {
                break;
            }




        }


        System.out.println(count);



    }
}
