import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2476 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int maxPrice = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int tmpPrice;

            if (a == b && a == c) {
                tmpPrice = 10000+ a * 1000;
            } else if (a == b || a == c) {
                tmpPrice = 1000 + a * 100;
            } else if (b == c) {
                tmpPrice = 1000 + b * 100;
            }else {
                int max = Math.max(a, Math.max(b, c));
                tmpPrice = max * 100;
            }

            if (maxPrice < tmpPrice) {
                maxPrice = tmpPrice;
            }

        }


        sb.append(maxPrice);
        System.out.println(sb);

    }

}
