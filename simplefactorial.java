import java.math.BigInteger;
import java.util.*;
class simplefactorial 
{
    public static void fact(int j){
        BigInteger fact = new BigInteger("1");
        for(int i =2 ;i<= j; i++)
        {
            fact =fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
        

    public static void main(String[]args)
    {
         Scanner sc= new Scanner(System.in);

         int t,i=0;
         t=sc.nextInt();
        
         int [] arr = new int[t];
         
         while(t>0)
         {
            arr[i]=sc.nextInt();
             t--;
             i++;
         }
         int l=0;
         while(l<arr.length)
         {
             fact(arr[l]);
             l++;
         }

          sc.close();

         
    }
   
}
