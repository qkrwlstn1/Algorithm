import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static boolean[] visited = new boolean[150000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        sb.append(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static int bfs(int start, int target){

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[] {start, 0});
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            if(tmp[0] == target) return tmp[1];
            if(start < target && tmp[0] <75000 && !visited[tmp[0]*2]){
                q.addLast(new int[] {tmp[0]*2, tmp[1]});
                visited[tmp[0]*2] = true;
            }
            if(tmp[0] != 0 && !visited[tmp[0]-1]){
                q.addLast(new int[] {tmp[0]-1, tmp[1]+1});
                visited[tmp[0]-1] = true;
            }
            if(!visited[tmp[0]+1] && tmp[0] < target) {
                q.addLast(new int[]{tmp[0] + 1, tmp[1] + 1});
                visited[tmp[0] + 1] = true;
            }

            
        }

        return -1;
    }




}