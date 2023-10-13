class Solution {
    public String solution(String s) {
        String[] sNum= s.split(" ");
        int max = Integer.parseInt(sNum[0]);
        int min = Integer.parseInt(sNum[0]);
        int temp;
        for(String num : sNum) {
        	temp = Integer.parseInt(num);
        	max = Math.max(max, temp);
        	min = Math.min(min, temp);
        }
        return min + " " + max;
    }

}