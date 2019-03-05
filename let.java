import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        akash obj = new akash();
        obj.cal(s);
    }
}
class akash
{
    public void cal(String s)
    {
        char[] ch = s.toCharArray();
        if((ch.length%2)!=0)
        {
        int middle = (ch.length)/2;
        ch[middle] = '*';
        String st = new String(ch);
        System.out.println(st);
        }
        else
        {
        int middle = (ch.length)/2;
        ch[middle-1]='*';
        ch[middle] = '*';
        String st = new String(ch);
        System.out.println(st);   
        }
    }
}