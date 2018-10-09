import java.util.*;
class Main
{ 
public static void main (String[] args) 
{
   Scanner sc = new Scanner(System.in);
    //Enter the Number
    int rev ,sum=0;
    int num = sc.nextInt();
    int m = num;
    while(num != 0)
    {
      rev = num%10;
      sum= (sum*10)+rev;
      num = num/10;
    }
      if(sum == m)
      {
         System.out.println("yes");
      }
      else
      {
            System.out.println("no");
      }
}
}