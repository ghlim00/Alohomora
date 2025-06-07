class Solution {
    public int[] solution(int n, int m) {
        
        int gcp = getGCP(n,m);
        int lcm = (n*m)/gcp; // 최소공배수 = 두 수의 곱 / 최대공약수
        
        return new int[]{gcp,lcm};
    }
    
    // 최대공약수 
    // 큰 수 % 작은 수를 하다 0 이 되기 직전의 수
    public int getGCP(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;  
        }
        return a;
    }
}