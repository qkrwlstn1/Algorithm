

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static int[][] paper;

    static int blue = 0, white = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        TreeSet<Integer> ts = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            arr[i] = num;
            ts.add(num);

        }
        int cnt=0;

        for (Integer t : ts) {
            map.put(t,cnt++);
        }

        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }


        bw.append(sb);
        br.close();
        bw.close();

    }


}
