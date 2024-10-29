package remote;

import org.testng.annotations.Test;

public class SumOfArrayTest {

    SumOfArray sum = new SumOfArray();
    @Test
    public void test()
    {
        int[] n = {2,3,4};
        int l = n.length;
        System.out.println(sum.sumOfNumber(n,l));
    }
}

