class Solution
{
    public int solution(String s){
        
        int maxLen = 1;
        int n = s.length();
        
        for(int center = 0; center<n; center++){
            
            int oddLen = pallindrome(s, center, center);
            
            int evenLen = pallindrome(s, center, center+1);
            
            maxLen = Math.max(maxLen, Math.max(oddLen, evenLen));
        }
        
        return maxLen;
        
    }
    
    private int pallindrome(String s, int left, int right){
        
        int n = s.length();
        
        while(left>=0 && right<n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}