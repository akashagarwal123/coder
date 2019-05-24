import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        akash obj = new akash();
        obj.find(ar,n);
    }
}
class akash
{
    public void find(int[] ar, int n)
    {
        int order[] = new int[n];
        for(int i=0;i<n;i=i+2)
        {
            if(ar[i]%2!=0)
            {
                order[i] = ar[i];
            }
        }
        for(int i=1;i<n;i=i+2)
        {
            if(ar[i]%2==0)
            {
                order[i] = ar[i];
            }
        }
        for(int i=0;i<order.length;i++)
        {
            if(order[i]!=0)
            {
            System.out.print(order[i]+" ");
            }
        }
    }
}