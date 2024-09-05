import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        int[][] sumArr = new int[n][n];
        int sum = 0;
        int[][] lengthArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                sumArr[i][j] = sum;
                arr[i][j] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            int tmp =0;
            for (int j = 0; j < n; j++) {
                tmp += arr[j][i];
                lengthArr[i][j] = tmp;
            }
        }

        for (int i = 0; i < m; i++) {
            int ans = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;
            ans = sumArr[x2][n-1];
            if(x1 != 0){
                ans -= sumArr[x1-1][n-1];
            }

            for (int j = 0; j < n; j++) {
                if(y1 > j || y2 <j){
                    if(x1 != 0) ans -= lengthArr[j][x2] - lengthArr[j][x1-1];
                    else ans -= lengthArr[j][x2];
                }
            }
            sb.append(ans).append("\n");
        }



        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }




}