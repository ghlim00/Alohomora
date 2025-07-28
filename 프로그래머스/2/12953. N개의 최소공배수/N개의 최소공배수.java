import java.util.*;

class Solution {
    public int solution(int[] arr) {
                
        int currentLCM = arr[0]; // 현재 최소공배수는 배열의 첫번째 숫자로 초기화
        
        for(int i=1; i<arr.length; i++){
            currentLCM = getLCM(arr[i], currentLCM);
        }
        
        return currentLCM;
    }
    
    // 최소공배수 구하기
    private int getLCM(int num1, int num2){
        return (int)((num1 * num2) / (getGCD(num1, num2)));
    }
    
    // 최대공약수 구하기
    private int getGCD(int num1, int num2){
        if(num2 == 0)
            return num1;
        return getGCD(num2, num1 % num2);
    }
    
}