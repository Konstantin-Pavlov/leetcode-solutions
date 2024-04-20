package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        List<Pair> pairs = new ArrayList<>();
        int currentMin = prices[0];
        int profit = 0;
        for (int price : prices) {
            if(price < currentMin){
                currentMin = price;
            }
            if(price - currentMin > profit){
                profit = price - currentMin;
            }

        }
        return profit;
//        OptionalInt minIndex = IntStream.range(0, prices.length)
//                .reduce((i, j) -> prices[i] < prices[j] ? i : j);
//        if (minIndex.isEmpty()) {
//            return 0;
//        }
//
//        OptionalInt maxIndex = IntStream.range(minIndex.getAsInt(), prices.length)
//                .reduce((i, j) -> prices[i] > prices[j] ? i : j);
//        if (maxIndex.isEmpty()) {
//            return 0;
//        }
//        return prices[maxIndex.getAsInt()] - prices[minIndex.getAsInt()];
    }
}

class Pair{
    private int min;
    private int max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
