import java.util.*;
public class LinkedListEx
{
    public static void main(String args[])
    {
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(10);
        lis.add(20);
        lis.add(30);
        lis.add(40);
        lis.add(2,8);
        //100 ->10 ->20 ->8 ->30 ->40

        lis.addFirst(100);
        lis.addLast(500);
        System.out.println(lis);
    }
}