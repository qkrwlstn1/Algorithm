import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int nowPrice, idx=0, target=0;
        long total = 0L;
        int[] price = new int[n];
        int[] distance = new int[n-1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        while (idx != n-1) {
            for (int i = idx+1; i < n; i++) {
                if(price[i] <= price[idx]) {
                    target = i;
                    break;
                }
            }
            int tmp =0;
            for (int i = idx; i < target; i++) {
                total += (long) price[idx] * distance[i];
            }
            idx = target;
        }


        bw.append(total+"");
        bw.flush();
        bw.close();
        br.close();

    }


}