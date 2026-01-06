import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        // 각 단계에 머무르는 사람
        int[] level = new int[N+2];
        for(int s : stages){
            level[s]++;
        }
        
        // [단계, 실패율]
        int people = stages.length;
        double[][] rate = new double[N][2];
        for(int i=1; i<=N; i++){
            //if(people <= 0) break; -> rate[n][0]이 rate[0][0] 으로 저장됨
            double rating = (double)level[i]/people;  // double로 해줘야 됨 (double)(level[i]/people) 로 괄호로 묶으면 안됨
            
            if(people==0){
                rate[i-1][0] = i;
                rate[i-1][1] = 0;
            }
            else{
                rate[i-1][0] = i;
                rate[i-1][1] = rating;
            }
            
            people -= level[i];
        }
        
        // 정렬
        Arrays.sort(rate, (a,b) -> {
            if(a[1] == b[1]){
                return Double.compare(a[0], b[0]);
            }
            return Double.compare(b[1], a[1]);
        });
        
        for(int i=0; i<N; i++){
            answer[i] = (int)rate[i][0];  //(int)로 바꿔주기 주의
        }
        return answer;
    }
}