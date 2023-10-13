import java.util.Arrays;
import java.util.Vector;
class Solution {
    
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Vector<Integer> answerTmp = new Vector<>();
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0) answerTmp.add(arr[i]);
        }
        if(answerTmp.size() == 0) return new int[] {-1};
        answer = new int[answerTmp.size()];
        for(int i=0; i<answerTmp.size();i++) {
        	answer[i] = answerTmp.get(i);
        }
        return answer;
    }
}