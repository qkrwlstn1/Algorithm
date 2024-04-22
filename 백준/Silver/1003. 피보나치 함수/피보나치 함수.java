
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

        static Map<Integer,Long[]> dp = new HashMap<>();
        static Map<Long, Boolean> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dp.put(0,new Long[]{1L,0L});
        dp.put(1,new Long[]{0L,1L});
        Long num1;
        Long num2;
        for (int i = 2; i < 41; i++) {
            num1 = dp.get(i-1)[0] + dp.get(i-2)[0];
            num2 = dp.get(i-1)[1] + dp.get(i-2)[1];
            dp.put(i,new Long[]{num1, num2});
        }
        int n = parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int input = parseInt(br.readLine());
            bw.append(dp.get(input)[0] +" " + dp.get(input)[1] +"\n");
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