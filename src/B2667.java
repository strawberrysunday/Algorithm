import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B2667{
    static int N, count;
    static int [][] apart ;
    static boolean [][] visited;
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
                if(str.charAt(j)=='1'){
                    apart[i][j] = 1;
                }
            }
        }

        count = 0 ;
        visited = new boolean[N][N];
        countApart = new LinkedList<>();


        dfs(0,0);
        String string = countApart.toString();
        System.out.println(string);
    }

    static void dfs(int x, int y) {

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {


            //Location currentLocation = new Location(x, y);
            int tmpX = x + dx[i];
            int tmpY = y + dy[i];

            if(0>tmpX||tmpX>=N||0>tmpY||tmpY>=N){
                continue;
            }
            if (visited[tmpX][tmpY]){
                continue;
            }

            if(apart[x][y]!=0 && !visited[tmpX][tmpY] ){
                count =apart[x][y]+1;
                visited[tmpX][tmpY]=true;
                dfs(tmpX, tmpY);
            }

            if(apart[x][y]==0){
                countApart.add(count);
                System.out.println("count"+count+"dfs( "+x+" "+y+" )");
                count = 0;
                dfs(tmpX,tmpY);
            }
        }

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



