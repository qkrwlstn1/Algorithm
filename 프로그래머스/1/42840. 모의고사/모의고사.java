class Solution {
    public int[] solution(int[] answers) {
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        int max = 0;
        int idxcnt=0;
        int su1cnt=0, su2cnt = 0, su3cnt = 0;
        for(int i=0;i<answers.length; i++) {
        	if(su1[i%5] == answers[i]) su1cnt++;
        	if(su2[i%8] == answers[i]) su2cnt++;
        	if(su3[i%10] == answers[i]) su3cnt++;
        }
        max = Math.max(su1cnt, su2cnt);
        max = Math.max(su3cnt, max);
        if(su1cnt == max) idxcnt++;
        if(su2cnt == max) idxcnt++;
        if(su3cnt == max) idxcnt++;
        
        
        if(idxcnt == 3) return new int[] {1,2,3};
        if(idxcnt == 2 && su1cnt!=max) return new int[] {2,3};
        if(idxcnt == 2 && su2cnt!=max) return new int[] {1,3};
        if(idxcnt == 2 && su3cnt!=max) return new int[] {1,2};
        if(su1cnt == max) return new int[] {1};
        if(su2cnt == max) return new int[] {2};
        else return new int[] {3};
        
    }
}