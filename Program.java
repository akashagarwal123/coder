import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char ch = (char)br.read();
	int d = (int)ch;
	Solution obj = new Solution();
	obj.check(d);
	}
}
class Solution
{
    //creating constructor
    public Solution()
    {}
    /*creating a function ceck which checks
    whether an inputted character is a vowel,
    consonant or an or an invalid entry.*/
    public void check(int d)
    {
        for(int i = 65;i<=90;i++)
        {
            if(d == i||d == (i+32))
            {
                System.out.println("Alphabet");
                break;
            }
            else
            {
                System.out.println("No");
                break;
            }
        }
        
    }
}