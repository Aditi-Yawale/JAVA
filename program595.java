//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW


import java.util.*;

class program588
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        int i = 0;

        System.out.println("Words from the string are : ");
        for(String s : Arr) //for each loop
        {
            System.out.println(s);
        }
    }
}

