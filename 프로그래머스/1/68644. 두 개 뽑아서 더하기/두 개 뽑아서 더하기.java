class Solution {
    public int[] solution(int[] numbers) {
        boolean[] jungbok = new boolean[200];
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		jungbok[numbers[i]+numbers[j]] = true;
        	}
        }
        int len =0;
        for(boolean a : jungbok) {
        	if(a)len++;
        }
		int[] answer = new int[len];
		int cnt = 0;
		for(int i=0; i<200; i++) {
			if(jungbok[i]) {
				answer[cnt++] = i;
			}
		}
        return answer;
    }
}