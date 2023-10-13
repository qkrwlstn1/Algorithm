class Solution {
    public String solution(String[] survey, int[] choices) {
        /*    0  1
         * 0  R  T
         * 1  C  F
         * 2  J  M
         * 3  A  N
         * */
		int[][] temp = new int[4][2];
		int temp1;
		for(int i =0; i<choices.length; i++) {
			temp1 = choices[i]-4;
			if(choices[i] == 0) continue;
			if(temp1 < 0) {
				switch (survey[i].charAt(0)) {
				case 'R':
					temp[0][0] += temp1 *-1;
					break;
				
				case 'T':
					temp[0][1] +=temp1 *-1;
					break;
				
				case 'C':
					temp[1][0] +=temp1 *-1;
					break;

				case 'F':
					temp[1][1] +=temp1 *-1;
					break;
				case 'J':
					temp[2][0] +=temp1 *-1;
					break;
				
				case 'M':
					temp[2][1] +=temp1 *-1;
                        break;
				case 'A':
					temp[3][0] +=temp1 *-1;
					break;
				default:
					temp[3][1] +=temp1 *-1;
					break;
				}
			}else {
				switch (survey[i].charAt(1)) {
				case 'R':
					temp[0][0] +=temp1;
					break;
				
				case 'T':
					temp[0][1] +=temp1;
					break;
				
				case 'C':
					temp[1][0] +=temp1;
					break;

				case 'F':
					temp[1][1] +=temp1;
					break;
				case 'J':
					temp[2][0] +=temp1;
					break;
				
				case 'M':
					temp[2][1] +=temp1;
                        break;
				case 'A':
					temp[3][0] +=temp1;
					break;
				default:
					temp[3][1] +=temp1;
					break;
				}

			}
		
		}
		String answer = "";
		answer  += temp[0][0] >= temp[0][1] ? "R" : "T";
		answer  += temp[1][0] >= temp[1][1] ? "C" : "F";
		answer  += temp[2][0] >= temp[2][1] ? "J" : "M";
		answer  += temp[3][0] >= temp[3][1] ? "A" : "N";
		
        
        
        return answer;
    }
}