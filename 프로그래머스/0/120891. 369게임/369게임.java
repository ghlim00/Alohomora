class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String number = String.valueOf(order);
        
        for(int i =0; i<number.length(); i++){
            char ch = number.charAt(i);
            
            if(ch == '3' || ch=='6' || ch=='9')
                answer++;
        }
        
        return answer;
    }
}