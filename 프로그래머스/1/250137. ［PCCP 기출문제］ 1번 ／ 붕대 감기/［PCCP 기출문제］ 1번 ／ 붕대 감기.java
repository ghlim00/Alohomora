import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int currHealth = health;
        int maxHealth = health;
        int time = 0;
        int combo = 0;
        
        for(int i = 0; i<attacks.length; i++){
            int interval = attacks[i][0] - time - 1; //예를 들면 5초, 6초 이렇게 공격이 들어오면 회복 불가능
            
            for(int j=0; j<interval; j++){
                if(currHealth < maxHealth){
                    currHealth += bandage[1];
                    combo++;
                }
                
                if(combo == bandage[0]){
                    currHealth += bandage[2];
                    combo = 0;
                }
                
            }
            
            if(currHealth > maxHealth){
                currHealth = maxHealth;
            }
            
            currHealth -= attacks[i][1];
            combo = 0;
            time = attacks[i][0];
            
            if(currHealth <= 0){
                return -1;
            }
        } 
        
        return currHealth;
    }
}