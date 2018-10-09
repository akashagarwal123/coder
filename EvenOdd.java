import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    //Enter the number you want to check
	    int n = Integer.parseInt(br.readLine());
	   if(n>0)
	   {
	    if(n%2 == 0)
	    {
	        System.out.println("Even");
	    }
	    else
	    {
	         System.out.println("Odd");
        }
	   }
	   else{
	       	         System.out.println("invalid");
	   }
	}
}