class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        int len = absolutes.length;
        int answer = 0;
        
        for(int i =0; i<len; i++){
            if(signs[i]==true){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}