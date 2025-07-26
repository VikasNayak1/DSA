package Collections;

public class Stock {
    public static void main(String [] args){
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(prices[i],min);
        }
        return profit;
        
    }
}
