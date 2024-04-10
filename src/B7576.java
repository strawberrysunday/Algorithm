import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B7576 {


    static int[][] tomatoes;
    static boolean[][] visited;

    static int days;
    static Queue<Tomato> tomatoQueue = new LinkedList<>();
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        days=0;
        tomatoes = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {

            String str = br.readLine();
            st = new StringTokenizer(str);

            for (int j = 0; j < M; j++) {

                tomatoes[i][j] = Integer.parseInt(st.nextToken());


            }
        }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(tomatoes[i][j]==1){
                        tomatoQueue.add(new Tomato(i, j));
                    }
                }
            }

        System.out.println(days);

        }

    static void bfs() {

        Tomato tmpTomato = tomatoQueue.poll();
        int x = tmpTomato.x;
        int y = tmpTomato.y;

        visited[x][y] = true;

        while (!tomatoQueue.isEmpty()) {


            for (int i = 0; i < 4; i++) {

                int newX = x + dx[i];
                int newY = y + dy[i];

                //범위 넘으면
                if (newX < 0 || M < newX || newY < 0 || N < newY) continue;
                //  토마토 없는 칸 이거나 이미 방문한 칸이면
                if (tomatoes[newX][newY] == -1 || visited[newX][newY]) continue;


                // 방문하지 않았고 익은 토마토가 들어있으면--> 틀렸음 이미 익어있으면 n개의 상하좌우 토마토가 같은 날 익어가야하기때문에
                if (tomatoes[newX][newY] == 1 && !visited[newX][newY]) {
                    //옆 토마토들 익히러가야함
                    bfs();
                    days++;
                    continue;
                }

                //토마토 익히기
                tomatoes[newX][newY] = 1;
                visited[newX][newY]=true;
                days++;
                tomatoQueue.add(new Tomato(newX, newY));

            }


        }


    }

    static class Tomato {
        int x ;
        int y;


        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;

        }

    }

}

