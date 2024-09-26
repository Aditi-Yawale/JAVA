//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW

//count number of white spaces in string 
import java.util.*;

class program588
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Entered string is : "+str);

        int iCnt = 0, i = 0;

        //charAt method - gives character at the specific index of a string
        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                iCnt++;
            }
        }
        System.out.println("Number of white spaces are : "+iCnt);
    }
}

