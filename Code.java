import java.io.*;
import java.util.*;
public class Code
{
  public static void main (String[]args) throws IOException
  {
    BufferedReader br =
      new BufferedReader (new InputStreamReader (System.in));
    char ch = (char) br.read ();
    if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'O'
	|| ch == 'o' || ch == 'I' || ch == 'i' || ch == 'U' || ch == 'u')
      {
	System.out.println ("Vowel");
      }
    else
      {
	System.out.println ("Consonant");
      }

  }
}