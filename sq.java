import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        akash obj = new akash();
        obj.cal(n,m);
    }
}
class akash
{
    public void cal(int n, int m)
    {
       int s = n*m;
       double d =Math.sqrt(s);
       if((d-Math.floor(d))==0)
       {
           System.out.println("yes");
       }
       else
       {
           System.out.println("no");
       }
    }
}