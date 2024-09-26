//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW
//length of each word in a string

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

        for(String  S : Arr)
        {
            System.out.println("Length of "+S+" is " +S.length());
        }
        /*
         for(i = 0; i < Arr.length; i++)
         {
            System.out.println("Length of "+Arr[i]+" is" +Arr[i].length());

         }
         */
    }
}

