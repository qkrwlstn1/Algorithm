import java.io.*;
import java.util.*;

public class Main {
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(dp(a,b));
        bw.flush();
        bw.close();
        br.close();

    }

    static long dp(int a, int b){
        if(b == 1) return a % c;
        long num = dp(a , b/2);

        if(b % 2 == 1) return ((num * num % c) * a) % c;
        else return num * num % c;
    }

    


}