//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW

//count number of white spaces in string 
import java.util.*;

class program586
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Entered string is : "+str);

        char Arr[] = str.toCharArray(); //To convert string to character array

        int iCnt = 0, i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCnt++;
            }
        }
        System.out.println("Number of white spaces are : "+iCnt);
    }
}

