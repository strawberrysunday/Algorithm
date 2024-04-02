import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {

    static int[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        int[] runningTime = new int[N];
        dp = new int[N];
        int sum=0;

        String str = br.readLine();
        st = new StringTokenizer(str, " ");

        for (int i = 0; i < N; i++) {
            runningTime[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(runningTime);

        dp[0] = runningTime[0];
        for (int i = 1; i < N ; i++) {
            dp[i] = dp[i-1] + runningTime[i];
        }

        /***    위에꺼를 왜

//        dp[0] = runningTime[0];
//        dp[1] = runningTime[0] + runningTime[1];
//        for (int i = 2; i < N ; i++) {

//            dp[i] = dp[i-1] + runningTime[i];

//         }
            왜 이렇게 하면 런타임에러가 나지
            dp[0] dp[1] 위에 쓰고
            i =2부터니까 dp[2] 채우는데 왜 런타임 에러 (ArrayIndexOutOfBounds)나지?
            아................
            알았다
            아....모르겠는데?
        ***/
        for (int i = 0; i < N ; i++) {
            sum += dp[i];

        }

        System.out.println(sum);
    }
}
