

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max=0;
        int answer=0;
        int lanCnt=0;
        int min = MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = parseInt(st.nextToken()); // 가진 랜선
        int n = parseInt(st.nextToken()); // 필요한 랜선
        int[] arr = new int[k];
        for(int i=0; i<k;i++){
            arr[i] = parseInt(br.readLine());
        }

        long low = 1;
        long high = MAX_VALUE;
        long mid;
        while(low<=high){
            lanCnt = 0;
            mid = (high + low) /2;
            for(int i=0; i<k; i++){
                lanCnt += arr[i] / mid;
                if(lanCnt >= n) break;
            }
            if(n > lanCnt) high = mid-1;
            else  low = mid+1;


        }
        if(low == 2147483647 || low ==1) bw.append(low+"");
        else bw.append(--low+"");




        bw.flush();
        bw.close();
        br.close();
    }


}
