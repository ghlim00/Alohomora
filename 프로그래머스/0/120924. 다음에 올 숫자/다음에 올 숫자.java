class Solution {
    public int solution(int[] common) {
        
        int diff = common[1] - common[0];
        // int ratio = common[1] / common[0]; 배열의 원소가 0이면 런타임 에러
        
        int answer = 0;
        
        if(common[2] - common[1] == diff){
            answer = common[common.length - 1] + diff;
        }
        else{
            int ratio = common[1] / common[0];
            answer = common[common.length - 1] * ratio;
        }
        
        return answer;
    }
}