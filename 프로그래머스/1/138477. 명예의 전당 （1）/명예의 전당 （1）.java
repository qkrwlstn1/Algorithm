import java.util.PriorityQueue;
import java.util.Stack;

class Solution {
	public int[] solution(int k, int[] score) {
		PriorityQueue<Integer> highScore = new PriorityQueue<>();
		int[] answer = new int[score.length];
		for(int i =0; i<score.length; i++) {
			highScore.add(score[i]);
			if(highScore.size() >k) {
				highScore.remove();
			}
			answer[i] = highScore.peek();
		}
		
        
        return answer;
    }
}