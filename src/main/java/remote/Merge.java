package remote;
import java.util.*;
public class Merge {

    public static List< Integer > sortedArray(int []a, int []b) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],1);
            }
        }

        for(int i=0;i<b.length;i++)
        {
            if(!map.containsKey(b[i]))
            {
                map.put(b[i],1);
            }
        }

      for(int it: map.keySet())

      {
          list.add(it);
      }

      Collections.sort(list);
      return list;

    }

public static  void main(String[] args)
{
    int[] a = {1,2,3,5,6,8,9,6,3,0,22,34,56};
    int[] b = {2,3,4,6,7,8};

    System.out.println(sortedArray(a,b));

}}
