class Solution {  //contains() 안됨
    public int solution(int i, int j, int k) {
        
        int answer = 0;
        
        for(int num=i; num<=j; num++){
            String numStr = String.valueOf(num);
            
           for(char ch : numStr.toCharArray()){
               if((ch-'0') == k)
                   answer++;
           }
        }
        
        return answer;
    }
}