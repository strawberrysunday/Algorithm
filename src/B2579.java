import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {

    static int N ;
    static int[] stairs ;
    static int[] dp = new int[301];


    static void recursive(int N) {


        if( N == 0){
            dp[0]= 0;
        } else if (N == 1) {
            dp[1]=stairs[1];
        } else {


            dp[N] = Math.max(dp[N-1],dp[N-2]) + stairs[N];
        }

    }





    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        stairs = new int[N+1];

        for (int i = 1; i<= N  ; i++) {

            String str= br.readLine();

            stairs[i] = Integer.parseInt(str);

        }


        for (int i = 0; i <= N; i++) {

            recursive(i);


        }


        for (int a : dp) {

            System.out.println(a);
        }


        //System.out.println(dp[N]);



    }


}
