
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(br.readLine());
        StringBuilder sb;
        int total;
        while(n != -1){
            sb = new StringBuilder();
            sb.append(n +" = 1");
            total = 1;
            for (int i = 2; i < (n/2)+1; i++) {
                if(n % i == 0){
                    sb.append(" + "+i);
                    total += i;
                }
            }
            if(total == n) bw.append(sb).append("\n");
            else bw.append(n+" is NOT perfect.\n");
            n = parseInt(br.readLine());
        }



        bw.close();
        br.close();
    }

}