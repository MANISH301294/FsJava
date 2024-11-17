package remote;

import java.util.ArrayList;

public class StocksBuy {

    public static int stocks(ArrayList<Integer> prices)
    {

        Integer[] profit = new Integer[prices.size()];
        profit = prices.toArray(profit);
        int min = Integer.MAX_VALUE;
        int max  = 0;

        for(int i=0;i<profit.length;i++)
        {
            min = Math.min(min,profit[i]);
            max = Math.max(max,profit[i]-min);

        }


        return max;
    }

    public static void main(String[] args)
    {
            ArrayList<Integer> prices = new ArrayList<>();

            prices.add(7);
            prices.add(2);
           prices.add(5);
            prices.add(6);
           prices.add(9);
           prices.add(3);

         int max =  stocks(prices);
        System.out.println(max);

    }
}
