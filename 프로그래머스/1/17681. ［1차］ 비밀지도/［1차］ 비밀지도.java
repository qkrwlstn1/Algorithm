class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean[][] overlap = new boolean[n][n];
        String toBinary = "";
        int gap = 0;
        for(int i = 0; i<n; i++) {
        	toBinary = Integer.toBinaryString(arr1[i]);
        	gap = n-toBinary.length();
        	for(int j=0; j<toBinary.length(); j++) {
        		if(toBinary.charAt(j) == '1') overlap[i][j+gap] = true;
        	}
        }
        for(int i = 0; i<n; i++) {
        	toBinary = Integer.toBinaryString(arr2[i]);
        	gap = n-toBinary.length();
        	for(int j=0; j<toBinary.length(); j++) {
        		if(toBinary.charAt(j) == '1') overlap[i][j+gap] = true;
        	}
        }
        for(int i = 0; i<n; i++) {
            answer[i] = "";
        	for(int j = 0; j<n; j++) {
        		answer[i] += overlap[i][j] ? "#" : " ";
        	}
        }

        
        return answer;
    }
}