class Solution {
    public int[] solution(String s) {
		if(s.length() == 1) return new int[] {0,0};
        int[] answer = new int[2];
        StringBuilder str = new StringBuilder();
        str.append(s);
        int delZero=0;
        int oneCnt=0;
        answer[0]++;
        for(char a : s.toCharArray()) {
        	if(a == '0') answer[1]++;
        	else delZero++;
        }
        
        while(delZero != 1) {
        	answer[0]++;
        	oneCnt=0;
        	while(delZero !=0) {
        		if(delZero % 2 == 1)oneCnt++;
        		else answer[1]++;
        		delZero /=2;
        	}
        	delZero = oneCnt;
        	
        }
        
        return answer;
    }
}