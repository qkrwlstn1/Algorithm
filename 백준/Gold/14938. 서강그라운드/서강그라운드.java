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
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        int[] items = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            Arrays.fill(arr[i], 1501);
            arr[i][i] = 0;
        }
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            items[i+1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[a][b] = Math.min(arr[a][b], c);
            arr[b][a] = Math.min(arr[b][a], c);
        }

        for (int k = 1; k <n+1; k++) {
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < n+1; j++) {
                    if(arr[i][j] > arr[i][k] + arr[k][j]) arr[i][j] = arr[i][k] + arr[k][j];
                }
            }
        }
        int max = 0;
        for (int i = 1; i < n+1; i++) {
            int tmp = 0;
            for (int j = 1; j < n+1; j++) {
                if(arr[i][j] <= m)tmp += items[j];
            }
//            sb.append(i).append(" = ").append(tmp).append("\n");
            max = Math.max(max, tmp);
        }
//
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 1; j < n+1; j++) {
//                sb.append(arr[i][j]).append(" ");
//            }
//            sb.append("\n");
//        }

        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }







}