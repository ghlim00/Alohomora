class Solution {
    
    int answer = 0;
    
    public int solution(int[] number) {
        combination(number, 0,0,0);
        return answer;
    }
    
    public void combination(int[] number, int start, int depth, int sum){
        
        if(depth==3){
            if(sum==0) 
                answer++;
            return;
        }
         
        for(int i=start; i<number.length; i++){
            combination(number, i+1, depth+1, sum+number[i]);
        }
    }
}