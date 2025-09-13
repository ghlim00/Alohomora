import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> queue = new LinkedList<>(); //큐는 LinkedList
        
        int idx = 0;
        
        for(int i=0; i<priorities.length; i++){
            queue.offer(new int[]{priorities[i], i});
        }
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            boolean hasPriority = true;
            
            for(int[] priority : queue){

                if(priority[0] > curr[0]){
                    hasPriority = false;
                    break;
                }
            }
            
            if(!hasPriority){
                queue.offer(curr);
            }
            else{
                idx++;
                if(curr[1] == location){
                    //idx++; -- 여기에 idx++을 두면, 찾아야 하는 프로세스에 대해서만 idx가 증가하여 1만 return 된다. idx는 각 프로세스가 실행될 때마다 증가시켜야 하므로 위에 작성해야 한다.
                    return idx; 
                }
            }

        }
        
        return -1;
        
    }
}