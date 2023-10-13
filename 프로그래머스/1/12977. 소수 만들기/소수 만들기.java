class Solution {
    	public int solution(int[] nums) {
        int answer = 0;
        boolean[] sosu = new boolean[3000];
		for(int i=2; i<3000; i++) {
			if(!sosu[i]) {
				for(int j=i+i; j<3000; j +=i) {
					sosu[j] = true;
				}
			}
		}
		
		for(int i=0;i<nums.length-2; i++) {
			for(int j=i+1; j<nums.length-1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					if(!sosu[nums[i]+nums[j]+nums[k]]) {
						answer++;
					}
				}//end k
			}//end j
		}//end i
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}