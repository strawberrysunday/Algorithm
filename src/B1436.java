import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int turn = 1;
        int init =666;


        while (turn != N) {

            init++;

            String tmp = String.valueOf(init);
            if (tmp.contains("666")) {
                turn++;
            }

        }

        System.out.println(init);


    }
}
