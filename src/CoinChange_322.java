import java.util.Arrays;

/**
 * Created by daili on 2018/9/24.
 */
public class CoinChange_322 {
    static int minCount = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        minCount = Integer.MAX_VALUE;
        Arrays.sort(coins);
        coinChange(coins,coins.length-1,amount,0);
        return minCount;
    }

    public void coinChange(int[] coins,int startCoinIndex,int remainAmount,int nowCount){
        if(startCoinIndex == 0){
            if(remainAmount % coins[startCoinIndex] == 0){
                 minCount = Math.min(minCount,nowCount+remainAmount/coins[startCoinIndex]);
            }
        }else {
            int coinValue = coins[startCoinIndex];
            for(int k=remainAmount/coinValue;(k+nowCount)<minCount&&k>=0;k--){
                coinChange(coins,--startCoinIndex,remainAmount-coinValue*k,k+nowCount);
            }
        }
    }

    public static void main(String[] args) {
        int []coins = new int[]{1,2,5};
        CoinChange_322 c322 = new CoinChange_322();
        c322.coinChange(coins,11);
        System.out.println(minCount);
    }
}
