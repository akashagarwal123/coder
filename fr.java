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
       int rank[] = new int[n];
       int k=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n-1;j++)
           {
               if(ar[i] == ar[j])
               {
                   rank[k] = j;
                   ++k;
                   break;
               }
           }
       }
       int x = small(rank,k);
       System.out.println(ar[x]);
    }
    public static int small(int[] rank, int k)
    {
        int min =rank[0];
        for(int i=0;i<k;i++)
        {
            if(min>rank[i])
            {
                min = rank[i];
            }
        }
        return min;
    }
}