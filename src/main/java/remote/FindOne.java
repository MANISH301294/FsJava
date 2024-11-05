package remote;

import java.util.HashMap;
import java.util.Map;

public class FindOne {

    public static int solution(int[] a)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int n = a.length;
        for(int i=0;i<n;i++)
        {
           if(!map.containsKey(a[i])) {
               map.put(a[i], 1);
           }
           else {
               map.put(a[i],map.get(a[i])+1);
           }


        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
            {
               return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] a= {1,2,2,3,4,5,4,3,1,};
        System.out.println(solution(a));

    }
}
