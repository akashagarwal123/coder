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
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               for(int k=0;k<n;k++)
               {
                   if(ar[i]+ar[j]==ar[k])
                   {
                       System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
                       break;
                   }
               }
           }
       }
    }
}