import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];
        Integer[] b = new Integer[N];
        int sum=0;

        String aStr = br.readLine();
        String bStr = br.readLine();
        StringTokenizer stA = new StringTokenizer(aStr);
        StringTokenizer stB = new StringTokenizer(bStr);

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(stA.nextToken());
            b[i] = Integer.parseInt(stB.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {


            sum = sum + a[i] * b[i];



        }

        System.out.println(sum);

        }


    }
