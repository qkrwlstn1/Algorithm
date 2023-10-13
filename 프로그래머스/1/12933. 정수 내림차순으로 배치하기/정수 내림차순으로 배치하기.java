class Solution {
    public long solution(long n) {
        long answer = 0;
        String StringN = Long.toString(n);
        int temp;
        int[] answerArr = new int[StringN.length()];
        for(int i = 0; i<StringN.length(); i++) {
        	answerArr[i] = (int)(n%10);
        	n /= 10;
        }
        for(int i=0;i<answerArr.length-1; i++) {
        	for(int j=i+1;j<answerArr.length;j++) {
        		if(answerArr[i] < answerArr[j]) {
        			temp = answerArr[i];
        			answerArr[i] = answerArr[j];
        			answerArr[j] = temp;
        		}
        	}
        }
        for(int i=0; i<answerArr.length; i++) {
        	answer = (answer*10) + answerArr[i];
        }
        return answer;
    }
}