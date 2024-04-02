import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        int[] runningTime = new int[N];
        int[] dp = new int[N];
        int sum=0;

        String str = br.readLine();
        st = new StringTokenizer(str, " ");

        for (int i = 0; i < N; i++) {
            runningTime[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(runningTime);


        for (int i = 2; i < runningTime.length; i++) {


            dp[0] = runningTime[0];
            dp[1] = runningTime[0] + runningTime[1];
            dp[i] = dp[i-1] + runningTime[i];

        }


        for (int i = 0; i < dp.length; i++) {
            sum += dp[i];

        }

        System.out.println(sum);
    }
}
