

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static boolean[] graph = new boolean[100001];
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o2) == Math.abs(o1)) return o1;
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(q.isEmpty()) sb.append("0\n");
                else sb.append(q.poll()).append("\n");
            }else{
                q.add(num);
            }
        }

        bw.append(sb);
        br.close();
        bw.close();

    }


}
