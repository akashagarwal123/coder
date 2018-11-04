import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Enter the Number
        int num = Integer.parseInt(br.readLine());
        int rev;
        while(num!=0)
        {
            rev=num%10;
            System.out.print(rev);
            num=num/10;
        }
    }
}