import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[50001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        arr[0] = 0;
        arr[1] = 1;
        dp(n);
        bw.append(arr[n] +"");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dp(int num){
        for (int i = 2; i <= num; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min,arr[i - j*j]);
            }
            arr[i] = min+1;
        }

    }




}