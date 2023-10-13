class Solution {
    public int solution(int[] arr) {
		int max = arr[arr.length-1];
		int answer = 0;
		loop : while(true) {
			answer += max;
			for(int i=0; i<arr.length-1; i++) {
				if(answer % arr[i] != 0) continue loop;
			}
			return answer;
		}
		
		
    }
}