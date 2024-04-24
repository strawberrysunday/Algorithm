import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B1010 {

    public static void main(String[] args)  throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int N;
        int M;
        StringTokenizer st ;
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            sb.append(cal(N, M)).append("\n");


        }


        System.out.println(sb);

    }

    static Long factorial(int a) {

        if ( a == 1 ){
            return (long)1 ;
        }

        else return a* factorial(a-1);
    }

    static long cal(int N, int M) {

        if(N==0|| M==0){
            return 0;
        }
        if (N == 1) {
            return M;
        }else if(M==1){
            return N;
        }

        long ja = factorial(M);

      //  System.out.println("ja = " + ja);
        long mo = factorial(M - N ) * factorial(N);

       // System.out.println("mo = " + mo);
        return ja / mo;

    }
}
