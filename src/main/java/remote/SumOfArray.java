package remote;

public class SumOfArray {

    int total = 0;
    public int sumOfNumber(int[] a,int l)
    {
        if(l==0)
        {
            return 0;
        }

      return a[l-1]+sumOfNumber(a ,--l);

    }
}
