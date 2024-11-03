package remote;

import org.testng.annotations.Test;

public class smallarge {

   Smallest small = new Smallest();
    @Test
    public void Test1()
    {
        int arr[] = {23,34,53,12,56,64,78,54,32,45};

        small.Second(arr);

    }

    @Test
    public void Test2()
    {
        int arr[] = {};
       small.Second(arr);

    }


}
