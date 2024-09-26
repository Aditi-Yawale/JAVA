//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW


import java.util.*;

class program596
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Arr[] = str.split(" ");

        System.out.println("Number of words are : "+Arr.length);
    }
}

