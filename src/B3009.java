import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] locationX = new int[3];
        int[] locationY = new int[3];
        int targetX = 0;
        int targetY = 0;
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            locationX[i] = Integer.parseInt(st.nextToken());
            locationY[i] = Integer.parseInt(st.nextToken());
        }

        if(locationX[0]==locationX[1]){
            targetX = locationX[2];

        }else if(locationX[0]==locationX[2]){
            targetX = locationX[1];
        }else {
            targetX = locationX[0];
        }


        if(locationY[0]==locationY[1]){
            targetY = locationY[2];

        }else if(locationY[0]==locationY[2]){
            targetY = locationY[1];
        }else {
            targetY = locationY[0];
        }


        sb.append(targetX).append(" ").append(targetY);


        System.out.println(sb);
    }



}
