package remote;
import java.util.* ;
import java.io.*;

public class SortZero {

        public static void sort012(int[] arr)
        {
            ArrayList<Integer> arrr = new ArrayList<>();
            for(int num:arr)
            {
                arrr.add(num);
            }
            int n = arrr.size();
            int low = 0, mid = 0, high = n - 1; // 3 pointers

            while (mid <= high) {
                if (arrr.get(mid) == 0) {
                    // swapping arr[low] and arr[mid]
                    int temp = arrr.get(low);
                    arrr.set(low, arrr.get(mid));
                    arrr.set(mid, temp);

                    low++;
                    mid++;

                } else if (arrr.get(mid) == 1) {
                    mid++;

                } else {
                    // swapping arr[mid] and arr[high]
                    int temp = arrr.get(mid);
                    arrr.set(mid, arrr.get(high));
                    arrr.set(high, temp);

                    high--;
                }
            }
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = arrr.get(i);
                System.out.print(arr[i]);
            }

        }

        public static void main(String[] args)
        {
            int[] arr = {1,0,2,0,0,1,1,2,2};
            sort012(arr);

        }
    }


