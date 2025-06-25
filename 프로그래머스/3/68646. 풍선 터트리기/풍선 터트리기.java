class Solution {
    public int solution(int[] a) {
        
        int n = a.length;
        if(n<=2) return n;
        
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        
        // 왼쪽부터 최소값 계산
        leftMin[0] = a[0];
        for(int i=1; i<n; i++){
            leftMin[i] = Math.min(leftMin[i-1], a[i]);
        }
        
        // 오른쪽부터 최소값 계산
        rightMin[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--){
            rightMin[i] = Math.min(rightMin[i+1], a[i]);
        }
        
        int count = 0;
        for(int i=0; i<n; i++){
            // 양쪽 끝은 무조건 살아남을 수 있음
            if(i==0 || i==n-1){
                count++;
            }
            // 좌우에 더 작은 풍선이 있는 경우는 안됨
            else if(a[i] <= leftMin[i-1] || a[i] <= rightMin[i+1]){
                count++;
            }
        }
        
        return count;
    }
}