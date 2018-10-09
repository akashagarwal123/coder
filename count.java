
import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    BufferedReader br =
      new BufferedReader (new InputStreamReader (System.in));
    int c=0,rev;
    int num = Integer.parseInt (br.readLine ());	//enter the number
     while(num!=0)
     {
         rev = num%10;
         c++;
         num = num/10;
     }
     System.out.println(c);
   
  }
}
