import java.util.*;

class program258
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        
        String name = sobj.nextLine();

        System.out.println("String length is "+name.length());

        //JAVA DOES NOT HAVE '\0' IN STRING - USE CIRCULAR BRACKET FOR LENGTH - in case of string!
    
    }
}