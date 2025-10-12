class Solution {
    public int solution(int[] numbers, int k) {
        // 0에서 출발 -> (k-1)번 던지기 * 2칸씩 이동 
        return numbers[2 * (k-1) % numbers.length];
    }
}