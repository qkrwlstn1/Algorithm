
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
        Map<Character, Integer> map = new HashMap<>();
        int y = 0,x = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = parseInt(st.nextToken());
        if(b == 10){
            bw.append(n+"");
            bw.close();
            br.close();
            return;
        }else{
            for (int i = 0; i < 10; i++) {
                map.put((char) (i+'0'),i);
            }
            for (int i = 0; i < 26; i++) {
                map.put((char) ('A'+i),i+10);
            }
            int index= 1;
            for(int i = n.length()-1; i >=0; i--){
                answer += index * map.get(n.charAt(i));
                index *= b;
            }
        }
        
        



        bw.append(answer + "");
        bw.close();
        br.close();
    }





}