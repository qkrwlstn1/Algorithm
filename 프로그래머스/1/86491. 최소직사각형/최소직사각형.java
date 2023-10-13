class Solution {
    public int solution(int[][] sizes) {
		int maxSize = 0, minSize = 0;
		
		for(int i = 0; i<sizes.length; i++) {
			maxSize = Math.max(Math.max(sizes[i][0], sizes[i][1]), maxSize);
			minSize = Math.max(Math.min(sizes[i][0], sizes[i][1]), minSize);
		}
		
		
		
        
        return maxSize * minSize;
    }
}