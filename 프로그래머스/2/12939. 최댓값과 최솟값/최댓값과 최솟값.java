class Solution {
    public String solution(String s) {
        
        // 1. s를 공백 기준으로 나누기
        String[] nums = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // 최댓값과 최솟값 찾기
        for(String num : nums){
            int number = Integer.parseInt(num);
            
            if(number < min)
                min = number;
            if(number > max)  // else if 아님 주의
                max = number;
        }
        
        return min + " " + max;
        
    }
}