import java.util.Scanner;
class NestedIf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float cgpa=sc.nextFloat();
        if (cgpa>=7.5f)
        {
            int back=sc.nextInt();
        }
            if (back<=2)
             {
                int coding=sc.nextInt();
             }
                if (coding>=2)
                {
                    int comm=sc.nextInt();
                }
                    if (comm>=60)
                    {
                        System.out.println("eligible for placement");
                    }
                    else {
                        System.out.println("improve your skills");
                         }
                      else {
                        System.out.println("sorry,you need to clear");
                           }
                        else  {
                System.out.println("sorry,almost 2 ");
                              }
    }
}