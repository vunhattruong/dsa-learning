package com.leetcode.slidingwindow;

public class BuyAndSellBitCoin {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        while ( sell < prices.length) {
            if (prices[sell] > prices[buy]) {
                int currentProfit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buy++;
            }
            sell++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BuyAndSellBitCoin buyAndSellBitCoin = new BuyAndSellBitCoin();
        System.out.println("Max profit is " + buyAndSellBitCoin.maxProfit(new int[]{1,2,3,4,5}));
    }
}
