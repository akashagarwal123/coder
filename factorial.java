import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        long f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}