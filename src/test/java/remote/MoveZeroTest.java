package remote;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MoveZeroTest {
    MoveZero move = new MoveZero();


    @Test
    public void Test1()
    {
        int[] a = {1,5,6,0,65,325,0,56,98,0,0,0};
        int n = a.length;
        System.out.println(Arrays.toString(move.moveZeros(n,a)));

    }
}
