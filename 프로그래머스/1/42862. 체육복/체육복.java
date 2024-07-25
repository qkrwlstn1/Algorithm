import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer =0;
        boolean[] lend = new boolean[n+2];
        for (int i : reserve) {
            lend[i] = true;
        }
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i : lost) {
            if(lend[i]){
                answer++;
                lend[i] = false;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if(lend[lost[i]-1]){
                answer++;
                lend[lost[i]-1] = false;
            }else if(lend[lost[i]+1]){
                answer++;
                lend[lost[i]+1] = false;
            }
        }
        return n-(lost.length-answer);
    }
}
