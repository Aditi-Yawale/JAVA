//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW
//display largest word of string

import java.util.*;

class program600
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");
        
        String Arr[] = str.split(" ");

        int iMax = 0;
        int i = 0;
        int iMaxIndex = 0;
        String MaxStr = null;
        
        for(i = 0; i < Arr.length; i++)
        {
 
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                MaxStr = Arr[i];
            }
        }
        System.out.println("Largest word is : "+MaxStr);
        System.out.println("Length of Largest word is : "+iMax);




    }
}

