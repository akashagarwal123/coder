import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     String[] a = s.split(" ",0);
     int d=0;
     char[] ch = a[0].toCharArray();
     char[] dh = a[1].toCharArray();
     int i=0,j=0;
     while(i<ch.length&&j<dh.length)
     {
         if(ch[i]!=dh[j])
         {
             ++d;
         }
         ++i;
         ++j;
     }
     if(d==1)
     {
         System.out.println("yes");
     }
     else
     {
         System.out.println("no");
     }
    }
}