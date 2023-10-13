class Solution {
    public int solution(int[] number) {
		int answer = 0;
		int cycle = number.length;
		for(int i =0; i<cycle-2; i++) {
			for(int j=i+1; j<cycle-1; j++) {
				for(int q=j+1; q<cycle; q++) {
				if(number[i] +number[j]+number[q] == 0) answer++;	
				}//q end
			}//j end
		}// i end
        return answer;
    }
}