import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static Long x, y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Long.parseLong(st.nextToken());
        y = Long.parseLong(st.nextToken());
        if(x<=y || (y*100) / x == 99) sb.append(-1);
        else sb.append(bs((y*100)/x));
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static long bs(long target){
        long left = 0;
        long right = x;
        while(left <= right){
            long mid = (right + left)/2;
            if((y+mid)*100 /(x+mid) == target) left = mid + 1;
            else right = mid - 1;

        }

        return left;
    }




}