class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder tmp;
        boolean sosu[] = sosuArr(1000001);
        StringBuilder numConvert = numConverter(n, k);
        numConvert.reverse();
        for(int i=0; i<numConvert.length(); i++) {
        	if(numConvert.charAt(i) != '0') {
        		tmp = new StringBuilder();
        		do {
        			tmp.append(numConvert.charAt(i));
                    if (tmp.length() > 9) break;
        			i++;
        			if(numConvert.length() == i || numConvert.charAt(i) == '0') {
        				if(!sosu[Integer.parseInt(tmp.toString())])answer++;
        				break;
        			}
				}while(numConvert.length()>i);// end while
        	}// end if
        }// end i for
        
        return answer;
	}
	static boolean[] sosuArr(int max) { //소수배열 
		 boolean sosu[] = new boolean[max];
	        sosu[0] = true;
	        sosu[1] = true;
	        for(int i=2; i<max; i++) {
	        	if(!sosu[i]) {
	        		for(int j=i+i; j<1000001; j+=i) {
	        			sosu[j] = true;
	        		}
	        	}
	        }
	     return sosu;
	}
	static StringBuilder numConverter(int n, int k) {//k진수 변환
		StringBuilder convert = new StringBuilder();
		while(n > 0) {
			convert.append(n % k);
			n /= k;
		}
		return convert;
	}
}