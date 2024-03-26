import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15650 {
    static StringBuilder sb = new StringBuilder();
    static int N ;
    static int[] results;
    static int M;
   // static int start;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        results = new int[M];

        permutation(N,0,0);

        System.out.println(sb);

    }


    static void permutation(int N, int depth, int start) {

        System.out.println("call "+N+" "+depth+" "+start);

        if (M == depth) {

            for (int result : results) {
                sb.append(result).append(" ");
                }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {

            System.out.println("배열 인덱스:"+depth+" 배여값은 :  "+ (i+1));
            results[depth]=i+1;
            System.out.println("저장");
            permutation(N,depth+1,start+1);
            start = depth;

        }
        System.out.println("******end");

    }


}








