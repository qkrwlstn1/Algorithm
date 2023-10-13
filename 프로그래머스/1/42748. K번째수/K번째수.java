
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        int[] temp;
	        for(int i =0; i<commands.length; i++) {
	        	temp = new int[commands[i][1]- commands[i][0] +1];
	        	temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	        	Arrays.sort(temp);
	        	answer[i] = temp[commands[i][2]-1];
	        }//end i
	        
	        return answer;
	    }
}