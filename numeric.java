import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        String s = sc.nextLine();
        String str=s.replaceAll("\\s","");
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int d=(int)ch[i];
            if(d>=48&&d<=57)
            {
                flag=1;
            }
            else
            {
                System.out.println("NO");
                break;
            }
        }
        if(flag==1)
        {
          System.out.println("YES");  
        }
    }
}