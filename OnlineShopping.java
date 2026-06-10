import java.util.*;
class OnlineShopping
{
    public static void main(String args[])
    {
        List<String> products = new ArrayList<String>();
        products.add("mobile");
        products.add("laptop");
        products.add("AC");
        products.add("microwave");

        Scanner sc=new Scanner(System.in);
        String newItem=sc.next();
        
            boolean undi=false;
            for(String ele:products){
            if(ele.equals(newItem)){
                undi=true;
                break;
            }
            }
                if(undi==true){
                System.out.println("Already exist");
            }else{
                products.add(newItem);
                System.out.println("added successfully");
                System.out.println(products);
            }
        
            }
    }
