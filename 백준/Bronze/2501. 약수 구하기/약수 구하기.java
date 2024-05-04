
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken())-1;
        int answer = 0;
        int cnt=0;
        for (int i = 1; i <= A; i++) {
            if(A % i == 0){
                if(cnt == B){
                    answer =i;
                    break;
                }else cnt++;
            }
        }

        bw.append(answer + "");

        bw.close();
        br.close();
    }

}