import java.util.Scanner;

class AddTwoNo {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

         int t,a,b;
         t=sc.nextInt();
         while(t!=0)
         {
             a=sc.nextInt();
             b=sc.nextInt();
             System.out.println((a+b));
             t--;
         }
         sc.close();
     }
    
}
