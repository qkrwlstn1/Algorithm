import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static List<int[]> house = new ArrayList<>();
    static List<int[]> chicken = new ArrayList<>();
    static boolean[][] visit;
    static int[][] chickenDistance;
    static int n, m;
    static long minCD;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        minCD = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                switch (st.nextToken()){
                    case "1":
                        house.add(new int[] {i, j});
                        break;
                    case "2":
                        chicken.add(new int[] {i, j});
                        break;
                }
            }
        }

        int chickenCnt = chicken.size();
        chickenDistance = new int[chickenCnt][house.size()];
        init();




        if(m == 1){

            for (int i = 0; i < chickenCnt; i++) {
                int tmp = 0;
                for (int j = 0; j < house.size(); j++) {
                    tmp += chickenDistance[i][j];
                }
                minCD = Math.min(minCD, tmp);
            }
        }else {
            for (int i = 0; i <= chickenCnt - m; i++) {
                for (int j = i+1; j <= (chickenCnt - m)+1; j++) {
                    dfs(m-1, chickenDistance[i].clone(), j);
                }


            }
            ;
        }
//        for (int i = 0; i < chicken.size(); i++) {
//            for (int j = 0; j < house.size(); j++) {
//                System.out.print(chickenDistance[i][j] + " ");
//            }
//            System.out.println();
//        }


        bw.append(minCD+"");
        bw.flush();
        bw.close();
    }

    static void init(){
        for (int i = 0; i < chicken.size(); i++) {
            for (int j = 0; j < house.size(); j++) {
                chickenDistance[i][j] = Math.abs(chicken.get(i)[0] - house.get(j)[0]) + Math.abs(chicken.get(i)[1] - house.get(j)[1]);
            }
        }
    }

    static void dfs(int depth, int[] distance, int idx){

        if(depth == 0) return;
        int tmp = 0;
        for (int i = 0; i < distance.length; i++) {
            int num = chickenDistance[idx][i];
            distance[i] = Math.min(distance[i], num);
            tmp += distance[i];
        }
        minCD = Math.min(tmp, minCD);
        for (int i = 1; idx + i < chicken.size(); i++) {
            dfs(depth-1, distance.clone(), idx+i);
        }

    }

}