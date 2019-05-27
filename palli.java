import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        akash obj = new akash();
        obj.find(s);
    }
}
class akash
{
    public void find(String s)
    {
        char[] ch = s.toCharArray();
        Stack stack = new Stack();
        for(int i=0;i<ch.length;i++)
        {
            stack.add(ch[i]);
        }
        char first = (char)stack.pop();
        while(stack.size()!=1)
        {
            stack.pop();
        }
        char last = (char)stack.pop();
        if(first==last)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}