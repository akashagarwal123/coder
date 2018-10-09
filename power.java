import java.util.*;
class Main
{ 
public static void main (String[] args) 
{
   Scanner sc = new Scanner(System.in);
    //Enter the Number
    int num = sc.nextInt();
    //Enter the power
    int powr =  sc.nextInt();
     
     int c = (int)Math.pow(num,powr);
     System.out.println(c);
}
}