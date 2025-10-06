class Solution {
    public int solution(int a, int b) {
        
        int ab = 0;
        int ba = 0;
        
        ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        return ab>ba ? ab : ba;
    }
}