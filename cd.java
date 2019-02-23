import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int c=0;
        while(n>0)
        {
            int rev = n%10;
            c++;
            n=n/10;
        }
        System.out.print(c);
    }
}