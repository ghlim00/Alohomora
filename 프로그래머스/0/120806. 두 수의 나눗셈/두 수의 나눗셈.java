class Solution {
    public int solution(int num1, int num2) {
        // 값에 따라 double, int 형변환 주의
        
        double ans = 0;
        
        ans = (double)num1 / num2 * 1000; 
        
        return (int)ans;
    }
}