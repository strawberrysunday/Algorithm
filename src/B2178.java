import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178{

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int [][] maze;
    static boolean[][] visit;


    static int N,M;

    static Queue<setIndex> q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        q = new LinkedList<>();
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = str.charAt(j);
                if (c == '1') {
                    maze[i][j]=1;
                }
            }
        }

        bfs(0, 0);

        System.out.println(maze[N-1][M-1]);


    }


    public static void bfs(int x, int y) {
        q.add(new setIndex(x, y));
        visit[x][y]=true;

        while (!q.isEmpty()) {

            setIndex currentIndex = q.poll();


            for (int i = 0; i < 4; i++) {
                int newX = currentIndex.tmpX+dx[i];
                int newY = currentIndex.tmpY+dy[i];

                if (newX < N && 0 <= newX && newY < M && 0 <= newY) {
                    if (maze[newX][newY] == 1 && !visit[newX][newY]) {

                        q.add(new setIndex(newX, newY));
                        maze[newX][newY] = maze[currentIndex.tmpX][currentIndex.tmpY]+1;
                        visit[newX][newY] = true;

                    }
                    ;
                }



            }



        }





    }



    static class setIndex{
        int tmpX;
        int tmpY;

        public setIndex(int tmpX, int tmpY) {
            this.tmpX = tmpX;
            this.tmpY = tmpY;
        }
    }

    }
