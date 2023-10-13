
import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> pang = new ArrayList<>();
        
        for(int i : moves) {
        	i -=1;
        	for(int j=0; j<board.length; j++) {
        		if(board[j][i] != 0) {
        			pang.add(board[j][i]);
        			board[j][i] = 0;
        			if(pang.size() >= 2 && pang.get(pang.size()-1) == pang.get(pang.size()-2)) {
        				
        				pang.remove(pang.size()-1);
        				pang.remove(pang.size()-1);
        				answer++;
                        answer++;
        			}
        			break;
        		}
        	} //End j for
        }//End i for 
        return answer;
    }
}