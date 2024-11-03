package remote;

import java.util.Arrays;

public class DRotate {

    public int[] rotate(int[] nums, int k) {



        int n = nums.length;
        int[] output = new int[n];
        int j = n-k;
        int l =0;

//
        for(int i=0;i<n;i++)
        {
            if(j<n)
            {
                output[i] = nums[j];
                j++;
            }
            else if(l<j)
            {
                output[i] = nums[l];
                l++;
            }
        }

        return output;



    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7};
        DRotate rotat = new DRotate();
        System.out.println(Arrays.toString(rotat.rotate(nums,3)));

    }
}


