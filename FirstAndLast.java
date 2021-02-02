import java.util.*;
class FirstAndLast 
{ 
     int calDigit(int n)
     { 
        int i=0;
        while(n>0)
        { 
           int r=n%10;
           i++;
            n=n/10;
        }
      
        return i;
     }
    public int Calculate(int n)
    {
        
         int r, d=n;
            int i=0,c;
            c=calDigit(d);
           
         
           int a[]= new int[c];
        while(n>0)
        { 
           r=n%10;
           a[i]=r;
           n=n/10;
           i++;
        }
      
       int b=a[0]+a[c-1];
       return b;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
         int t,n;
         t=sc.nextInt();
         while(t>0)
         {
             FirstAndLast ob = new FirstAndLast();
             n=sc.nextInt();
            System.out.print("\n"+ob.Calculate(n));
            t--;
              }
              sc.close();

    }

    
}
