import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] a,b;
    static TreeSet<Integer> set = new TreeSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        a = new int[n];
        b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);


        for (int i = 0; i < n; i++) {
            bs(a[i]);
        }
        sb.append(set.size());
        if(!set.isEmpty()) {
            sb.append("\n");
            for (Integer i : set) {
                sb.append(i).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static void bs(int target){
        int left = 0;
        int right = m-1;
        while(left <= right){
            int mid = (int)(left + right) / 2;
            if(target == b[mid]) {
                return;
            }
            else if(target < b[mid]){right = mid-1;}
            else left = mid+1;
        }
        set.add(target);
    }




}