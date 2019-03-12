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
        Arrays.sort(ar);
        int store[] = new int[n];
        int k=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    ++count;
                }
            }
            store[i] = count;
            count=0;
        }
        for(int i=0;i<n;i++)
        {
            if(store[i]==1)
            {
                System.out.println(ar[i]);
                break;
            }
        }
    }
}