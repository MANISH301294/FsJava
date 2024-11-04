package remote;

public class MoveZero {

        public  int[] moveZeros(int n, int []a) {


            int l =0;
            for(int i=0;i<n;i++)
            {
                if(a[i] != 0)
                {
                    a[l] = a[i];
                    l++;
                }
            }
            for(int i=l;i<n;i++)
            {
                a[i] = 0;
            }


            return a;

        }
    }
