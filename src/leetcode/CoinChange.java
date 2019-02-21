package leetcode;

import java.util.*;

public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
        int memo [] = new int[amount+1];
        memo[0] = 0;
        Arrays.sort(coins);
        for(int i=1; i<memo.length; i++){
            int k = 0;
            memo[i] = Integer.MAX_VALUE;
            while(k<coins.length && coins[k] <= i){
                int coin = coins[k++];
                if(memo[i-coin] == Integer.MAX_VALUE)
                    continue;
                
                memo[i] = Math.min(memo[i], memo[i-coin]+1);      
            }
        }
        
        if(memo[amount] == Integer.MAX_VALUE)
            return -1;
        
        return memo[amount];
    }

}
