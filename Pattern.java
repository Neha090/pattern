/*
develop a pattern like
I/P :1
O/p: 1
     1
     
 I/P: 3
 O/p: 1
      2*2
      3*3*3
      3*3*3
      2*2
      1
*/

public class Pattern
{
   public static void main(String []args){
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       get_pattern(1,n);
     }
     
     static void get_pattern(int i,int n)
     {
         if(i==n+1)
         {
             return;
         }
        
        
         else
         {
             for(int j=0;j<i;j++)
             {
                 if(j==i-1||i==1)
                 {
                     System.out.print(i);
                 }
                 else
                 {
                     System.out.print(i+"*");
                 }
             }
             System.out.println();
             
            get_pattern(i+1,n);
            
            for(int j=0;j<i;j++)
             {
                 if(j==i-1||i==1)
                 {
                     System.out.print(i);
                 }
                 else
                 {
                     System.out.print(i+"*");
                 }
             }
             System.out.println();
         }
     }
}
