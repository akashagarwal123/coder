import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int number, originalNumber, remainder, result = 0, n = 0 ;

    number = Integer.parseInt(br.readLine());

     originalNumber = number;
    
    while (originalNumber != 0)
    {
        originalNumber /= 10;
        ++n;
    }

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber%10;
        result += Math.pow(remainder, n);
        originalNumber /= 10;
    }

    if(result == number)
        System.out.println("yes");
    else
                System.out.println("no");
}
}
