import java.util.*;

class MaximumProfit {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            } else {
                int profit = prices[i] - min;
                max = Math.max(max, profit);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }

        MaximumProfit obj = new MaximumProfit();
        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
