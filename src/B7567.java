import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B7567 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int height = 10;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                height += 5 ;
            }else {
                height += 10 ; 
            }
        }

        System.out.println(height);
    }
}
