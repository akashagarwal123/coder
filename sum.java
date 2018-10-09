import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    BufferedReader br =
      new BufferedReader (new InputStreamReader (System.in));
    int num = Integer.parseInt (br.readLine ());	//enter the range
    int sum = 0;
    for (int i = 0; i <= num; i++)
      {
	sum = sum + i;
      }
    System.out.println (sum);

  }
}
