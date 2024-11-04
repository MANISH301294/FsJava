package remote;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Missing {



            public static int missingNumber(int []a, int N) {

                int sum = N * (N + 1) / 2;

                int s2 = 0;
                for (int i = 0; i < N - 1; i++) {
                    s2 = s2 + a[i];
                }

                int missing = sum - s2;

                return missing;


            }


        public static void main(String[] args)
        {
            int[] a = {2,4,1,5,6,7};
            int N = a.length+1;

            System.out.println(missingNumber(a,N));



        }
    }

