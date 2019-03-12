import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
         ar[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}