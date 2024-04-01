import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class B2667 {
    static int N, count;
    static int[][] apart;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    static LinkedList<Integer> countApart;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        apart = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == '1') {
                    apart[i][j] = 1;
                }
            }
        }

        count = 1;
        visited = new boolean[N][N];
        countApart = new LinkedList<Integer>();


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apart[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    countApart.add(count);
                    count = 1;
                }
            }
        }

        System.out.println(countApart.size());


        Collections.sort(countApart);

        for (int i = 0; i < countApart.size(); i++) {

            System.out.println(countApart.get(i));

        }
    }

    static void dfs(int x, int y) {

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {


            //Location currentLocation = new Location(x, y);
            int tmpX = x + dx[i];
            int tmpY = y + dy[i];

            if (0 > tmpX || tmpX >= N || 0 > tmpY || tmpY >= N) {
                continue;
            }
            if (apart[tmpX][tmpY] == 0 || visited[tmpX][tmpY]) {
                continue;
            }

            if (apart[x][y] != 0 && !visited[tmpX][tmpY]) {
                count++;
                visited[tmpX][tmpY] = true;
                dfs(tmpX, tmpY);

            }
        }

    }
}
