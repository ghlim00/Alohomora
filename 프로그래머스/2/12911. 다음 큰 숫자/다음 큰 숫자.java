class Solution {
    public int solution(int n) {
        
        // n의 1의 개수 => Integer.bitCount()
        int count = Integer.bitCount(n);
        
        while(true){
            n++;
            if(Integer.bitCount(n) == count)
                return n;
        }
        
    }
}