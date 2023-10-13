class Solution
{
    public int solution(int []A, int []B){
        int answer = 0;
        int[] Aarr = new int[1001]; 
        int[] Barr = new int[1001];
        for(int i=0; i<A.length; i++) {
        	Aarr[A[i]]++;
        	Barr[B[i]]++;
		}
        int Acnt=0,Bcnt=1000;
        
        for(int i=0; i<A.length; i++) {
        	while(Aarr[Acnt] == 0) {
        		Acnt++;
        	}
        	while(Barr[Bcnt] == 0) {
        		Bcnt--;
        	}
        	Aarr[Acnt]--;
        	Barr[Bcnt]--;
        	answer += Acnt * Bcnt;
        }
        return answer;
    }
}