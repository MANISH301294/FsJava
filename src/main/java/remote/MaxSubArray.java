package remote;

import java.sql.SQLOutput;

public class MaxSubArray {

    public static long maximumsub(int[] a,int n)
    {
        long max = Long.MIN_VALUE;
        long submax = 0;


        for(int i=0;i<n;i++)
        {
           if(submax<0)
           {
               submax =0;
           }

           submax = submax+a[i];

           max = Math.max(submax,max);
        }
        return max;
    }


    public static void main(String[] args)
    {
        int[] a = {18 ,-6 ,-6 ,-5 ,7, 10, 16, -6 ,-2, 0 };
        int n = a.length;

        System.out.println(maximumsub(a,n));

    }
}
