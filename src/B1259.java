import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<StringBuilder> results = new ArrayList<>();


        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }




            StringBuilder resultBuilder = new StringBuilder();
            StringBuilder reverseStr = new StringBuilder(str).reverse();



            if (str.contentEquals(reverseStr)) {

                resultBuilder.append("yes");

            }else {

                resultBuilder.append("no");
            }


           results.add(resultBuilder);


        }

        for (StringBuilder result : results) {
            System.out.println(result);
        }

    }
}
