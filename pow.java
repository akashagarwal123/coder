import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int flag=0,i=0;
        while(i<n)
        {
            double q= Math.pow(2,i);
            int p= (int)q;
            if(p==n)
            {
                flag=1;
                System.out.print("yes");
                break;
            }
            else
            {
                flag=0;
            }
            ++i;
        }
        if(flag==0)
        {
            System.out.print("no");
        }
    }
}