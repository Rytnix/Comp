 import java.util.Scanner;
 class factorial 
 {
     public static void main(String[]args)
     {
          Scanner sc= new Scanner(System.in);

          int t,n,i;
          
          t=sc.nextInt(); 
          int k=t;
          int arr[] = new int[k];
          
          i=0;
          while(t>0)
          {
              arr[i]=sc.nextInt();
              i++;  
              t--;                                         
          }
          int l=0;
          while(l<(arr.length))
          { 
              n=arr[l];
              int fact=1;
          while(n!=0)
          {
            fact=fact*n;
              n--;
          }
              System.out.println(fact);
              l++;
        }   
             sc.close();

          
     }
    
}
    

