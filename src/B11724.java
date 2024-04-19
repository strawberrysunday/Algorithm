import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11724 {


    static boolean[] visited ;
    static  int [][] node;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        node = new int [N+1][N+1];
        visited = new boolean[N + 1];
        int count = 0;

        for (int i = 0; i < M; i++) {

            st= new StringTokenizer(br.readLine());

            int x,y;

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            node[x][y] = 1;
            node[y][x] = 1;


        }


        for (int i = 1; i < N + 1; i++) {

            if(!visited[i]){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    static void dfs(int x) {
        visited[x]= true;

        for (int i = 1; i < N + 1; i++) {
            if (node[x][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }


    }
}
