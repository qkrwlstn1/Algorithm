import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int loop = Integer.parseInt(br.readLine());
		int max = 0;
		int[] arr = new int[loop];
		for(int i=0; i<loop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<loop; i++) {
			max = Math.max(max, arr[i] * (loop-i));
		}
		bw.write(max+"");
		bw.close();
		br.close();
	}
		
}
