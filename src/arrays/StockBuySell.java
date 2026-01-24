package arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock
//121. Best Time to Buy and Sell Stock-->Tc:O(n)

public class StockBuySell {
	public static int method(int[] prices) {
		int maxProfit=0,bestBuy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(method(prices));
	}

}
