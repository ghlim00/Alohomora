class Solution {
    public boolean solution(int x) {
        
        int origin = x;
        int digitsum = 0;
        
        while(x>0){
            digitsum += x%10;
            x /= 10;
        }
        
        return (origin%digitsum==0) ? true : false ;
    }
}