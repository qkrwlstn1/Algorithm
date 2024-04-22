
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

        static Long n,m;
        static Map<Long, Boolean> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y = 0,x = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Long.parseLong(st.nextToken());
        m = Long.parseLong(st.nextToken());


        dp(n);
        if(map.getOrDefault(m,false)){
            bw.append("YES");
        }else{
            bw.append("NO");
        }

        bw.close();
        br.close();
    }

    static void dp(long num){
        if(num <= 0) return;
        if(map.getOrDefault(num,false)) return;
        map.put(num,true);

        dp(num/2);
        if(num % 2  == 1){
            dp((num /2)+1);
        }
    }



}