import java.util.*;

// TreeMap ver.
class Solution {
    public int[] solution(String[] operations) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String op : operations){
            char ch = op.charAt(0);
            
            if(ch == 'I'){
                int k = Integer.parseInt(op.substring(2)); //substring
                map.put(k, map.getOrDefault(k, 0) + 1);
            }
            else if(ch == 'D'){
                char k = op.charAt(2);
                if(k == '1'){
                    if(map.size() != 0){
                        int max = map.lastKey();
                        if(map.get(max) == 1){
                            map.remove(max);
                        }
                        else if(map.get(max) >1){
                            map.put(max, map.get(max)-1);
                        }
                    }
                }
                else{
                    if(map.size() != 0){
                        int min = map.firstKey();
                        if(map.get(min) == 1){
                            map.remove(min);
                        }
                        else if(map.get(min) >1){
                            map.put(min, map.get(min)-1);
                        }
                    }
                }
            }
        }
        
        
        if(map.size() == 0){
            return new int[]{0,0}; // new 있음
        }
        else{
            return new int[]{map.lastKey(), map.firstKey()};
        }
    }
}


/* 
    2개의 pq, 1개의 map 으로도 해결할 수 있음
    pq - min, max
*/
