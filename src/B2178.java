import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



 class Location {
    int x ;
    int y ;

     public Location(int x, int y) {
         this.x = x;
         this.y = y;
     }
 }

public class B2178 {

     static int N;
     static int M;
     static int[][] distance ;
    static boolean[] visit;
    static boolean[][] maze;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maze = new boolean[N][M];

        for (int i = 0; i <N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                char c = str.charAt(j);
                if(c=='1'){
                    maze[i][j]=true;
                }
            }
        }

        /*
        (0,0)에서 (N-1,M-1)까지 가야함
        내일 혼자 다시 해보세요 !
         */

        distance = new int[N][M];








    }

    static void bfs(int x, int y) {



    }



}
