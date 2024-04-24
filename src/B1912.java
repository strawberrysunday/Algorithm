import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1912 {

    static int n;
    static Integer [] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;

        int[] arr = new int[n];
        dp = new Integer[n];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        for (int i = 0; i < n ; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            arr[i] = tmp;

        }

        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {

            dp[i] = dp[i - 1] + arr[i];

        }

        for(int a : dp){
            System.out.print(a+" ");
        }

        for (int i = dp.length - 1; i > 0; i--) {
            int tmp;
            for (int j = i - 1; j >= 0; j--) {


                tmp =Math.abs(dp[i])+Math.abs(dp[j]);
                if(tmp > max){
                    max =tmp;
                }
            }

        }
        System.out.println();
        System.out.println(max);



    }

}
