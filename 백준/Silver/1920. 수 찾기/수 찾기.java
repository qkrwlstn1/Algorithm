import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, String> has = new HashMap<>();
		int loop = sc.nextInt();
		int[] numbers = new int[loop];
		
		for(int i=0; i<loop; i++) {
			numbers[i] = sc.nextInt();
		}
		Arrays.sort(numbers);
		
		loop = sc.nextInt();
		StringBuilder print = new StringBuilder();
		for(int i=0; i<loop;i++) {
			print.append(binarySearch(numbers, sc.nextInt())).append("\n");
		}
		System.out.println(print);
		
		
	}
	static int binarySearch(int[] arr, int key) {
		int row = 0;
		int high = arr.length-1;
		int mid;
		while(high >= row) {
			mid = (row + high) / 2;
			if(arr[mid] > key) high = mid-1;
			else if(arr[mid] < key) row = mid+1;
			else return 1;
		}
		return 0;
	}
		
}
