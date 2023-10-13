class Solution {
    public int solution(int[] d, int budget) {
        int[] sup = new int[100001];
        int answer = 0;
        for(int i : d) {
        	sup[i]++;
        }
        loop:for(int i=1; i<100001; i++) {
        	for(int j=0;j<sup[i]; j++) {
        		if(budget-i >=0) {
        			budget -= i;
        			answer++;
        		}else {
        			break loop;
        		}
        	}
        }
        return answer;
    }
}