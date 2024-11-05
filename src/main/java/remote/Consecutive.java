package remote;
import java.util.*;
public class Consecutive {

    public static int solution(int[] a)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int con = 0;
        int max_count = 0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                con++;
            }
            else{
                con =0;
            }
           max_count = Math.max(max_count,con);

        }

        return max_count;



    }

    public static void main(String[] args)
    {
        int[] a=  {1,1,0,1,0,1,1,1};
        System.out.println(solution(a));
    }
}
