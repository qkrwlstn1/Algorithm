class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powerCnt = powerSize(number);
        for(int i : powerCnt) {
        	if(i > limit) answer +=power;
        	else answer += i;
        }
        return answer;
    }
	
	static int[] powerSize(int last) {
		int[] powers = new int[last];
		int cnt=0;
		for(int i=1; i<=last; i++) {
			cnt=0;
			for(int j=1; j*j<=i; j++) {
				if(i%j == 0) {
					cnt++;
					if(j*j < i) cnt++;
				}
				powers[i-1] = cnt;
			}
		}
		
		
		return powers;
	}
}