import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        sb.append(bfs(Integer.parseInt(br.readLine())));

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int target){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{target,0});

        while(!q.isEmpty()){
            int[] tmp = q.poll();
            if(tmp[0] == 1){return tmp[1];}

            if(tmp[0] % 2 == 0){ q.addLast(new int[] {tmp[0]/2,tmp[1]+1});}
            if(tmp[0] % 3 == 0){ q.offerLast(new int[] {tmp[0]/3,tmp[1]+1});}
            q.addLast(new int[] {tmp[0]-1,tmp[1]+1});

        }
        return 0;
    }

}