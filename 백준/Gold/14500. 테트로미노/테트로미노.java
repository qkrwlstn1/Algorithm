

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int startX, startY;
    static int[][] arr;
    static int x, y, max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb= new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        y  = Integer.parseInt(st.nextToken());
        x  = Integer.parseInt(st.nextToken());
        arr = new int[y][x];
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                startX = j;
                startY = i;
                dfs(1,0,new int[] {i,j}, arr[i][j], i+"",j+"");
            }
        }




        bw.append(""+max);
        bw.flush();
        bw.close();
        br.close();

    }
    static void dfs(int depth, int prev, int[] now, int num, String sy, String sx){
        switch (prev){
            case 0 :
                prev=1;
                break;
            case 1 :
                prev=0;
                break;
            case 2:
                prev = 3;
                break;
            case 3 :
                prev = 2;
        }
        if(depth == 4){
            max = Math.max(max, num);
//            System.out.println("sy = " + sy);
//            System.out.println("sx = " + sx);
//            System.out.println("num = " + num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if(prev == i) continue;
            int nowY = now[0] + dy[i];
            int nowX = now[1] + dx[i];

            if(check(nowX, nowY)){
                dfs(depth+1, i, new int[] {nowY, nowX}, arr[nowY][nowX] + num, sy+nowY, sx+ nowX);
            }
        }
        if(depth == 2){
            for (int i = 0; i < 4; i++) {
                for (int j = i+1; j < 4; j++) {
                    if(i != prev || j != prev){
                        int iy = now[0] + dy[i];
                        int ix = now[1] + dx[i];
                        int jy = now[0] + dy[j];
                        int jx = now[1] + dx[j];
                        if (check(ix,iy) && check(jx, jy) &(startX != ix || startY != iy ) & (startX !=jx || startY !=jy)) {
//                            System.out.println("sy = " + sy+iy+jy);
//                            System.out.println("sx = " + sx+ix+jx);
                            max = Math.max(max, num+arr[iy][ix] + arr[jy][jx]);
//                            System.out.println("max = " + max);
                        };
                    }
                }
            }
        }


    }

    static boolean check(int nowX, int nowY){
        return nowX >= 0 && nowX < x && nowY >= 0 && nowY < y;
    }
}
