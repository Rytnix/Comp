 /* package codechef; // don't place package name! */

 import java.util.*;
 
 import java.math.*;
 
 /* Name of the class has to be "Main" only if the class is public. */
 class test2
 
 {   public static void fact(int n){
     BigInteger fact = new BigInteger("1");
     for(int i =2 ;i<= n; i++)
     {
         fact =fact.multiply(BigInteger.valueOf(i));
     }
     System.out.println(fact);
     
 }
     
     
     public static void main (String[] args) throws java.lang.Exception
     {
         // your code goes here
         
         try 
         {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int  i = 0;
         int [] numbs = new int[n];
         while(i<n )
         {
             int a = sc.nextInt();
           numbs[i] = a;
          
           i++;
         }
         int  j = 0;
         while(j<n)
         {
             fact(numbs[j]);
             j++;
         }
         sc.close();
         }
         catch(Exception e)
         {
             return;
         }
     }
 }
 