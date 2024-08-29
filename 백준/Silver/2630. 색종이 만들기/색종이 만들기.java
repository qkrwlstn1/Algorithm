

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

        int t = Integer.parseInt(st.nextToken());
        paper = new int[t][t];

        for (int i = 0; i < t; i++) {
            st =  new StringTokenizer(br.readLine());
            for (int j = 0; j < t; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp(0, 0, t);
        sb.append(white).append("\n").append(blue);
        bw.append(sb);
        br.close();
        bw.close();

    }

    static void dp(int y, int x, int size){
        boolean isSquare = true;
        for (int i = y; i < y+size; i++) {
            for (int j = x; j < x+size; j++) {
                if(paper[y][x] != paper[i][j]){
                    isSquare = false;
                    break;
                }
            }
        }

        if(isSquare) {
            if (paper[y][x] == 1) blue++;
            else white++;
        }else{
            dp(y, x, size/2); //1사분면
            dp(y,x + (size / 2), size/2);
            dp(y + (size / 2),x , size/2);
            dp(y + (size / 2),x + (size / 2), size/2);

        }
    }

}
