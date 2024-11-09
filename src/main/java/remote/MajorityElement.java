package remote;
import java.util.*;
public class MajorityElement {

    public static int majority(int[] a)
    {
        int n = a.length;
        int l = n/2;
        System.out.println(l);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }

            else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>=l)
            {
                return  entry.getKey();
            }

        }
        return -1;


    }

    public static void main(String[] args)
    {
        int[] a = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majority(a));
    }
}
