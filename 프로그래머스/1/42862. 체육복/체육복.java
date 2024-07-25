import java.util.Arrays;

public class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer =0;
        boolean[] lend = new boolean[n+2];
        for (int i : reserve) {
            lend[i] = true;
        }
        Arrays.sort(lost);

        for (int i = 0; i < lost.length; i++) {
            if(lend[lost[i]]){
                answer++;
                lend[lost[i]] = false;
                lost[i] = -1;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if(lost[i] == -1) continue;
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

    public static void main(String[] args) {
        int[] lost = new int[]{3,5};

        System.out.println(solution(5,new int[]{5,3}, new int[]{4,2}));
    }
}
