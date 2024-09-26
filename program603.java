//STRING - VVIMP - 100% GUARANTEE Q WILL COME IN INTERVIEW
//frequency of character in string
import java.util.*;

class program600
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Enter character that you want to search : ");
        String s = sobj.nextLine();

        char ch = s.charAt(0);
        
        char Arr[] = str.toCharArray();
        int iCnt = 0, i = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                iCnt++;
            }
        }

        System.out.println("Frequency of that character is : "+iCnt);

    }
}

