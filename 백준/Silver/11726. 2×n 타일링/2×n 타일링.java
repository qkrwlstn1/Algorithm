import java.io.*;

public class Main {

    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n= Integer.parseInt(br.readLine());
        arr = new int[Math.max(n+1,3)];
        arr[1] = 1;
        arr[2] = 2;

        sb.append(dp(n));
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();

    }

    static int dp(int target){
        if(arr[target] != 0){
            return arr[target];
        }
        return arr[target] = (dp(target-1) + dp(target-2))%10007;
    }



}