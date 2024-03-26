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



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] maze = new char[N][M];

        for (int i = 0; i <N; i++) {
            String str = br.readLine();
            char[] charArr = str.toCharArray();
            maze[i] = charArr;
        }

        /*
        (0,0)에서 (N-1,M-1)까지 가야함
         */

    }


}
