
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException 
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num1 = Integer.parseInt(br.readLine());//enter the first number
	int num2 = Integer.parseInt(br.readLine());//enter the second number
	int num3 = Integer.parseInt(br.readLine());//enter the third number
	if(num1!=num2 && num1!=num3 && num2!=num3)
	{
	if(num1>num2&&num1>num3)
	{
	    System.out.println(num1);
	}
	else if(num2>num1&&num2>num3)
	{
	    System.out.println(num2);
	}
	else{
	     System.out.println(num3);
	}
	}
	else if(num1 == num2 || num1 == num3 || num2 == num3)
	{
	    if(num1>num2||num1>num3)
	    {
	        System.out.println(num1);
	    }
	    else if(num2>num1||num2>num3)
	    {
	        System.out.println(num2);
	    }
	    else{
	         System.out.println(num3);
	    }
	    
	}
	}
}
