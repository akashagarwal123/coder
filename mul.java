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
       
           if(n%13==0)
           {
               System.out.print("yes");
           }
           else
           {
               System.out.print("no");
           }
       }
}