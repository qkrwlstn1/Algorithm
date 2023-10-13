class Solution {
    public int solution(int n) {
		int answer = 0;
		boolean[] sosu = new boolean[1000001];
		for(int i=2; i<1000001; i++) {
			if(!sosu[i]) {
				for(int j=i+i; j<1000001; j +=i) {
					sosu[j] = true;
				}
			}
		}
		for(int i=2; i<=n; i++) {
			if(!sosu[i]) answer++;
		}
        return answer;
    }
}