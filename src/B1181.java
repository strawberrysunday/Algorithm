import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            String str=br.readLine();
            strArr[i] = str;
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return o1.length()-o2.length();
                } else if (o1.length() == o2.length()) {

                    return o1.compareTo(o2);

                    } else  {
                    return o2.length()-o1.length();
                }
            }
        });

        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(strArr));
        String[] newArr = hashSet.toArray(new String[0]);
        System.out.println(Arrays.toString(newArr));



    }
}
