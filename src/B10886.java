import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class B10886 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int cute = 0;
        int notcute =0;

        for (int i = 0; i < N; i++) {

            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 1) {
                cute++;
            } else if (tmp == 0) {
                notcute++;
            }


        }

        if( cute > notcute){
            System.out.println("Junhee is cute!");
        } else  {
            System.out.println("Junhee is not cute!");
        }


    }
}
