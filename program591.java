//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW

//count number of words in string - logically wrong
import java.util.*;

class program588
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("String before replacement : "+str);


        str = str.replaceAll("a", "z");

        System.out.println("String after replacement : "+str);


    }
}

