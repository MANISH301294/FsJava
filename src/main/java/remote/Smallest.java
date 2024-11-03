package remote;

public class Smallest {

    public int[] Second(int[] arr)
    {
        if(arr.length <2)
        {
            System.out.println(Integer.MAX_VALUE+"  "+Integer.MIN_VALUE);
           return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            small = Math.min(small, arr[i]);
            large = Math.max(large,arr[i]);
        }

        System.out.println(small+" "+large);

        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]<secondSmall && arr[i]!= small)
           {
               secondSmall = arr[i];
           }


           if(arr[i]>secondLargest && arr[i]!= large)
           {
               secondLargest = arr[i];
           }
        }
        System.out.println(secondSmall+" "+secondLargest);


        return new int[]{secondLargest,secondSmall};
    }
}
