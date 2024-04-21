
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
        int max = MIN_VALUE;
        int tmp = 0;
        int y = 0,x = 0;
        StringTokenizer st;
        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                int num = parseInt(st.nextToken());
                if(num > max){
                    tmp = max;
                    max = num;
                    num = tmp;
                    y = i;
                    x = j;
                }
            }
        }


        bw.append(max +"\n");
        bw.append(y +" " + x);
        bw.close();
        br.close();
    }





}