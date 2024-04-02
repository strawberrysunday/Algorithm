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
    static LinkedList<Integer> bugs = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {

            String str = br.readLine();
            st = new StringTokenizer(str);
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            bug = 0;

            Map = new int[M][N];
            visited = new boolean[M][N];

            while (K-- > 0) {

                str = br.readLine();
                st = new StringTokenizer(str);

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                Map[x][y] = 1;

            }


            bug = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {


                    if (Map[i][j] == 1 || !visited[i][j]) {
                        bug=1;
                        DFS(i, j);

                    }

                }

                bugs.add(bug);
                bug= 0;
            }

            System.out.println(bugs.size());

        }


    }

    static void DFS(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {

            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || M < newX || newY < 0 || N < newY) continue;
            if (Map[newX][newY] == 0 || visited[newX][newY]) continue;

            DFS(newX, newY);
            bug = bug + 1;
            visited[newX][newY] = true;

        }


    }


    static class cabbage {
        int x;
        int y;

        public cabbage(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}

