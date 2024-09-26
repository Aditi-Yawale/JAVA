//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW
//reverse each word in a string

import java.util.*;

class program607
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String Arr[] = str.split(" ");

        StringBuffer temp = null;
        StringBuffer finalstr = new StringBuffer("");

        for(String s : Arr)
        {
            temp = new StringBuffer(s);
            temp = temp.reverse();

            finalstr.append(temp);
            finalstr.append(" ");

        }

        System.out.println(finalstr);
    }
}

