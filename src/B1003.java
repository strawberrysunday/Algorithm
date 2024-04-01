import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1003 {

    static StringBuilder sb = new StringBuilder();
    static int callzero;
    static int callone;

    static int [] callcount=new int[2];
    static int fibonacci(int n) {

        int result;
        if (n == 0) {
          //  sb.append("0");
            callcount[0]++;
            result=0;
        } else if (n == 1) {
            //sb.append("1");
            callcount[1]++;
            result=1;

        } else {
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {

            callzero=0;
            callone=0;
            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(callcount[0]).append(" ").append(callcount[1]).append("\n");


        }

        System.out.println(sb);


    }
}
