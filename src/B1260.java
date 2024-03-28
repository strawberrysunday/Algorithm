import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {


    static boolean [] arr;
    static int N;
    static int M;
    static int V;
    static boolean [][] nodeMatrix;
    static Queue<Integer> q ;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        nodeMatrix = new boolean[N+1][N+1];
        q = new LinkedList<Integer>();

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            nodeMatrix[a][b] = nodeMatrix[b][a] = true;
        }

        arr = new boolean[N + 1];
        dfs(V);

        sb.append("\n");

        arr = new boolean[N + 1];
        bfs(V);

        System.out.println(sb);



    }

    static void dfs(int V) {
        arr[V]=true;
        sb.append(V).append(" ");

        for (int i = 1; i <= N; i++) {
            if(nodeMatrix[V][i]&&!arr[i]){
                dfs(i);
            }
        }

    }

    static void bfs(int V) {
        q.add(V);
        arr[V]=true;

        while (!q.isEmpty()) {
            int tmp = q.poll();
            sb.append(tmp).append(" ");
            for (int i = 1; i <= N; i++) {
                if (nodeMatrix[tmp][i] && !arr[i]) {
                    q.add(i);
                    arr[i]=true;
                }
            }

        }

    }
}
