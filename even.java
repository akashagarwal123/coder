
import java.util.*;
class Main
{ 
public static void main (String[] args) 
{
   Scanner sc = new Scanner(System.in);
   //Enter the initial point
   int a = sc.nextInt();
   //Enter the final point
   int b = sc.nextInt();
   for(int i = a+1 ; i<b ; i++)
   {
       if(i%2 == 0)
       {
           System.out.print(i+" ");
       }
   }
}
}