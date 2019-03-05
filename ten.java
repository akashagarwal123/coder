import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%10==0)
        {
            System.out.println(n);
        }
        else
        {
            while(n>0)
            {
                if(n%10==0)
                {
                    System.out.println(n);
                    break;
                }
                ++n;
            }
        }
    }
}