import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[][][] dp; // Y X D
    static int[][] party;
    static boolean[][] graph;
    static boolean[] visit;
    static int n;
    static Queue<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        party = new int[m][];
        visit = new boolean[n+1];
        graph = new boolean[n+1][n+1];

        st = new StringTokenizer(br.readLine());

        int tmp = Integer.parseInt(st.nextToken());
        if(tmp == 0){ // 거짓말을 아는 사람이 없으면 파티마다 다 해도 됨
            System.out.println(m);
            return;
        }

        for (int i = 0; i < tmp; i++) {
            int tmp1 =Integer.parseInt(st.nextToken());
            visit[tmp1] = true;
            q.add(tmp1);
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = Integer.parseInt(st.nextToken());
            party[i] = new int[tmp];
            for (int j = 0; j < tmp; j++) {
                party[i][j] = Integer.parseInt(st.nextToken());
                for (int k = j; k > 0; k--) {
                    graph[party[i][j]][party[i][j-1]] = true;
                    graph[party[i][j-1]][party[i][j]] = true;
                }
            }

        }

        while (!q.isEmpty()){
            int num = q.poll();
            for (int i = 1; i <= n; i++) {
                if(!visit[i] && graph[num][i]){
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
        int answer = 0;

        for (int i = 0; i < m; i++) {
            boolean isLie = true;
            for (int j = 0; j < party[i].length; j++) {
                if(visit[party[i][j]]){
                    isLie = false;
                }
            }
            answer += isLie ? 1 : 0;
        }


        System.out.println(answer);

    }



}