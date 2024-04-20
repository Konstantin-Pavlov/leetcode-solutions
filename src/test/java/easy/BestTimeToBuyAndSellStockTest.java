package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    public void test1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int output = 5;
        Assertions.assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int output = 0;
        Assertions.assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test3() {
        int[] prices = new int[]{2, 4, 1};
        int output = 2;
        Assertions.assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test4() {
        int[] prices = new int[]{2, 4, 1, 1, 6};
        int output = 5;
        Assertions.assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test5() {
        int[] prices = new int[]{2, 3};
        int output = 1;
        Assertions.assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test6() {
        int[] prices = new int[]{2, 3, 2, 4, 3, 2, 6, 5, 9, 2, 1};
        int output = 7;
        Assertions.assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
