

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
        remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
        check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
        toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
        all: S를 {1, 2, ..., 20} 으로 바꾼다.
        empty: S를 공집합으로 바꾼다.
         */
        StringBuilder sb= new StringBuilder();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i = 1; i<21; i++){
            map.put(i, false);
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            switch (str[0]){
                case "add":
                    map.put(Integer.parseInt(str[1]), true);
                    break;
                case "remove":
                    map.put(Integer.parseInt(str[1]), false);
                    break;
                case "check":
                    sb.append(map.get(Integer.parseInt(str[1]))? 1 : 0).append("\n");
                    break;
                case "toggle":
                    int num = Integer.parseInt(str[1]);
                    map.put(num, !map.get(num));
                    break;
                case "all":
                    for(int j = 1; j<21; j++){
                        map.put(j, true);
                    }
                    break;
                case "empty":
                    for(int j = 1; j<21; j++){
                        map.put(j, false);
                    }
                    break;
            }
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();

    }

}
