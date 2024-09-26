//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW

//count number of words in string - logically RIGHT - V V NEW N GOOD - REG EX \\s+
import java.util.*;

class program588
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Entered string is : "+str);

        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        
        int iCnt = 0, i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0; i < str.length(); i++)
        {
            if(Arr[i] == ' ')
            {
                iCnt++;
            }
        }
        System.out.println("Number of words are : "+(iCnt+1));
    }
}

