//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW
//reverse - NOTE : REVERSE IS AVAILABLE ON STRING BUFFER - THEREFORE MUTABLE
import java.util.*;

class program604
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);

        sb = sb.reverse();

        System.out.println("Reverse string is : "+sb);

    }
}

