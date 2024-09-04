

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static boolean[] graph = new boolean[100001];
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new HashMap<>();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
        
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] =a;
            arr[i][1] =b;
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[0] == o1[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });
        int r = -1;
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(r <= arr[i][0]){
                cnt++;
                r = arr[i][1];
            }else{
                if(arr[i][1] < r){
                    r = arr[i][1];
                }
            }

        }

        bw.append(cnt+"");
        br.close();
        bw.close();

    }


}
