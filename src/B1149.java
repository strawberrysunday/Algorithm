import javax.lang.model.element.Name;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;

public class B1149 {


    static int N;
    static int[][] paint;
    static int[] cost = new int[3];
    static void recurive(){

        for (int i = 0; i < paint[0].length; i++) {

            //cost[i]=paint[]







        }






    }


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        paint = new int[N][3];
        int []dp =new int [3];


        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {

                paint[i][j] = Integer.parseInt(st.nextToken());

            }
        }












    }
}
