package remote;
import java.util.*;
public class Duplicate {

    public static void main(String[] args) {

        int[] arr = {2,4,2,5,3,5,2,7,8};
        int sizeOfArray = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (!map.containsValue(arr[i])) {
                map.put(arr[i],1);
            }

        }
        System.out.println(map);
        System.out.println(map.size());


//        for(Map.Entry<Integer,Integer> entry:map.entrySet())
//        {
//            entry.getKey()
//        }

    }}