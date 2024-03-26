import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2606 {

    static boolean [][] node;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int N ;
    static int count=0;

    static Queue<Integer> q;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        node = new boolean[N+1][N+1];
        visited = new boolean[N + 1];
        q = new LinkedList<>();

        for (int i = 0; i < pair; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            node[a][b] = node[b][a] =  true;
        }

       dfs(1);
       // System.out.println(sb);
       // bfs(1);
        System.out.println( count);

    }

    static void bfs(int v) {
        q.add(v);
        visited[v]=true;

        while(!q.isEmpty()){
            int start = q.poll();
            count = count+1;

            for (int i = 1; i <= N; i++) {
                if (node[start][i] && !visited[i]) {
                    q.add(i);
                    visited[i]=true;

                }
            }

        }
/*  내일 (240327) bfs구현 왜 틀렸는지 알아보자 */


    }



    static void dfs(int v) {

        visited[v] =true;
      //  sb.append(v).append(" ");


        for (int i = 1; i <= N; i++) {
            if (node[v][i] && !visited[i]) {
                count++;
                dfs(i);
            }

        }

    }
}
