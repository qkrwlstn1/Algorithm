import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dp(new StringBuilder(), m, 1);

        System.out.print(sb);
        br.close();
    }

    static void dp(StringBuilder dpSb, int depth, int num){
        for(int i = 0; i <= n-depth; i++){
            StringBuilder tmp = new StringBuilder().append(dpSb);
            tmp.append(i+num).append(" ");
            if(i+num > n){
             return;
            }else if(depth == 1){
                sb.append(tmp).append("\n");
            }else {
                dp(tmp, depth-1, num+i+1);
            }
        }
    }




}