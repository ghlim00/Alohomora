class Solution {
    public int solution(int[] num_list) {
        
        int hap = 0;
        int gop = 1;
        
        for (int a : num_list){
            hap += a;
            gop *= a;
        }
        
        int haphap = hap*hap;
        
        if(haphap > gop) return 1;
        else return 0;
        
    }
}