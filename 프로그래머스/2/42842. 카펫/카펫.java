class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1; i<=brown; i++) {
        	for(int j=1; j<=i; j++) {
        		if(i*j == yellow && 4+(i+j)*2 == brown) return new int[] {i+2,j+2};
        	}
        }
        return new int[] {0,0};
    }
}