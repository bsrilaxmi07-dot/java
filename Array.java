import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int[] arr={4,6,12,89,45,34};
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for (int ele:arr)
        {
            if(ele>fmax)
            {
                smax=fmax;
                fmax=ele;
            }
             else if(ele > smax && ele!=fmax){
                smax=ele;
             }
        }
        if(smax!=Integer.MIN_VALUE){
          System.out.println(smax);
        }
    }
}