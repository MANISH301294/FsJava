package remote;

public class Recurssion {

    public void printcount(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printcount(--n);
    }
}
