import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(br.readLine());
        akash obj = new akash();
        obj.cal(n);
    }
}
class akash
{
    public void cal(int n)
    {
       int  i=0,num;
        while(i>=0)
        {
            int q =(int)Math.pow(2,i);
            if(q==n)
            {
                num = i;
                break;
            }
            ++i;
        }
        int dis =(int)Math.pow(2,(i+1));
        System.out.println(dis);
    }
}