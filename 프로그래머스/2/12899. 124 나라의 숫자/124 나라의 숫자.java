class Solution {
    public String solution(int n) {
        
        int[] nums = {1,2,4};
        
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            n--;  // 나머지를 0,1,2로 맞춤
            sb.insert(0, nums[n%3]);  // 앞에 1/2/4 중 하나 추가
            n /= 3;  // 3의 제곱수 마다 자리수가 바뀜
        }
        
        return sb.toString();
    }
}