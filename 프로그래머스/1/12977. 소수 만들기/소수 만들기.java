import java.util.*;

class Solution {
    
    public int answer = 0;
    public boolean[] isPrimeCheck = new boolean[3001];
    
    public int solution(int[] nums) {
        
        sieveOfEratosthenes(3000);
        
        combination(nums, 0, 0, 0);

        return answer;
    }
    
    // 조합 메서드(배열, 시작, 깊이, 합)
    private void combination(int[] nums, int start, int depth, int sum){
        if(depth==3){
            if(isPrimeCheck[sum]){
                answer++;
                //return;
            }
            return; //return 위치 주의
        }

        for(int i=start; i<nums.length; i++){
            combination(nums, i+1, depth+1, sum+nums[i]);  // 오류의 원인 - i+1을 start+1로 적음
        }
    }
    
    // // 소수 판별 메서드 - 시간초과
    // private boolean isPrime(int num){
    //     for(int i=2; i*i<=num; i++){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    // 에라토스테네스의 체 (미리 생성) - 조건에 따라 여기서는 3000까지
    private void sieveOfEratosthenes(int limit){
        // 다 소수라고 체크해두되, 0과 1은 제외
        Arrays.fill(isPrimeCheck, true);
        isPrimeCheck[0] = false;
        isPrimeCheck[1] = false;
        
        for(int i=2; i*i<=limit; i++){
            if(isPrimeCheck[i]){
                for(int j=i*i; j<=limit; j+=i){ //  이 줄 유의
                    isPrimeCheck[j] = false;
                }
            }
        }
    }   
}