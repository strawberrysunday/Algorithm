import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        /*
         * 글자길이가 1 or 2 일 때 처리해야함
         * 엥
         * 그냥 다 틀렸네 ㅠㅠ 이거우뜨캐해ㅐㅐㅐㅐㅐㅐ
         *
         */
        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            char [] tmpArr = str.toCharArray();
            int isPalindrome = 0;
            //System.out.println("str.length() = " + str.length());
            int index = str.length() / 2;
            //System.out.println("before for loop index = " + index);



            for (int i = 0; i < index; i++) {

                if (tmpArr[index+i] == tmpArr[index-i]) {
                    System.out.println("i = " + i);
                    System.out.println("(index-i) = " + (index-i));
                    System.out.println("(index+i) = " + (index+i));
                    isPalindrome++;

                    //System.out.println("isPalindrome = " + isPalindrome);
                }
            }


            if(isPalindrome == index){
                sb.append("yes");
            }else {
                sb.append("no");
            }

            sb.append("\n");

            //System.out.println("------------");
        }

        System.out.println(sb);

    }
}
