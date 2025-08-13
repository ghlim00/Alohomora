import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        // kick - element 배열을 2번 연속해서 새 배열 생성
        
        HashSet<Integer> set = new HashSet();
        
        int len = elements.length;
        int[] newEle = new int[2 * len];
        
        for(int i=0; i<len; i++){
            newEle[i] = elements[i];
            newEle[i+len] = elements[i];
        }
        
        for(int i=1; i<=elements.length; i++){
            
            for(int st=0; st<elements.length; st++){
                int sum = 0;
                
                for(int end=st; end<st+i; end++){
                    sum += newEle[end];
                }
                
                set.add(sum);
            }
        }
        
        return set.size();
    }
}