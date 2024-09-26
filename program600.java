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

        
        for(i = 0; i < Arr.length; i++)
        {
 
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                iMaxIndex = i;
            }
        }
        System.out.println("Largest word is : "+Arr[iMaxIndex]);
        System.out.println("Length of Largest word is : "+iMax);




    }
}

