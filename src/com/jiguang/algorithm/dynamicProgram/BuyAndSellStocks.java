package com.jiguang.algorithm.dynamicProgram;

/**
 * 动态规划买卖股票问题
 */
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,8,9,7,6,9,1,3,4,8,2,1,5};
        int profit2 = maxProfit2(prices);
        System.out.println(profit2);
    }

    /**
     * 只允许单笔交易
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices){
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        for (int i=1;i<prices.length;i++){
            if (prices[i] > min) {
                dp[i] = Math.max(prices[i]-min, dp[i-1]);
            } else {
                min = Math.min(min, prices[i]);
            }
        }
        return dp[prices.length-1];
    }
    public static int maxProfit2(int[] prices){
        int profit = 0;
        for (int i=1;i<prices.length;i++){
            int delt = prices[i] - prices[i-1];
            if (delt > 0) {
                profit += delt;
            }
        }
        return profit;
    }
}
