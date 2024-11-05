package remote;

public class LongestSubArray {

    public static int longestSubarrayWithSumK(int []a, long k) {

        int cnt =0;

        for(int i=0;i<a.length;i++)
        {
            long sum =0;
            for(int j=i;j<a.length;j++)
            {
                sum=sum+a[j];

                if(sum==k)

                    cnt = Math.max(cnt,j-i+1);

            }

        }
        return cnt;

    }




    public static void main(String[] args)
    {
        int[] a = {8,15,17,0,11};
        int k = 17;
        System.out.println(longestSubarrayWithSumK(a,k));

    }

}
