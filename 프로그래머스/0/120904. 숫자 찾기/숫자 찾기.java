class Solution {
    public int solution(int num, int k) {
        
        // 1. num, k를 String 타입으로 변경
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        // 2. .indexOf()를 통해 첫 인덱스 찾기
        // 만약 있다면 인덱스를, 없다면 -1을 반환한다.
        int index = numStr.indexOf(kStr);
        
        // 3. 결과 출력
        if(index != -1)
            return index+1;
        else
            return -1;
        
    }
}