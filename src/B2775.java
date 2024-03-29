import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {


    static int [][] people;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        people = new int[14][14];

        for (int i = 0; i < N; i++) {

            int result = howManyPeople(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
            sb.append(result).append("\n");

        }

        System.out.println(sb);




    }


    static int howManyPeople(int x, int y) {


        int tmp =0 ;

        for (int i = 0; i < x; i++) {

            for (int j = 1; j <= y; j++) {

                if(i==0){
                    tmp = j;
                    people[i][j] =tmp;
                    continue;
                }else if(j==1){
                    tmp = 1;
                    people[i][j] =tmp;
                    continue;
                }else{

                    tmp = tmp+ howManyPeople(x,y);

                    people[i][j] =tmp;
                }


                return tmp;

         }
        }

        return tmp;

        }

    static class apart {
        int floor;
        int ho ;
        public apart(int floor, int ho) {
            this.floor = floor;
            this.ho = ho;
        }


}}



