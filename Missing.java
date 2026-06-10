import java.util.*;
public class Missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={54,93,12,65};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int sum_natural=max*(max+1)/2;
        int sum=0;

        
        for(int ele:arr){
            sum+=ele;
        }
        System.out.println("missing ele:" + (sum_natural-sum));
    }  
}