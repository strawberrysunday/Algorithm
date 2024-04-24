import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {

    static final int Quarter = 25;
    static final int Dime = 10;
    static final int Nickel = 5;
    static final int Penny = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            int change = Integer.parseInt(br.readLine());
            int[] counts = new int[4];

            while(change>0){

                if (change / Quarter > 0) {
                    counts[0] = change / Quarter;
                    change = change - (Quarter * counts[0]);
                }

               else if (change / Dime > 0) {
                    counts[1] = change / Dime;
                    change = change - (Dime * counts[1]);
                }

                else if (change / Nickel > 0) {
                    counts[2] = change / Nickel;
                    change = change - (Nickel * counts[2]);
                }
                else {
                    counts[3] = change ;
                    change = change - (Penny * counts[3]);
                }
            }

            for (int count : counts) {

                sb.append(count).append(" ");
            }
            sb.append("\n");
        }


        System.out.println(sb);

    }

}
