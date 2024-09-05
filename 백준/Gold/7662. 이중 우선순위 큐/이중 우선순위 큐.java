import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();



    static int n,t;
    static int[][] arr;
    static Map<Integer, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            map = new HashMap<>();
            PriorityQueue<Integer> minQ = new PriorityQueue<>();
            PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < t; j++) {
                st = new StringTokenizer(br.readLine());
                char ch = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());

                if(ch == 'I'){
                    minQ.add(num);
                    maxQ.add(num);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }else{
                    if(num == -1) remove(minQ);
                    else remove(maxQ);
                }

            }
            if(map.isEmpty()) sb.append("EMPTY");
            else {
                while(!maxQ.isEmpty()){
                    int num = maxQ.poll();
                    if(map.containsKey(num)){
                        sb.append(num).append(" ");
                        break;
                    }
                }
                while(!minQ.isEmpty()){
                    int num = minQ.poll();
                    if(map.containsKey(num)){
                        sb.append(num);
                        break;
                    }
                }
            }
            sb.append('\n');
        }


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static void remove(Queue<Integer> q){
        while(!map.isEmpty()){

            int num = q.poll();
            if(map.containsKey(num)){
                map.put(num, map.get(num) - 1);
                if(map.get(num) == 0) {map.remove(num);}

                break;
            }
        }
    }




}