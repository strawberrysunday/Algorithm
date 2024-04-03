import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1012 {


    static int T, M, N, K, bug;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    static int[][] Map;
    //static LinkedList<Integer> bugs;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            bug = 0;
            int a = 0;
            StringTokenizer  st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            Map = new int[M + 1][N + 1];
            visited = new boolean[M + 1][N + 1];
            //bugs = new LinkedList<>();


            for (int i = 0; i < K; i++) {

                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                Map[x][y] = 1;
            }


            for (int i = 0; i < M; i++) {
                //bug = 0;
                for (int j = 0; j < N; j++) {

                    if (Map[i][j] == 1 && !visited[i][j]) {

                        DFS(i, j);
                        bug = bug + 1;
                        a++;

                    }

                }


            }

            // 소름 bug= bug+1은 왜 답이 이상하게 나올까
            System.out.println( bug);
           // System.out.println( a);

        }


    }


    static void DFS(int x, int y) {


        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {

            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 ||  M < newX || newY < 0 || N < newY) continue;
            if (Map[newX][newY] != 1 || visited[newX][newY]) continue;

            DFS(newX, newY);


        }


    }


}

