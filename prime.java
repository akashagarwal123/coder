
import java.util.*;
class Main
{ 
public static void main (String[] args) 
{
   Scanner sc = new Scanner(System.in);
    int flag =0;
    //Enter the Number
    int num = sc.nextInt();
    for(int i=2 ; i<(num/2) ; i++)
    {
        if(num % i == 0)
        {
            flag =1;
            break;
        }
    }
    if(flag == 1)
    {
        System.out.println("no");
    }
    else
    {
      System.out.println("yes");
    }
}
}