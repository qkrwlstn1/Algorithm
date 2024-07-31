import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Set<Integer[]> set = new HashSet<>();
    static int n;
    static int m;
    static int[][] cheese;
    static boolean[][] initVisit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        cheese = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                cheese[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        initVisit = new boolean[n][m];
        init(0,0);
        boolean allThree = false;
        int answer = 0;
        int cnt;
        do {
            answer++;
            allThree = false;
            for (int i = 0; i <n; i++) {

                for (int j = 0; j < m; j++) {
                    cnt = 0;
                    if(cheese[i][j] == 1) {
                        allThree = true;
                        if (cheese[i-1][j] == 2)cnt++;
                        if (cheese[i+1][j] == 2)cnt++;
                        if (cheese[i][j-1] == 2)cnt++;
                        if (cheese[i][j+1] == 2)cnt++;
                        if (cnt >= 2) set.add(new Integer[]{i,j});
                    }
                }
            }
//            //---test
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    System.out.print(cheese[i][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("----------------------");
//            //---test

            for (Integer[] integers : set) {
                cheese[integers[0]][integers[1]] = 2;
            }
            set = new HashSet<>();
            initVisit = new boolean[n][m];
            init(0,0);
        }while (allThree);

        bw.append(--answer+"");
        bw.flush();
        bw.close();
        br.close();

    }


    static void init(int x, int y){
        initVisit[x][y] = true;
        cheese[x][y] = 2;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(initCheck(newX, newY)) init(newX, newY);
        }
    }

    static boolean initCheck(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m && !initVisit[x][y] && cheese[x][y] != 1;
    }

}