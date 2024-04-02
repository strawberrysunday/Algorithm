import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {

    static int N ;
    static int[] stairs ;
    static Integer[] dp = new Integer[301];


    static int recursive(int N) {


        if( N == 0){
            dp[0]= 0;
        } else if (N == 1) {
            dp[1]=stairs[1];
        }


        // N이 1로 들어왔을때 arr[2]에 접근할 수도 있어서(이 생각은 어떻게 하지?)
        if (N >= 2) {
            dp[2]=stairs[1]+stairs[2];
        }


        // null값인지 확인하려면 Integer를 써야한다
        if (dp[N] ==null ) {

            dp[N] = Math.max(recursive(N - 3) + stairs[N - 1], recursive(N - 2)) + stairs[N];
        }

        return dp[N];
    }





    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        stairs = new int[N+1];

        for (int i = 1; i<= N  ; i++) {

            String str= br.readLine();

            stairs[i] = Integer.parseInt(str);

        }




        System.out.println(recursive(N));



    }


}
