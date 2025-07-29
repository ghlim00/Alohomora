class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        char[] manipulate = control.toCharArray();
        
        for(int i =0; i<manipulate.length; i++){
            
            if(manipulate[i] == 'w')
                answer += 1;
            else if(manipulate[i] == 's')
                answer -= 1;
            else if(manipulate[i] == 'd')
                answer += 10;
            else if(manipulate[i] == 'a')
                answer -= 10;
        }
        
        return answer;
    }
}