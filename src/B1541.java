import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1541 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = Integer.MAX_VALUE;


        StringTokenizer sub = new StringTokenizer(str, "-");

        while (sub.hasMoreTokens()) {

            int tmp =0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while (add.hasMoreTokens()) {
                tmp += Integer.parseInt(add.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
             sum = tmp;
            }else{
                sum -= tmp;
            }

        }

        System.out.println(sum);

    }
}
