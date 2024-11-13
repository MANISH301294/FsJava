package remote;

import java.util.Arrays;

public class MaxArrayInSubArray {

    public static void maxSubarry(int[] a)
    {
        int maxSum = 0;
        int currSum  =0;
        int end =0;
        int start = 0;
        int tempstart = 0;

        for(int i=0;i<a.length;i++)
        {
            currSum = currSum+a[i];
           if(currSum>maxSum)
           {
               maxSum = currSum;
               start = tempstart;
               end = i;

           }

            if(currSum<0)
            {
                currSum = 0;
                tempstart = i+1;

            }


        }

        int[] subArray = Arrays.copyOfRange(a,start,end+1);
        System.out.println(maxSum);
        System.out.println(Arrays.toString(subArray));

    }


    public static void main(String[] args)
    {
        int[] arr = {2,3,-6,4,-5,-5,6,3,4};
        maxSubarry(arr);
    }
}
