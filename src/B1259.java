import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            sb = new StringBuilder(str);
            //    /*이 시점에서 StringBuilder가 초기화되기 때문에 앞의 결과가 사라진다. */



            String reverseStr = sb.reverse().toString();


            sb.delete(0, sb.length());





            if (str.equals(reverseStr)) {

                sb.append("yes");

            }else {

                sb.append("no");
            }


            sb.append("\n");


        }

        System.out.println(sb);

    }
}
