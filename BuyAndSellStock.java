package Arrays;
    public class BuyAndSellStock {

            static int buyAndSellStocks(int prices[]){
                int buyPrice = Integer.MAX_VALUE ;
                int maxProfit = 0 ;
                for (int i = 0; i <prices.length ; i++) {
                    if (buyPrice < prices[i]){  // case 1: when you gains profit
                        int profit = prices[i] - buyPrice ;
                        maxProfit = Math.max(maxProfit , profit);  // today's profit
                    }else {
                        buyPrice = prices[i] ;
                    }
                }
                return maxProfit ;
            }
        public static void main(String[] args) {
            int prices[] = {7,1,5,3,6,4} ;
            System.out.println(" you get Maximum profit of : "+buyAndSellStocks(prices));
        }
}
