import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = Integer.parseInt(br.readLine());
        }
        akash obj = new akash();
        obj.repeate(ar,n);
    }
}
class akash
{
    public void repeate(int[] ar, int n)
    {
        int or[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            or[k] = ar[i];
            ++k;
        }
        Arrays.sort(ar);
        int[] store = new int[n+1];
        for(int i=0;i<n;i++)
        {
            store[i]=0;
        }
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                store[ar[i]]+=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(store[i]>=1)
            {
                System.out.print(ar[store[i]]+" ");
            }
        }
    }
}