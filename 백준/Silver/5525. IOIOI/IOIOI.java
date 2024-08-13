import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : arr) {
            deque.addLast(c);
        }
        int ans=0;
        while (!deque.isEmpty()) {
            int cnt = 1;
            if (deque.removeFirst() == 'I') {
                while (deque.size() > 1){
                    if(deque.getFirst() =='I') break;
                    if(deque.removeFirst() == 'O' && deque.removeFirst() == 'I'){
                        cnt++;
                    }else break;
                }
            }
            if(cnt > n) ans += cnt - n;
        }

        sb.append(ans);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }




}