class Solution {
    public int solution(int n) {
        char[] binary = Integer.toBinaryString(n).toCharArray();
        for(int i = binary.length-1; i>0; i--) {
        	if(binary[i] =='1' && binary[i-1] =='0') {
        		binary[i] ='0';
        		binary[i-1] ='1';
        		for(int j=binary.length-1; j>i; j--) {
        			for(int q=j-1; q>i; q--) {
        				if(binary[j] == '0' && binary[q] == '1') {
        					binary[j] ='1';
        					binary[q] ='0';
        					break;
        				}
        			}
        		}
        		return Integer.parseInt(String.valueOf(binary), 2);
        	}
        }
        for(int i=binary.length-1 ; i>1; i--) {
        	for(int j= i-1; j>0; j--) {
        		if(binary[i] == '0' && binary[j] =='1') {
        			binary[i] = '1';
        			binary[j] = '0';
        			break;
        		}
        	}
        }
        StringBuffer a = new StringBuffer();
        a.append("10");
        for(int i =1 ;  i<binary.length; i++) {
        	a.append(binary[i]);
        }
        return Integer.parseInt(a.toString(), 2);
    }
}