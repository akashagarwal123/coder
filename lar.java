import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i] = sc.nextInt();
    }
    akash obj = new akash();
    obj.cal(ar,n);
    }
}
class akash
{
    public void cal(int[] ar, int n)
    {
        Arrays.sort(ar);
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(ar[i]);
        }
    }
}