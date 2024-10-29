package remote;

public class Factorial {


   int total = 1;
    public int factorialOfNumber(int n)
    {

        if(n==0)
        {
            return 0;
        }
        if(n<1)
        {
            return 1;
        }

        total = total *n;
        factorialOfNumber(--n);
        return total;

    }
}
