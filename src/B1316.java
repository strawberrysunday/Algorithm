import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {


    static int count =0;

    static void calculateGroup(String str) {

        boolean[] alphabetFlag = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (!alphabetFlag[index]) {
                alphabetFlag[index]=true;
            }else {
                if (i!=0 && str.charAt(i - 1) == str.charAt(i)) {
                    continue;
                }else{
                   return ;
                }
            }
        }

        count++;


    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {

            String str = br.readLine();
            calculateGroup(str);

        }

        System.out.println(count);

    }


}
