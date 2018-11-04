 import java.util.*;
 class Main

    {

        public static void main(String[] args) 

         {
             Scanner sc = new Scanner(System.in);

            int n, count = 0, a, b, c, sum = 0,start,end;
            
             start = sc.nextInt();
             end = sc.nextInt();
            for(int i = start; i < end; i++)

            {

                n = i;

                while(n > 0)

                {

                    b = n % 10;

                    sum = sum + (b * b * b);

                    n = n / 10;

                }

                if(sum == i)

                {

                    System.out.print(i+" ");

                }

                sum = 0;

            }

        }

    }