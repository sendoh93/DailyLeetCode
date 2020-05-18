public class BuyStockBestTime {

    /**
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
     *
     */

    public static void main(String[] args) {
        maxProfit(new int[]{2,1,4});
    }


    public static int maxProfit(int[] prices) {
        //少于可计算数量则直接返回
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        System.out.print(max);
        return max;
    }

    /**
     * 官方题解：
     *
     * int minprice = Integer.MAX_VALUE;
     *         int maxprofit = 0;
     *         for (int i = 0; i < prices.length; i++) {
     *             if (prices[i] < minprice)
     *                 minprice = prices[i];
     *             else if (prices[i] - minprice > maxprofit)
     *                 maxprofit = prices[i] - minprice;
     *         }
     *         return maxprofit;
     */
}
