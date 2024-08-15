import java.io.*;
import java.util.*;

public class Main {
    static int ans = Integer.MAX_VALUE;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < n; i++) {
            int r = arr[i][0];
            int g = arr[i][1];
            int b = arr[i][2];

            arr[i][0] = r + Math.min(arr[i-1][1], arr[i-1][2]);
            arr[i][1] = g + Math.min(arr[i-1][0], arr[i-1][2]);
            arr[i][2] = b + Math.min(arr[i-1][0], arr[i-1][1]);


        }
//        System.out.println("arr[n-1][0] = " + arr[n - 1][0]);
//        System.out.println("arr[n-1][1] = " + arr[n-1][1]);
//        System.out.println("arr[n-1][2] = " + arr[n-1][2]);

        bw.append((Math.min(arr[n-1][0], Math.min(arr[n-1][1], arr[n-1][2])))+"");
        bw.flush();
        bw.close();
        br.close();
    }





}