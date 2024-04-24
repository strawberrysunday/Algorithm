import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1932 {


    static int n;
    static int [][] triangle;
    static int [][] dp;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            for (int j = 0; j <= i; j++) {

                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(triangle[i][j]);
                System.out.print(" ");

            }

            System.out.println();
        }


    }
}
