//HASHMAP - CHAPPAL STAND / MALL MADHE PISHVI THEUN TOKEN GHENE 

// FREQ OF EACH WORD

//ASKED IN INTERVIEWS

//LAST PROBLEM STATEMENT OF THE BATCH

import java.util.*;

class program674
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Arr[] = str.split(" ");  //TOKENS FORMED

        for(String a : Arr)
        {
            System.out.println(a);
        }

        


        

    }
}
