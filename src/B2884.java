import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M >= 45) {
            M = M -45;

        }else {
            if(H != 0){
                H -= 1;
            }else {
                H = 23;
            }
            M = 60 - (45 - M);

        }

        sb.append(H).append(" ").append(M);

        System.out.println( sb );

    }


}
