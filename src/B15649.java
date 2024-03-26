import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {

    static StringBuilder sb = new StringBuilder();

    static boolean [] visit ;
    static int [] results ;

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        visit = new boolean[N];
        results = new int[M];


        dfs(N, M, 0);

        System.out.println(sb);

    }

    private static void dfs(int N, int M, int depth) {
        if (M == depth) {
            for (int result : results) {

                sb.append(result).append(" ");

            }
            sb.append("\n");
            return;
        }



        for (int i = 0; i < N; i++) {

            if(!visit[i]){
                visit[i]=true;
                results[depth]=i+1;
                dfs(N, M, depth + 1);
                visit[i]=false;
            }
        }

    }
}
