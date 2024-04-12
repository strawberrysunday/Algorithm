import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            String str=br.readLine();
            strArr[i] = str;
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                 if (o1.length() == o2.length()) {

                    return o1.compareTo(o2);

                 } else  {
                    return o1.length()-o2.length();
                }
            }
        });

        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(strArr));
        String[] newArr = hashSet.toArray(new String[0]);
        for (String str : newArr) {
            System.out.println(str);
        }
        /*sb.append(strArr[0]).append('\n');
        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!strArr[i].equals(strArr[i - 1])) {
                sb.append(strArr[i]).append('\n');
            }
        }
        System.out.println(sb);*/


    }
}
