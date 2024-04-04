import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1931 {

    public void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        lecture [] lectures = new lecture[N];
        int[] runningTimes = new int[N];


        for (int i = 0; i < lectures.length; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            lectures[i] = new lecture(start, end);

        }

        for (int i = 0; i < runningTimes.length; i++) {

            runningTimes[i] = lectures[i].getRunningTime();



        }







    }

    class lecture{
        int start;
        int end;

        int runningTime;

        public lecture(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getRunningTime() {
            return end-start;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
