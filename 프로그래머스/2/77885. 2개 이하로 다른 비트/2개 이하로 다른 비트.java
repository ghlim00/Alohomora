class Solution {
    public long[] solution(long[] numbers) {
        
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            
            long x = numbers[i];
            
            // 짝수인 경우: +1을 해준다.
            if(x%2 == 0){
                answer[i] = x+1;
            }
            // 홀수인 경우 : 가장 오른쪽의 '01' -> '10'
            else{
                long temp = x; 
                long bit = 1L; // LONG 타입으로 정의(64 BIT)
                
                // x에서 가장 오른쪽 0을 찾는 과정
                /*
                예시: x = 7 = 0111
                    bit = 1 → 0111 & 0001 = 1 → 1이니까 bit <<= 1
                    bit = 2 → 0111 & 0010 = 1 → 1이니까 bit <<= 1
                    bit = 4 → 0111 & 0100 = 1 → 1이니까 bit <<= 1
                    bit = 8 → 0111 & 1000 = 0 → 멈춤!
                */
                while((temp & bit) != 0){
                    bit <<= 1;
                }
                
                // + bit : 0 -> 1
                // -(bit>>1) : 1 -> 0
                answer[i] = x + bit - (bit >> 1);
            }
        }
        
        return answer;
        
    }
}