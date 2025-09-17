import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int time = 0;
        int currWeight = 0;
        
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> onBridge = new LinkedList<>();
        Queue<Integer> startTime = new LinkedList<>();
        
        for(int t : truck_weights){
            trucks.add(t);
        }
        
        
        while(!trucks.isEmpty() || !onBridge.isEmpty()){  //!!! && 로 처리해서 틀렸었음
            time++;
            
            // 빼기
            if(!startTime.isEmpty() && time - startTime.peek() >=bridge_length){
                int subtract = onBridge.poll();
                currWeight -= subtract;
                startTime.poll();
            }
                
            // 더하기
            if(!trucks.isEmpty() && currWeight + trucks.peek() <= weight){
                int addWeight = trucks.poll();
                onBridge.add(addWeight);
                currWeight += addWeight;
                startTime.add(time);
            }
            
        }
        
        return time;
        
    }
}