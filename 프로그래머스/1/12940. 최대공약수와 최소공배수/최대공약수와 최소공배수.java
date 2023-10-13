class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        int max = Math.max(m, n);
        System.out.println("min = "+min+" max = "+ max);
        int minTmp = min;
        int maxCnt = 1;
        while(minTmp !=0) {
        	if(max % minTmp ==0 && min % minTmp ==0) {
        		answer[0] = minTmp;
        		break;
        	}
        	minTmp--;
        }
        while(true) {
        	if((max*maxCnt) % min ==0) {
        		answer[1] = max*maxCnt;
        		break;
        	}
        	maxCnt++;
        }
        
        
        
        return answer;
    }
}