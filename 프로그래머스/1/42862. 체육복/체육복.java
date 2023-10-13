class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] std = new int[n];
        for(int i=0; i<std.length; i++) {
        	std[i] = 1;
        }
        
        //일어버린사람
        for(int i : lost) std[i-1]--;
        //2개 있는 사람
        for(int i : reserve) std[i-1]++;
        for(int i=0; i<n-1; i++) {
        	if(std[i] == 0 &&std[i+1] ==2 || std[i] ==2 && std[i+1] ==0) {
        		std[i] =1;
        		std[i+1] = 1;
        	}
        }
        for(int i : std) if(i > 0) answer++;
        		
        return answer;
    }
}