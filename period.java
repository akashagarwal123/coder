import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       //Enter the string 
       String str = br.readLine();
       
       String str1 = str+".";
       System.out.println(str1);
    }
}