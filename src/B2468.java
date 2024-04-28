import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2468 {

    static int N ;
    static int [][] heights ;
    static boolean [][] visited;

    static int [][] tmpheights;

    static Queue<Location> q ;
    static Integer [] counts ;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        heights = new int[N][N];
        counts =new Integer[100];


        for (int i = 0; i < N; i++) {

            String str = br.readLine();

            for (int j = 0; j < N; j++) {

                heights[i][j] = str.charAt(i);

            }
        }


        for (int R = 0; R < 100; R++) {

            afterRainy(R);
            q = new LinkedList<>();
            visited = new boolean[N][N];
            counts[R]=0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                        if(heights[i][j]!=-1&& !visited[i][j]){
                            q.add(new Location(i, j));
                            checkSafeArea(R);
                            System.out.println("R = " + R);
                            System.out.println("counts[R] = " + counts[R]);
                        }
                }
            }
        }

        Arrays.sort(counts, Comparator.reverseOrder());

        System.out.println(counts[0]);
    }


    static void afterRainy(int rainfall) {



        tmpheights = heights.clone();
        for (int i = 0; i < tmpheights.length; i++) {
            for (int j = 0; j < tmpheights[0].length; j++) {

                if (tmpheights[i][j] < rainfall) {

                    tmpheights[i][j]=-1;

                }
            }
        }


    }


    static void checkSafeArea(int R) {

        Location tmp =q.poll();

        int tmpx = tmp.x;
        int tmpy = tmp.y;
        visited[tmpx][tmpy]=true;

        while (!q.isEmpty()) {


            for (int i = 0; i < 4; i++) {
                int newx = tmpx + dx[i];
                int newy = tmpy + dy[i];


                if (newx < 0 || newx > N || newy < 0 || newy > N) continue;
                if ( visited[newx][newy]) continue;

                if (!visited[newx][newy] && heights[newx][newy] != -1) {
                    q.add(new Location(newx, newy));
                    visited[newx][newy] =true;

                }

            }

        }
        counts[R]++;


    }

static class Location{
        int x;
        int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



}

