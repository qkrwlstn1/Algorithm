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
        int b = Integer.parseInt(st.nextToken());
        int[][] arr= new int[n][m];
        int total=b;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                total+=arr[i][j];
            }
        }
        int avg = total/(n*m);
        int cost = Integer.MAX_VALUE;
        while (avg >= 0){
            int tmpCost =0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int tmp = avg - arr[i][j];
                    if(tmp > 0) tmpCost += tmp;
                    else tmpCost += tmp * -1 * 2;
                }
            }

            if(cost > tmpCost){
                cost = tmpCost;
                avg--;
            }else{
                break;
            }

        }
        sb.append(cost).append(" ").append(avg+1);
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }





}