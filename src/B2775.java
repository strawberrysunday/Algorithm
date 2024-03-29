import java.io.*;

class B2775 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apt = new int[15][15];
        for(int i = 0; i < 15; i++) {
            apt[0][i] = i;
            apt[i][0] = 0;
        }
        for(int i = 1; i < 15; i++) {
            for(int j = 1; j < 15; j++) {
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apt[k][n]).append("\n");
        }
        System.out.print(sb);
    }
}