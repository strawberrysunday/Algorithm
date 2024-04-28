import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B10162 {

    static final int A = 300;
    static final int B = 60;
    static final int C = 10;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] counts = new int[3];

        while(true){

            if (T % 10 != 0 ) {

                sb.append("-1");
                break;
            }else if( T == 0 ){
                break;
            }


            if( T / A > 0 ){

                counts[0]=  T / A ;
                T = T - (counts[0] * A);

            } else if (T / B > 0) {

                counts[1]=  T / B ;
                T = T - (counts[1] * B);

            } else if (T / C > 0) {

                counts[2]=  T / C ;
                T = T - (counts[2] * C);

            }


        }


        if (sb.length() != 0) {

            System.out.println(sb.toString());

        }else {

            for (int a : counts) {
                System.out.print(a + " ");
            }

        }


    }
}
