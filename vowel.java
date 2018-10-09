
import java.io.*;
class Main
{ 
public static void main (String[] args)throws IOException 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //Enter the Character
    char ch = (char)br.read();
    int d = (int)ch;//Type casting into Integer
    if((d>=65 && d<=90)||(d>=97 && d<=122))
    {
        if(ch == 'A'|| ch == 'a'|| ch == 'E'|| ch == 'e'|| ch == 'I'|| ch == 'i'|| ch == 'O'|| ch == 'o'||
        ch == 'U'|| ch == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
           System.out.println("Consonant");
        }
    }
    else
    {
        System.out.println("invalid");
    }
}
}