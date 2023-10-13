class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        boolean[][] isGo = new boolean[park.length][park[0].length()];
        for(int i=0; i<park.length; i++) {
        	for(int j=0; j<park[i].length(); j++) {
        		if(park[i].charAt(j) == 'O') isGo[i][j] = true;
        		else if(park[i].charAt(j) == 'S') {
        			isGo[i][j] = true;
        			answer[0] = i;
        			answer[1] = j;
        		}
        	}
        }
        
        
        int temp;
        for(int i=0; i<routes.length; i++) {
        	temp = Integer.parseInt(routes[i].substring(routes[0].length()-1));
        	switch (routes[i].charAt(0)) {
			case 'S':
				if(answer[0] + temp >=park.length) break;
				for(int j=1; j<=temp; j++) {
					if(!isGo[answer[0]+j][answer[1]]) temp = 0;
				}
				answer[0] += temp;
				break;
			case 'N':
				if(answer[0] - temp < 0) break;
				for(int j=1; j<=temp; j++) {
					if(!isGo[answer[0]-j][answer[1]]) temp =0;
				}
				answer[0] -= temp;
				break;
			case 'E':
				if(answer[1] + temp >=park[0].length()) break;
				for(int j=1; j<=temp; j++) {
					if(!isGo[answer[0]][answer[1]+j]) temp = 0;
				}
				answer[1] += temp;
				break;
			case 'W':
				if(answer[1] - temp < 0) break;
				for(int j=1; j<=temp; j++) {
					if(!isGo[answer[0]][answer[1]-j]) temp =0;
				}
				answer[1] -= temp;
				break;

			default:
				break;
			}
        		
        	
        }
        return answer;
    }
}