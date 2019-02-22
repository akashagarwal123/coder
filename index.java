import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ar[] = new int[n];
        String line = br.readLine();
        String[] st = line.split("\\s");
        for(int i=0;i<n;i++)
        {
            ar[i] = Integer.parseInt(st[i]);
        }
        akash obj = new akash();
        obj.calculate(ar,n);
    }
}
class akash
{
    public akash()
    {}
    
    public void calculate(int[] ar, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]+" "+i);
        }
    }
}