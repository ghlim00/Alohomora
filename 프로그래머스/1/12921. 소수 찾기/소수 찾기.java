class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        if(n==2) return 1;
        
        for(int k=3; k<=n; k++){
            answer++;
            for(int i=2; i<=Math.sqrt(k); i++){
                if(k%i==0){
                    answer--;
                    break;
                }
            }
        }
        
        return answer+1;
    }
}

/* 에라토스테네스의 체 - 활용 시 효율적
    1. boolean 2차원 배열 생성
    2. i FROM 2 TO i*i<=N 의 범위에서
    3. i가 소수라면 i의 배수들을 다 ~소수 로 처리
    예를 들면 2의 배수, 3의 배수, 5의 배수 등을 다 ~소수로 처리
*/