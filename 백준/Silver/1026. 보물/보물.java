import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int loop = Integer.parseInt(br.readLine());
		int arr1[] = new int[loop];
		Integer arr2[] = new Integer[loop];
		int total = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<loop; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<loop; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		for(int i=0; i<loop; i++) {
			total += arr1[i] * arr2[i];
		}
		
		bw.write(total+"");
		bw.close();
		br.close();
	}
		
}
