import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());
        akash obj = new akash();
        obj.calculate(i,j);
    }
}
class akash
{
    int fact;
    public void calculate(int i, int j)
    {
        if(i>10)
        {
        for(int k=i; k<j; k++)
        {
            fact=0;
            for(int m=2;m<k/2;m++)
            {
                if(k%m==0)
                {
                    fact=1;
                    break;
                }
            }
            if(fact==0)
            {
                System.out.print(k+" ");
            }
        }
    }
    else if(i<=10 && j<=10)
    {
         for(int k=i; k<j; k++)
        {
            fact=0;
            for(int m=1;m<j;m++)
            {
                if(k%m==0)
                {
                    fact++;
                }
                
            }
            //System.out.print(fact+" ");
            if(fact==2)
            {
                System.out.print(k+" ");
                }
            }
        }
    }
}