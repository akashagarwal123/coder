import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        akash obj = new akash();
        obj.cal(n);
    }
}
class akash
{
    public void cal(int n)
    {
        Stack<Integer> s = new Stack<Integer>();
       while(n>0)
       {
          int  rev  = n%10;
          if(rev%2!=0)
          {
          s.add(rev);
          }
          n=n/10;
       }
        while(s.size()!=0)
        {
            System.out.print(s.pop()+" ");
        }
    }
}