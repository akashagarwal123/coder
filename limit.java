
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
   Scanner sc = new Scanner(System.in);
      int sum =0;
    //Enter the range of an Array
    int n = sc.nextInt();
    //Enter the range upto which you want to find the Sum
    int k = sc.nextInt();
    //Declaration of an Array
    int ar[] = new int[n];
    
    for(int i=0;i<n;i++)
    {
        //Enter the elements into an array
        ar[i] = sc.nextInt();
    }
    
    for(int i=0;i<k;i++)
    {
        sum = sum+ar[i];
    }
    System.out.println(sum);
  }
}
