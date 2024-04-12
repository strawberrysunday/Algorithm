import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int[] target = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < M; i++) {
            target[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {

            int tmp = binarySearch(arr, target[i]);
            if(tmp ==-1){

                sb.append("0").append("\n");
            }
            else{

                sb.append("1").append("\n");
            }

        }

        System.out.println(sb);
    }


    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {

            int mid =(start+end) / 2;

            if(target<arr[mid]){

                end = mid-1;

            } else if (arr[mid] < target) {
               start =mid+1;
            } else if (arr[mid] == target) {

                return mid;

            }



        }
        return -1;




    }

}
