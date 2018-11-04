import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());
        long g=1;
        for(int j=1;j<=number;j++)
        {
            g=g*j;
        }
        System.out.println(g);
    }
}