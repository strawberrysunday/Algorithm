import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {


    static int [][] people;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());



        while (N-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            people = new int[k + 1][n + 1];
            sb.append(howManyPeople(k, n)).append("\n");
        }


        System.out.println(sb);




    }





    static int howManyPeople(int k, int n) {
        if (people[k][n] > 0) {
            return people[k][n];
        }

        if (k == 0) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            return howManyPeople(k, n - 1) + howManyPeople(k - 1, n);
        }
    }

}



