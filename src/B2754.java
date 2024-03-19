import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2754 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();

        String[] scoreArr = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D+","D0","D-","F"};
        Double [] scoreResultArr = {4.3,4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0.7,0.0};

        int index=0;

        for (int i = 0; i < scoreArr.length; i++) {

            if( score.equals(scoreArr[i])){
                index = i;
            }
        }

        System.out.println(scoreResultArr[index]);




    }
}
