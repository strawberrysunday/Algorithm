import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < 26; i++) {

            alphabet[i]=str.indexOf((char)(i+97));

        }

        for (int a : alphabet) {


            System.out.print(a + " ");
        }
    }
}