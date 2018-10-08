
import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    BufferedReader br =
      new BufferedReader (new InputStreamReader (System.in));
    int n = Integer.parseInt (br.readLine ());
    if (n > 0)
      {
	System.out.println ("Positive");
      }
    else if (n == 0)
      {
	System.out.println ("Zero");
      }
    else
      {
	System.out.println ("Negative");
      }
  }
}
