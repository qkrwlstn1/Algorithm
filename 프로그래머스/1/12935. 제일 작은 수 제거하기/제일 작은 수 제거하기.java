import java.util.Arrays;
class Solution {
    int min =0;
	public int[] solution(int[] arr) {
        min = 999999;
		if(arr.length ==1)return new int[] {-1};
        for(int i : arr) {
        	min = Math.min(i, min);
        }
        
        return Arrays.stream(arr).filter(idx -> idx != min).toArray();
	}
}