//to convert string to character array - use function toCharArray()

import java.util.*;

class program261
{

    public static int CountCapital(String str)
    {
        char Arr[] = str.toCharArray(); //IMP
        int i = 0, iCnt = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : "); 
        String name = sobj.nextLine();

        char Arr[] = name.toCharArray();

        int iRet = 0;
        iRet = CountCapital(name);

        System.out.println("Number of capital characters are : "+iRet);
        
    }
}
