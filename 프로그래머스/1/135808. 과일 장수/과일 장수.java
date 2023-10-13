import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue<Integer> apples = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : score) {
        	apples.add(i);
        }
        int temp =0;
        while(true) {
        	
        	if(apples.size()>=m) {
        		for(int i=0; i<m;i++) {
        			temp= apples.poll();
        		}
        		answer += temp*m;
        	}else {
        		break;
        	}
        }
        
        return answer;
    }
}