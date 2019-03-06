import java.util.*;
class Main
{
    public static void sub(int n, int m)
    {
        int diff = Math.abs(n-m);
        System.out.println(diff);
    }
    public static void main(String[] args)
    {
     String a[] = new String[2];
     a= input();
     if(a[0]!="EOF" && a[1]!="EOF")
     {
         int c = Integer.parseInt(a[0]);
         int b = Integer.parseInt(a[1]);
         sub(c,b);
         main(a);
        
     }
     else
     {
         System.out.println("");
     }
    }
    public static String[] input()
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        String ar[] = new String[2];
        ar[0] = n;
        ar[1] = m;
        return ar;
    }
}