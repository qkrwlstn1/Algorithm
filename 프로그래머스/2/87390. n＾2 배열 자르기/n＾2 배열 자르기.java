class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right -left)+1];
        for(int i=0; i < answer.length; i++) {
        	answer[i] = (int)(left/n) > (int)(left%n) ? (int)(left/n) +1 : (int)(left%n) +1;
        	left++;
        }
        return answer;
    }
}