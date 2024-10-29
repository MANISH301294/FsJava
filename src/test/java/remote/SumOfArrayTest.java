package remote;

import org.testng.annotations.Test;

public class SumOfArrayTest {

    SumOfArray sum = new SumOfArray();
    @Test
    public void test()
    {
        int[] n = {2,3,4};
        int[] n1  = {7,8,9};
        int l = n1.length;
        System.out.println(sum.sumOfNumber(n1,l));
    }
}

