import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int flag=0;
        for(int i=1;i<11;i++)
        {
            if(i==n)
            {
                flag=1;
                System.out.println("yes");
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==0)
        {
            System.out.println("no");
        }
    }
}