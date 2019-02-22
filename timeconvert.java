import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        akash obj = new akash();
        if(n<60)
        {
            System.out.print(0+" "+obj.minute(n));
        }
        else
        {
            System.out.print(obj.hour(n)+" "+obj.minute(n)); 
        }
    }
}
class akash
{
    public int hour(int n)
    {
        if(n<60)
        {
            return(n);
        }
        else
        {
            return hour(n/60);
        }
     }
    public int minute(int n)
    {
        if(n<60)
        {
            return(n);
        }
        else
        {
            return minute(n%60);
        }
    }
}