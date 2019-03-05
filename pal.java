import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        akash obj = new akash();
        obj.cal(s);
    }
}
class akash
{
    public void cal(String s )
    {
        char[] ch = s.toCharArray();
        int c = (ch.length)/2;
        int i=0,j=ch.length-1;
        int flag=0;
        while(i<c && j>=c)
        {
            if(ch[i]==ch[j])
            {
                flag=0;
            }
            else
            {
                flag=1;
                break;
            }
            ++i;
            --j;
        }
        if(flag==1)
        {
            System.out.println("no");
        }
        else
        {
             System.out.println("yes");
        }
        
    }
}