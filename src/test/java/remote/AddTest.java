package remote;

import org.testng.annotations.Test;

public class AddTest {

    Add add = new Add();

    @Test
    public void test1()
    {
      int result  = add.addTwoNumber(5,10);
        System.out.println(result);
    }
}
