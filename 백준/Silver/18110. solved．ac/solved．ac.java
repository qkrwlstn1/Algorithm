
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int limit = (int) Math.round(n * 0.15);
        if(n == 0 ){
            System.out.println(0);
            return;
        }
        double tmp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = limit; i < n-limit; i++) {
            tmp += arr[i];
        }


        if(tmp == 0){
            System.out.println("0");
            return;
        }
        else{
            bw.append(Math.round(tmp/(n-limit*2))+"");
        }

        bw.close();
        br.close();
    }


}