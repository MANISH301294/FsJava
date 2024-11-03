package remote;

import java.util.Arrays;

public class Rotate {

       public  static void main(String[] args) {

           int[] arr = {2, 3, 4, 5, 1};
            int a = arr[0];
            int n = arr.length;

            for(int i=0;i<n;i++)
            {
                if(i == n-1)
                {
                    arr[i] = a;
                } else {
                    arr[i] = arr[i+1];
                }

            }
           System.out.println(Arrays.toString(arr));


        }
    }

