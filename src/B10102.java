import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str =br.readLine();
        char[] charArr = str.toCharArray();
        int score = 0;

        for (int i = 0; i < N; i++) {
            if(charArr[i]=='A'){
                score++;
            } else if (charArr[i]=='B') {
                score--;
            }
        }

        if( score < 0){
            System.out.println("B");
        } else if (score == 0) {
            System.out.println("Tie");
        } else{
            System.out.println("A");
        }


    }
}
