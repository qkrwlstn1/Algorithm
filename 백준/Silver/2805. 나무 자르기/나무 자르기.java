import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int right = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, arr[i]);
        }
        Arrays.sort(arr);
        bw.append(bs(m, right)+"");

        bw.flush();
        bw.close();
        br.close();

    }

    static int bs(int target, int right) {
        int left = 0;
        int mid = right;

        while (left <= right) {
            mid = (left+right) / 2;
            Long wood = 0L;
            for (int i = 0; i < n; i++) {
                if (arr[i] - mid > 0) {
                    wood += arr[i]-mid;
                }
            }
            if (wood >= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

}