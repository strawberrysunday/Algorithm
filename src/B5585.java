import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =1000- Integer.parseInt(br.readLine());

        //디버깅 1입력시 count -554115029 나옴 뭥미 -ㅅ-??
        int count =0;

        while (N > 0) {

            if(N >=500){

                N = N - 500;
                count++;
            }else if(N>=100){
                N = N - 100;
                count++;
            }else if(N>=50) {
                N = N - 50;
                count++;
            }else if(N>=10) {
                N = N - 10;
                count++;
            }else if(N>=5){
                N = N - 5;
                count++;
            }else{
                count += N;
            }
 }

        System.out.println(count);


    }


}
