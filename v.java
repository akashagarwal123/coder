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
        int flag=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='A'||ch[i]=='a'||ch[i]=='E'||ch[i]=='e'||ch[i]=='I'||ch[i]=='i'||ch[i]=='O'||ch[i]=='o'||ch[i]=='U'||ch[i]=='u')
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}