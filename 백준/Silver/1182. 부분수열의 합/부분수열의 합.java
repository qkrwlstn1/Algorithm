
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
        static int answer = 0;
        static int n, s;
        static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = parseInt(st.nextToken());
        s = parseInt(st.nextToken());
        arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = parseInt(st.nextToken());
        }
        dfs(0,0);
        if(s == 0) answer--;
        bw.append(answer +"");
        bw.close();
        br.close();
    }

    static void dfs(int index, int sum){
        if(sum == s && index == n) answer++;
        if(index == n) return;
        dfs(index+1, sum);
        dfs(index+1, sum + arr[index]);
    }



}