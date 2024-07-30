import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N, R, C, answer=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = (int) Math.pow(2,Integer.parseInt(st.nextToken()));
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        find(0,0,N);

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();

    }

    static void find(int r, int c,int size){
        if(size==1){
            System.out.println(answer);
            return;
        }
        int newSize = size/2;

        if(R < r+newSize && C < c+newSize){
            find(r, c, newSize);
        }else if(R < r+newSize && C >= c+newSize){
            answer += newSize*newSize;
            find(r, c+newSize, newSize);
        }else if(R >= r+newSize && C < c+newSize){
            answer += newSize*newSize*2;
            find(r+newSize, c, newSize);
        }else{
            answer += newSize*newSize*3;
            find(r+newSize, c+newSize, newSize);
        }




    }



}