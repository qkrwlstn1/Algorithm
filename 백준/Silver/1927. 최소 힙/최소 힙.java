import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static TreeSet<Integer> ts = new TreeSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                sb.append(pq.isEmpty() ? "0" : pq.poll()).append("\n");
            }
            else pq.add(num);
        }





        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }




}