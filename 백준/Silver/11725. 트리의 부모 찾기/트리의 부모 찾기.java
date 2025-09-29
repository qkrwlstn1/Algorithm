
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
    static Map<Integer,List<Integer>> map;
    static int[] parentList;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =parseInt(br.readLine());
        StringTokenizer st;
        map = new HashMap<>();
        int nodeA, nodeB;
        parentList = new int[n+1];
        visit =new boolean[n+1];
        List<Integer> tmp;
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            nodeA = parseInt(st.nextToken());
            nodeB = parseInt(st.nextToken());

            tmp = map.getOrDefault(nodeA , new ArrayList<>());
            tmp.add(nodeB);
            map.put(nodeA, tmp);

            tmp = map.getOrDefault(nodeB , new ArrayList<>());
            tmp.add(nodeA);
            map.put(nodeB, tmp);

        }
        findParent(1);
        for (int i = 2; i < n+1; i++) {
            bw.append(parentList[i] +"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    static void findParent(int target){
        if(visit[target]) return;
        visit[target] =true;
        for (Integer i : map.get(target)) {
            if(parentList[i] == 0)parentList[i] = target;
            findParent(i);
        }


    }

}
