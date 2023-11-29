import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = Integer.parseInt(br.readLine());
		int arr[] = new int[length];
		int answer =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		arr = mergeSort(arr);
		for(int i = 0; i<length; i++) {
			
			answer += arr[i] * (length - i);
		}
		bw.append(answer+"");
		bw.flush();
		br.close();
		bw.close();
		
		
	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length < 2) return arr;
		
		int mid = arr.length/2;
		int[] lowArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] highArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		int[] mergeArr = new int[arr.length];
		int l = 0, m = 0, h = 0;
		while(l <lowArr.length && h < highArr.length) {
			if(lowArr[l] < highArr[h]) mergeArr[m++] = lowArr[l++];
			else mergeArr[m++] = highArr[h++];
		}
		while(l<lowArr.length) {
			mergeArr[m++] = lowArr[l++];
		}
		while(h<highArr.length) {
			mergeArr[m++] = highArr[h++];
		}
		return mergeArr;
	}
		
}