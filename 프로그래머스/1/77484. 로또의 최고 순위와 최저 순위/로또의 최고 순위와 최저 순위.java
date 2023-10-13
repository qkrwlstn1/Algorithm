class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero =0, same = 7;
        
        for(int i=0; i<lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zero++;
        		continue;
        	}
        	for(int j=0; j<win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			win_nums[j] = 0;
        			same--;
        		}
        	}
        }
        if(same == 7) {
        	if(zero >1) {
        		return new int[] {7-zero,6};
        	}
        	
        	return new int[] {6,6};
        }
        
		
		
        return new int[] {same-zero,same};
    }
}