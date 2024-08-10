

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int total = 0;
        int min=4000, max = -4000,cnt=0;

        TreeSet<Integer> ts = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            total += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        sb.append(total != 0 ?Math.round((float) total /n) : 0).append("\n"); //산술평구ㅠㄴ
        Arrays.sort(arr);
        sb.append(arr[arr.length/2]).append("\n");//중앙값
        for (Integer i : map.keySet()) {
            cnt = Math.max(cnt,map.get(i));
        }

        for (Integer i : map.keySet()) {
            if(map.get(i) == cnt){
                ts.add(i);
            }
        }
        int answer =ts.pollFirst();
        if(!ts.isEmpty()) answer = ts.pollFirst();
        sb.append(answer).append("\n").append(max-min);




        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
