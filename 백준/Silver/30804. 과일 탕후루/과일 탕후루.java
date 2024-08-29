

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static int[][] paper;

    static int blue = 0, white = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr= new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start=0, end =0;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        while(end <= n &&!(map.size() <= 2  && end == n)){
            if(map.size() > 2){

                if(map.put(arr[start], map.get(arr[start])-1) == 1) map.remove(arr[start]);

                start++;
            }else{
                if(map.containsKey(arr[end])){
                    map.put(arr[end], map.get(arr[end])+1);
                }else{
                    map.put(arr[end], 1);
                }
                end++;
            }
            if(map.size() < 3) ans = Math.max(ans, end-start);;


        }
        sb.append(ans);
        bw.append(sb);
        br.close();
        bw.close();

    }


}
