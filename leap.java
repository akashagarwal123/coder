
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException 
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int year = Integer.parseInt(br.readLine());//enter the year
      if(year%4 == 0)
      {
          System.out.println("yes");
      }
      else{
          System.out.println("no");
      }
	
	}
}
