class Solution {
    public int solution(int n, int m, int[] section) {
	    	int currentPosition = section[0]+m;
	    	int answer = 1;
	    	
	    	for(int i : section) {
	    		
	    		if(currentPosition <= i && currentPosition <= section[section.length-1]) {
	    			currentPosition = i += m;
	    			answer++;
	    		}
	    		else continue;
	    	}
	    		
	        return answer;
	    }
}