
import java.util.* ;
 class SumOfEachDigit 

 { 
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int r,t,s=0;
       t=sc.nextInt();
       while(t>0)
       {
        int a=sc.nextInt();
       while(a>0)
       {

        r=a%10;
        s=s+r;
        a=a/10;
       }
       System.out.println(s);
       s=0;
       t--;
    }
    sc.close();

   }
}
    

