import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       //Enter the Number
       long num = Long.parseLong(br.readLine());
       
       long f=1;
       
       for(long i=1;i<=5;i++)
       {
           f=num*i;
           System.out.print(f+" ");
       }
       
    }
}